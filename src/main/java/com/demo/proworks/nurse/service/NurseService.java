package com.demo.proworks.nurse.service;

import java.util.List;

import com.demo.proworks.nurse.vo.NurseListVo;
import com.demo.proworks.nurse.vo.NurseVo;
import com.inswave.elfw.exception.ElException;

/**
 * @subject : 간호사 정보 관련 처리를 담당하는 서비스 인터페이스
 * @description : 간호사 정보 관련 처리를 담당하는 서비스 인터페이스
 * @author : 개발팀
 * @since : 2025/07/10
 * @modification ===========================================================
 *               DATE AUTHOR NOTE
 *               ===========================================================
 *               2025/07/10 개발팀 최초 생성
 * 
 */
public interface NurseService {

	/**
	 * 페이징을 처리하여 간호사 정보 목록을 조회한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws ElException
	 */
	List<NurseVo> selectNurseList(NurseVo nurseVo) throws ElException;

	/**
	 * 간호사 정보를 상세 조회한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 NurseVo
	 * @throws ElException
	 */
	NurseVo selectNurse(NurseVo nurseVo) throws ElException;

	/**
	 * 간호사 정보를 등록 처리한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	int insertNurse(NurseVo nurseVo) throws ElException;

	/**
	 * 간호사 정보를 다중 등록 처리한다.
	 * 
	 * @param nurseListVo 간호사 정보 NurseListVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	int insertNurseList(NurseListVo nurseListVo) throws ElException;

	/**
	 * 간호사 정보를 갱신 처리한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	int updateNurse(NurseVo nurseVo) throws ElException;

	/**
	 * 간호사 정보를 삭제 처리한다.
	 * 
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	int deleteNurse(NurseVo nurseVo) throws ElException;
}