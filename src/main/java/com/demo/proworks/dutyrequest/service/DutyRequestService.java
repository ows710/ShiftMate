package com.demo.proworks.dutyrequest.service;

import java.util.List;
import java.util.HashMap;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.dutyrequest.vo.DutyRequestVo;
import com.demo.proworks.nurse.vo.NurseVo;

/**
 * @subject : 근무신청 정보 관련 처리를 하는 서비스 인터페이스
 * @description : 근무신청 정보 관련 처리를 하는 서비스 인터페이스
 * @author : 개발팀
 * @since : 2025/07/10
 * @modification ===========================================================
 *               DATE AUTHOR NOTE
 *               ===========================================================
 *               2025/07/10 개발팀 최초 생성
 * 
 */
public interface DutyRequestService {

	/**
	 * 근무신청 정보 목록을 조회한다.
	 * 
	 * @param userId 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 목록 List<DutyRequestVo>
	 * @throws ElException
	 */
	public List<DutyRequestVo> selectListDutyRequest(String userId) throws ElException;

	/**
	 * 근무신청 정보 목록 건수를 조회한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountDutyRequest(DutyRequestVo dutyRequestVo) throws ElException;

	/**
	 * 근무신청 정보를 상세 조회한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 DutyRequestVo
	 * @throws ElException
	 */
	public DutyRequestVo selectDutyRequest(DutyRequestVo dutyRequestVo) throws ElException;

	/**
	 * 근무신청 정보를 등록 처리한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int insertDutyRequest(DutyRequestVo dutyRequestVo) throws Exception;

	/**
	 * 근무신청 정보를 갱신 처리한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int updateDutyRequest(DutyRequestVo dutyRequestVo) throws Exception;

	/**
	 * 근무신청 정보를 삭제 처리한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int deleteDutyRequest(DutyRequestVo dutyRequestVo) throws Exception;

	/**
	 * 간호사 정보 목록을 조회한다.
	 * 
	 * @param searchKeyHm 조건 검색 정보 HashMap
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws Exception
	 */
	public List<NurseVo> selectListNurse(HashMap searchKeyHm) throws Exception;

	/**
	 * 간호사 정보 목록을 조회한다.
	 * 
	 * @param
	 * @return 간호사 정보 목록 List<DutyVo>
	 * @throws Exception
	 */
	public List<DutyRequestVo> selectHopeDutyList(String paramDate) throws Exception;

	public List<DutyRequestVo> selectHopeDutyListByDate(String paramDate) throws Exception;
}