package com.demo.proworks.nurse.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.proworks.nurse.service.NurseService;
import com.demo.proworks.nurse.vo.NurseListVo;
import com.demo.proworks.nurse.vo.NurseVo;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.log.AppLog;
import org.springframework.web.bind.annotation.RequestMethod;
import com.inswave.elfw.annotation.ElValidator;

/**
 * 간호사 관리 컨트롤러
 * 
 * @author Inswave
 * @since 2024.01.01
 */
@Controller
public class NurseController {

	@Autowired
	private NurseService nurseService;

	/**
	 * 간호사 목록 조회
	 * 
	 * @param nurseVo 조회 조건
	 * @param request HTTP 요청
	 * @throws Exception 예외
	 */
	@ElService(key = "list")
	@RequestMapping(value = "list")
	@ElDescription(sub = "간호사 목록 조회", desc = "간호사 목록을 조회한다.")
	public NurseListVo selectNurseList(NurseVo nurseVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 목록 조회 시작 ===");

		try {

			// 서비스 호출
			List<NurseVo> nurseList = nurseService.selectNurseList(nurseVo);

			// 응답 데이터 구성
			Map<String, Object> response = new HashMap<>();
			Map<String, Object> elHeader = new HashMap<>();
			elHeader.put("resSuc", true);
			elHeader.put("resMsg", "조회가 완료되었습니다.");
			response.put("elHeader", elHeader);
			response.put("nurseList", nurseList);

			AppLog.debug("간호사 목록 조회 완료 - " + nurseList.size() + "건");

			return null;

		} catch (Exception e) {
			AppLog.error("간호사 목록 조회 실패", e);

			// 에러 응답
			Map<String, Object> response = new HashMap<>();
			Map<String, Object> elHeader = new HashMap<>();
			elHeader.put("resSuc", false);
			elHeader.put("resMsg", "간호사 목록 조회 중 오류가 발생했습니다: " + e.getMessage());
			response.put("elHeader", elHeader);

			return null;
		}
	}

	/**
	 * 간호사 상세 조회
	 * 
	 * @param nurseVo 조회 조건
	 * @param request HTTP 요청
	 * @throws Exception 예외
	 */
	@ElService(key = "view")
	@RequestMapping(value = "view")
	@ElDescription(sub = "간호사 상세 조회", desc = "간호사 상세 정보를 조회한다.")
	@ResponseBody
	public Map<String, Object> selectNurse(NurseVo nurseVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 상세 조회 시작 ===");
		AppLog.debug("조회할 간호사ID: " + nurseVo.getNurseId());

		try {
			// 서비스 호출
			NurseVo nurseInfo = nurseService.selectNurse(nurseVo);

			if (nurseInfo != null) {
				// 응답 데이터 구성
				Map<String, Object> response = new HashMap<>();
				Map<String, Object> elHeader = new HashMap<>();
				elHeader.put("resSuc", true);
				elHeader.put("resMsg", "조회가 완료되었습니다.");
				response.put("elHeader", elHeader);
				response.put("nurseVo", nurseInfo);

				AppLog.debug("간호사 상세 조회 완료: " + nurseInfo.getPosition());
				return response;
			} else {
				// 데이터 없음 응답
				Map<String, Object> response = new HashMap<>();
				Map<String, Object> elHeader = new HashMap<>();
				elHeader.put("resSuc", false);
				elHeader.put("resMsg", "해당 간호사 정보를 찾을 수 없습니다.");
				response.put("elHeader", elHeader);

				return response;
			}

		} catch (Exception e) {
			AppLog.error("간호사 상세 조회 실패", e);

			// 에러 응답
			Map<String, Object> response = new HashMap<>();
			Map<String, Object> elHeader = new HashMap<>();
			elHeader.put("resSuc", false);
			elHeader.put("resMsg", "간호사 상세 조회 중 오류가 발생했습니다: " + e.getMessage());
			response.put("elHeader", elHeader);

			return response;
		}
	}

	/**
	 * 간호사 등록
	 * 
	 * @param nurseVo 등록할 데이터
	 * @param request HTTP 요청
	 * @throws Exception 예외
	 */
	@ElService(key = "insert")
	@RequestMapping(value = "insert")
	@ElDescription(sub = "간호사 등록", desc = "간호사 정보를 등록한다.")
	public NurseVo insertNurse(NurseVo nurseVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 등록 시작 ===");
		AppLog.debug("등록할 간호사: " + nurseVo);

		nurseService.insertNurse(nurseVo);

		return nurseVo;
	}

	/**
	 * 간호사 다중 등록
	 * 
	 * @param nurseVo 등록할 데이터
	 * @param request HTTP 요청
	 * @throws Exception 예외
	 */
	@ElService(key = "insertList")
	@RequestMapping(value = "insertList")
	@ElDescription(sub = "간호사 다중 등록", desc = "간호사 정보를 다중 등록한다.")
	public NurseListVo insertNurseList(NurseListVo nurseListVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 다중 등록 시작 ===");

		nurseService.insertNurseList(nurseListVo);

		return nurseListVo;
	}

	/**
	 * 간호사 수정
	 * 
	 * @param nurseVo 수정할 데이터
	 * @param request HTTP 요청
	 * @throws Exception 예외
	 */
	@ElService(key = "update")
	@RequestMapping(value = "update")
	@ElDescription(sub = "간호사 수정", desc = "간호사 정보를 수정한다.")
	@ResponseBody
	public Map<String, Object> updateNurse(NurseVo nurseVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 수정 시작 ===");
		AppLog.debug("수정할 간호사ID: " + nurseVo.getNurseId());

		try {
			// 데이터 검증
			if (nurseVo.getNurseId() == 0) {
				throw new Exception("간호사 ID는 필수 입력 항목입니다.");
			}
			if (nurseVo.getPosition() == null || nurseVo.getPosition().trim().isEmpty()) {
				throw new Exception("직급은 필수 입력 항목입니다.");
			}

			// 서비스 호출
			int result = nurseService.updateNurse(nurseVo);

			if (result > 0) {
				// 성공 응답
				Map<String, Object> response = new HashMap<>();
				Map<String, Object> elHeader = new HashMap<>();
				elHeader.put("resSuc", true);
				elHeader.put("resMsg", "간호사 정보가 수정되었습니다.");
				response.put("elHeader", elHeader);

				AppLog.debug("간호사 수정 완료: " + nurseVo.getPosition());
				return response;
			} else {
				throw new Exception("간호사 수정에 실패했습니다.");
			}

		} catch (Exception e) {
			AppLog.error("간호사 수정 실패", e);

			// 에러 응답
			Map<String, Object> response = new HashMap<>();
			Map<String, Object> elHeader = new HashMap<>();
			elHeader.put("resSuc", false);
			elHeader.put("resMsg", "간호사 수정 중 오류가 발생했습니다: " + e.getMessage());
			response.put("elHeader", elHeader);

			return response;
		}
	}

	/**
	 * 간호사 삭제
	 * 
	 * @param nurseVo 삭제할 데이터
	 * @param request HTTP 요청
	 * @throws Exception 예외
	 */
	@ElService(key = "delete")
	@RequestMapping(value = "delete")
	@ElDescription(sub = "간호사 삭제", desc = "간호사 정보를 삭제한다.")
	@ResponseBody
	public Map<String, Object> deleteNurse(NurseVo nurseVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 삭제 시작 ===");
		AppLog.debug("삭제할 간호사ID: " + nurseVo.getNurseId());

		try {
			// 데이터 검증
			if (nurseVo.getNurseId() == 0) {
				throw new Exception("삭제할 간호사 ID를 입력해주세요.");
			}

			// 서비스 호출
			int result = nurseService.deleteNurse(nurseVo);

			if (result > 0) {
				// 성공 응답
				Map<String, Object> response = new HashMap<>();
				Map<String, Object> elHeader = new HashMap<>();
				elHeader.put("resSuc", true);
				elHeader.put("resMsg", "간호사 정보가 삭제되었습니다.");
				response.put("elHeader", elHeader);

				AppLog.debug("간호사 삭제 완료: " + nurseVo.getNurseId());
				return response;
			} else {
				throw new Exception("간호사 삭제에 실패했습니다.");
			}

		} catch (Exception e) {
			AppLog.error("간호사 삭제 실패", e);

			// 에러 응답
			Map<String, Object> response = new HashMap<>();
			Map<String, Object> elHeader = new HashMap<>();
			elHeader.put("resSuc", false);
			elHeader.put("resMsg", "간호사 삭제 중 오류가 발생했습니다: " + e.getMessage());
			response.put("elHeader", elHeader);

			return response;
		}
	}
}