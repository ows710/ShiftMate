package com.demo.proworks.dutyrequest.web;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.proworks.dutyrequest.service.DutyRequestService;
import com.demo.proworks.dutyrequest.vo.DutyRequestListVo;
import com.demo.proworks.dutyrequest.vo.DutyRequestVo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

/**
 * @subject : 희망근무 신청 관련 처리를 하는 컨트롤러
 * @description : 희망근무 신청 관련 처리를 하는 컨트롤러
 * @author : 개발팀
 * @since : 2025/01/27
 * @modification ===========================================================
 *               DATE AUTHOR NOTE
 *               ===========================================================
 *               2025/01/27 개발팀 최초 생성
 * 
 */
@Controller
public class DutyRequestController {

	@Resource(name = "dutyRequestServiceImpl")
	private DutyRequestService dutyRequestService;

	/**
	 * 희망근무 신청을 처리한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @param scheduleVo    스케줄 정보 ScheduleVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "HopeWorkRequest")
	@RequestMapping(value = "HopeWorkRequest")
	@ElDescription(sub = "희망근무 신청", desc = "희망근무 신청을 처리한다.")
	@ElValidator(errUrl = "")
	public DutyRequestVo requestHopeWork(DutyRequestVo dutyRequestVo, HttpSession session) throws Exception {

		AppLog.debug("=== 희망근무 신청 시작 ===");
		AppLog.debug("희망근무내용: " + dutyRequestVo);

		String userId = (String) session.getAttribute("userId");

		dutyRequestVo.setNurseId(Integer.parseInt(userId));

		dutyRequestService.insertDutyRequest(dutyRequestVo);

		return dutyRequestVo;
	}

	/**
	 * 희망근무 신청을 수정한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @param scheduleVo    스케줄 정보 ScheduleVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "HopeWorkUpdate")
	@RequestMapping(value = "HopeWorkUpdate")
	@ElDescription(sub = "희망근무 수정", desc = "희망근무 신청을 수정한다.")
	@ElValidator(errUrl = "")
	public DutyRequestVo updateHopeWork(DutyRequestVo dutyRequestVo, HttpSession session) throws Exception {

		AppLog.debug("=== 희망근무 수정 시작 ===");
		AppLog.debug("희망근무내용: " + dutyRequestVo);

		String userId = (String) session.getAttribute("userId");

		dutyRequestVo.setNurseId(Integer.parseInt(userId));

		dutyRequestService.updateDutyRequest(dutyRequestVo);

		return dutyRequestVo;
	}

	/**
	 * 희망근무 신청을 삭제한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @param scheduleVo    스케줄 정보 ScheduleVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "HopeWorkDelete")
	@RequestMapping(value = "HopeWorkDelete")
	@ElDescription(sub = "희망근무 삭제", desc = "희망근무 신청을 삭제한다.")
	@ElValidator(errUrl = "")
	public DutyRequestVo deleteHopeWork(DutyRequestVo dutyRequestVo, HttpSession session) throws Exception {

		AppLog.debug("=== 희망근무 삭제 시작 ===");
		AppLog.debug("희망근무내용: " + dutyRequestVo);

		String userId = (String) session.getAttribute("userId");

		dutyRequestVo.setNurseId(Integer.parseInt(userId));

		dutyRequestService.deleteDutyRequest(dutyRequestVo);

		return dutyRequestVo;
	}

	/**
	 * 특정 간호사의 희망근무 목록을 조회한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 목록 DutyRequestListVo
	 * @throws Exception
	 */
	@ElService(key = "HopeWorkList")
	@RequestMapping(value = "HopeWorkList")
	@ElDescription(sub = "희망근무 목록 조회", desc = "특정 간호사의 희망근무 목록을 조회한다.")
	public DutyRequestListVo selectHopeWorkList(HttpSession session) throws Exception {
		AppLog.debug("=== 희망근무 목록 조회 시작 ===");

		String userId = (String) session.getAttribute("userId");

		List<DutyRequestVo> dutyRequestList = dutyRequestService.selectListDutyRequest(userId);

		DutyRequestListVo retDutyRequestListVo = new DutyRequestListVo();
		retDutyRequestListVo.setDutyRequestVoList(dutyRequestList);

		return retDutyRequestListVo;
	}

	/**
	 * 특정 간호사의 희망근무 목록을 조회한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 목록 DutyRequestListVo
	 * @throws Exception
	 */
	@ElService(key = "HopeDutyList")
	@RequestMapping(value = "HopeDutyList")
	@ElDescription(sub = "전체 희망근무 목록 조회", desc = "전체 간호사의 희망근무 목록을 조회한다.")
	public DutyRequestListVo selectHopeList(HttpServletRequest request) throws Exception {
		AppLog.debug("=== 전체 희망근무 목록 조회 시작 ===");

		String json = request.getReader().lines().collect(Collectors.joining());

		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, Object> payload = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
		});
		Map<String, String> selectedDate = objectMapper.convertValue(payload.get("param"),
				new TypeReference<Map<String, String>>() {
				});

		String paramDate = selectedDate.get("date");

		List<DutyRequestVo> dutyRequestList = dutyRequestService.selectHopeDutyList(paramDate);

		DutyRequestListVo retDutyRequestListVo = new DutyRequestListVo();
		retDutyRequestListVo.setDutyRequestVoList(dutyRequestList);

		return retDutyRequestListVo;
	}

	/**
	 * 특정 간호사의 희망근무 목록을 조회한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 목록 DutyRequestListVo
	 * @throws Exception
	 */
	@ElService(key = "HopeDutyListByDate")
	@RequestMapping(value = "HopeDutyListByDate")
	@ElDescription(sub = "전체 희망근무 목록 조회", desc = "전체 간호사의 희망근무 목록을 조회한다.")
	public DutyRequestListVo selectHopeListByDate(DutyRequestVo dutyRequestVo) throws Exception {
		AppLog.debug("=== 해당 날짜 희망근무 목록 조회 시작 ===");

		String paramDate = dutyRequestVo.getReqDate();

		List<DutyRequestVo> dutyRequestList = dutyRequestService.selectHopeDutyListByDate(paramDate);

		DutyRequestListVo retDutyRequestListVo = new DutyRequestListVo();
		retDutyRequestListVo.setDutyRequestVoList(dutyRequestList);

		return retDutyRequestListVo;
	}
}