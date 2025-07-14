package com.demo.proworks.nurse.web;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.proworks.nurse.service.NurseService;
import com.demo.proworks.nurse.vo.NurseVo;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.log.AppLog;

/**
 * @subject : 간호사 정보 관련 처리를 하는 컨트롤러
 * @description : 간호사 정보 관련 처리를 하는 컨트롤러
 * @author : 개발팀
 * @since : 2025/07/10
 * @modification ===========================================================
 *               DATE AUTHOR NOTE
 *               ===========================================================
 *               2025/07/10 개발팀 최초 생성
 * 
 */
@Controller
@RequestMapping(value = "/nurse")
public class NurseController {

	@Resource(name = "nurseServiceImpl")
	private NurseService nurseService;

	/**
	 * 페이징을 처리하여 간호사 목록을 조회한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 목록 정보 NurseListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoNurseList")
	@RequestMapping(value = "DmoNurseList")
	@ElDescription(sub = "간호사 목록 조회", desc = "페이징을 처리하여 간호사 목록을 조회한다.")
	public HashMap<String, Object> selectNurseList(NurseVo nurseVo) throws Exception {
		AppLog.debug("간호사 목록 조회 로그 테스트 : " + nurseVo);

		HashMap<String, Object> result = new HashMap<>();

		// 페이지 기본값 설정
		if (nurseVo.getPageIndex() <= 0) {
			nurseVo.setPageIndex(1);
		}
		if (nurseVo.getPageSize() <= 0) {
			nurseVo.setPageSize(10);
		}

		List<NurseVo> nurseList = nurseService.selectListNurse(nurseVo);
		AppLog.debug("목록 조회 : " + nurseList);
		long totCnt = nurseService.selectListCountNurse(nurseVo);
		AppLog.debug("목록 카운트 : " + totCnt);

		result.put("result", "success");
		result.put("nurseVoList", nurseList);
		result.put("totalCount", totCnt);

		return result;
	}

	/**
	 * 간호사 정보를 상세 조회한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 NurseListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoNurseView")
	@RequestMapping(value = "DmoNurseView")
	@ElDescription(sub = "간호사 상세 조회", desc = "간호사 정보를 상세 조회한다.")
	public HashMap<String, Object> selectNurseView(NurseVo nurseVo) throws Exception {
		HashMap<String, Object> result = new HashMap<>();

		try {
			NurseVo selectNurseVo = nurseService.selectNurse(nurseVo);

			if (selectNurseVo != null) {
				result.put("result", "success");
				result.put("nurseVo", selectNurseVo);
			} else {
				result.put("result", "error");
				result.put("message", "간호사 정보를 찾을 수 없습니다.");
			}
		} catch (Exception e) {
			result.put("result", "error");
			result.put("message", "간호사 정보 조회 중 오류가 발생했습니다: " + e.getMessage());
		}

		return result;
	}

	/**
	 * 간호사 정보를 등록 처리한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoNurseIns")
	@RequestMapping(value = "DmoNurseIns")
	@ElDescription(sub = "간호사 등록 처리", desc = "간호사 정보를 등록 처리한다.")
	public HashMap<String, Object> insertNurse(NurseVo nurseVo) throws Exception {
		HashMap<String, Object> result = new HashMap<>();

		try {
			AppLog.debug("간호사 등록 파라미터: " + nurseVo.toString());
			// nurseId 자동 세팅
			if (nurseVo.getNurse_id() == 0) {
				nurseVo.setNurse_id(nurseService.getNextNurseId());
			}
			// 생성일, 수정일 자동 설정
			if (nurseVo.getCreated_at() == null || nurseVo.getCreated_at().isEmpty()) {
				nurseVo.setCreated_at(getCurrentDate());
			}
			if (nurseVo.getUpdated_at() == null || nurseVo.getUpdated_at().isEmpty()) {
				nurseVo.setUpdated_at(getCurrentDate());
			}
			// 병동ID 기본값 설정 (내과병동)
			if (nurseVo.getWard_id() == 0) {
				nurseVo.setWard_id(1);
			}

			AppLog.debug("간호사 저장 파라미터: " + nurseVo.toString());

			int insertCount = nurseService.insertNurse(nurseVo);

			if (insertCount > 0) {
				result.put("result", "success");
				result.put("message", "간호사 정보가 등록되었습니다.");
			} else {
				result.put("result", "error");
				result.put("message", "등록에 실패했습니다.");
			}
		} catch (SQLException e) {
			result.put("result", "error");
			result.put("message", "등록 중 오류가 발생했습니다: " + e.getMessage());
		}

		return result;
	}

	/**
	 * 간호사 정보를 갱신 처리한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoNurseUpd")
	@RequestMapping(value = "DmoNurseUpd")
	@ElDescription(sub = "간호사 갱신 처리", desc = "간호사 정보를 갱신 처리한다.")
	public HashMap<String, Object> updateNurse(NurseVo nurseVo) throws Exception {
		HashMap<String, Object> result = new HashMap<>();

		try {
			// 수정일 자동 설정
			nurseVo.setUpdated_at(getCurrentDate());

			int updateCount = nurseService.updateNurse(nurseVo);

			if (updateCount > 0) {
				result.put("result", "success");
				result.put("message", "간호사 정보가 수정되었습니다.");
			} else {
				result.put("result", "error");
				result.put("message", "수정에 실패했습니다.");
			}
		} catch (Exception e) {
			result.put("result", "error");
			result.put("message", "수정 중 오류가 발생했습니다: " + e.getMessage());
		}

		return result;
	}

	/**
	 * 간호사 정보를 삭제 처리한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoNurseDel")
	@RequestMapping(value = "DmoNurseDel")
	@ElDescription(sub = "간호사 삭제 처리", desc = "간호사 정보를 삭제 처리한다.")
	public HashMap<String, Object> deleteNurse(NurseVo nurseVo) throws Exception {
		HashMap<String, Object> result = new HashMap<>();

		try {
			int deleteCount = nurseService.deleteNurse(nurseVo);

			if (deleteCount > 0) {
				result.put("result", "success");
				result.put("message", "간호사 정보가 삭제되었습니다.");
			} else {
				result.put("result", "error");
				result.put("message", "삭제에 실패했습니다.");
			}
		} catch (Exception e) {
			result.put("result", "error");
			result.put("message", "삭제 중 오류가 발생했습니다: " + e.getMessage());
		}

		return result;
	}

	/**
	 * 현재 날짜를 YYYY-MM-DD 형식으로 반환한다.
	 * 
	 * @return 현재 날짜 문자열
	 */
	private String getCurrentDate() {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new java.util.Date());
	}
}