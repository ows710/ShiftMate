package com.demo.proworks.nurse.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public NurseListVo selectNurseList(HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 목록 조회 시작 ===");

		NurseListVo list = new NurseListVo();
		list.setNurseVoList(nurseService.selectNurseList());

		return list;
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
	public NurseVo selectNurse(NurseVo nurseVo, HttpServletRequest request, HttpSession session) throws Exception {
		AppLog.debug("=== 간호사 상세 조회 시작 ===");
		AppLog.debug("조회할 간호사: " + nurseVo);
		String userId = (String) session.getAttribute("userId");

		nurseVo.setNurseId(Integer.parseInt(userId));
		AppLog.debug("간호사ID:" + nurseVo.getNurseId());

		return nurseService.selectNurse(nurseVo);
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
	public NurseVo updateNurse(NurseVo nurseVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 수정 시작 ===");
		AppLog.debug("수정할 간호사명: " + nurseVo);

		nurseService.updateNurse(nurseVo);

		return nurseVo;
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
	public NurseVo deleteNurse(NurseVo nurseVo, HttpServletRequest request) throws Exception {
		AppLog.debug("=== 간호사 삭제 시작 ===");
		AppLog.debug("삭제할 간호사명: " + nurseVo);

		nurseService.deleteNurse(nurseVo);

		return nurseVo;
	}
}