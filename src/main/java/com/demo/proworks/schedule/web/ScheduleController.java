package com.demo.proworks.schedule.web;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.proworks.schedule.service.ScheduleService;
import com.demo.proworks.schedule.vo.ScheduleListVo;
import com.demo.proworks.schedule.vo.ScheduleVo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

/**
 * @subject : 스케줄 정보 관련 처리를 하는 컨트롤러
 * @description : 스케줄 정보 관련 처리를 하는 컨트롤러
 * @author : 개발팀
 * @since : 2025/07/10
 * @modification ===========================================================
 *               DATE AUTHOR NOTE
 *               ===========================================================
 *               2025/07/10 개발팀 최초 생성
 * 
 */
@Controller
public class ScheduleController {

	@Resource(name = "scheduleServiceImpl")
	private ScheduleService scheduleService;

	/**
	 * 페이징을 처리하여 스케줄 목록을 조회한다.
	 * 
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 목록 정보 ScheduleListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleList")
	@RequestMapping(value = "DmoScheduleList")
	@ElDescription(sub = "스케줄 목록 조회", desc = "페이징을 처리하여 스케줄 목록을 조회한다.")
	public ScheduleListVo selectScheduleList(ScheduleVo scheduleVo) throws Exception {
		AppLog.debug("스케줄 목록 조회 로그 테스트 : " + scheduleVo);

		List<ScheduleVo> scheduleList = scheduleService.selectListSchedule(scheduleVo);
		long totCnt = scheduleService.selectListCountSchedule(scheduleVo);

		ScheduleListVo retScheduleVoList = new ScheduleListVo();
		retScheduleVoList.setScheduleVoList(scheduleList);
		retScheduleVoList.setNurseVoList(scheduleService.selectListNurse(new HashMap()));
		retScheduleVoList.setTotalCount(totCnt);

		return retScheduleVoList;
	}

	/**
	 * 스케줄 정보를 상세 조회한다.
	 * 
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 ScheduleListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleView")
	@RequestMapping(value = "DmoScheduleView")
	@ElDescription(sub = "스케줄 상세 조회", desc = "스케줄 정보를 상세 조회한다.")
	public ScheduleListVo selectScheduleView(HttpSession session, HttpServletRequest request) throws Exception {
		String userId = (String) session.getAttribute("userId");

		ScheduleListVo vo = new ScheduleListVo();

		ScheduleVo scheduleVo = new ScheduleVo();

		String json = request.getReader().lines().collect(Collectors.joining());

		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, Object> payload = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
		});
		Map<String, String> selectedDate = objectMapper.convertValue(payload.get("param"),
				new TypeReference<Map<String, String>>() {
				});

		String paramDate = selectedDate.get("date");

		scheduleVo.setNurseId(Integer.parseInt(userId));
		scheduleVo.setShiftDate(paramDate.substring(0, 4) + "-" + paramDate.substring(4) + "-01");

		AppLog.debug("파라미터 : " + scheduleVo);

		vo.setScheduleVoList(scheduleService.selectListSchedule(scheduleVo));

		return vo;
	}

	/**
	 * 스케줄 정보를 상세 조회한다.
	 * 
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 ScheduleListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleViewByDate")
	@RequestMapping(value = "DmoScheduleViewByDate")
	@ElDescription(sub = "스케줄 상세 조회", desc = "스케줄 정보를 상세 조회한다.")
	public ScheduleListVo selectScheduleViewByDate(HttpSession session, HttpServletRequest request) throws Exception {
		String userId = (String) session.getAttribute("userId");

		ScheduleVo scheduleVo = new ScheduleVo();

		String json = request.getReader().lines().collect(Collectors.joining());

		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, Object> payload = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
		});
		Map<String, String> selectedDate = objectMapper.convertValue(payload.get("param"),
				new TypeReference<Map<String, String>>() {
				});

		String paramDate = selectedDate.get("date");

		int year = 2025; // 고정 연도 또는 필요에 따라 파라미터로
		int month = Integer.parseInt(paramDate.substring(0, paramDate.indexOf("월")).trim());
		int day = Integer.parseInt(paramDate.substring(paramDate.indexOf("월") + 1, paramDate.indexOf("일")).trim());

		LocalDate date = LocalDate.of(year, month, day);
		String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		AppLog.debug("날짜 : " + formattedDate);

		scheduleVo.setNurseId(Integer.parseInt(userId));
		scheduleVo.setShiftDate(formattedDate);

		AppLog.debug("파라미터 : " + scheduleVo);

		ScheduleListVo vo = new ScheduleListVo();

		vo.setScheduleVoList(scheduleService.selectScheduleViewByDate(scheduleVo));

		return vo;
	}

	/**
	 * 스케줄 정보를 등록 처리한다.
	 * 
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleIns")
	@RequestMapping(value = "DmoScheduleIns")
	@ElDescription(sub = "스케줄 등록 처리", desc = "스케줄 정보를 등록 처리한다.")
	@ElValidator(errUrl = "")
	public String insertSchedule(HttpServletRequest request) throws Exception {
		String json = request.getReader().lines().collect(Collectors.joining());

		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, Object> payload = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
		});
		Object rawList = payload.get("scheduleListVo");

		List<ScheduleVo> scheduleVoList = objectMapper.convertValue(rawList, new TypeReference<List<ScheduleVo>>() {
		});

		ScheduleListVo scheduleListVo = new ScheduleListVo();
		scheduleListVo.setScheduleVoList(scheduleVoList);

		scheduleService.insertSchedule(scheduleListVo);
		return "스케줄 등록 성공";
	}

	/**
	 * 스케줄 정보를 갱신 처리한다.
	 * 
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleUpd")
	@RequestMapping(value = "DmoScheduleUpd")
	@ElDescription(sub = "스케줄 갱신 처리", desc = "스케줄 정보를 갱신 처리한다.")
	@ElValidator(errUrl = "")
	public String updateSchedule(ScheduleVo scheduleVo) throws Exception {
		scheduleService.updateSchedule(scheduleVo);
		return "스케줄 정보가 갱신되었습니다.";
	}

	/**
	 * 스케줄 정보를 삭제 처리한다.
	 * 
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleDel")
	@RequestMapping(value = "DmoScheduleDel")
	@ElDescription(sub = "스케줄 삭제 처리", desc = "스케줄 정보를 삭제 처리한다.")
	public String deleteSchedule(ScheduleVo scheduleVo) throws Exception {
		scheduleService.deleteSchedule(scheduleVo);
		return "스케줄 정보가 삭제되었습니다.";
	}
}