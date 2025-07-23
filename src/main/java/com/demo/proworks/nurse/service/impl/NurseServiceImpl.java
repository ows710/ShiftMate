package com.demo.proworks.nurse.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.proworks.nurse.dao.NurseDAO;
import com.demo.proworks.nurse.service.NurseService;
import com.demo.proworks.nurse.vo.NurseListVo;
import com.demo.proworks.nurse.vo.NurseVo;
import com.inswave.elfw.exception.ElException;

/**
 * @subject : 간호사 정보 관련 처리를 담당하는 서비스 구현체
 * @description : 간호사 정보 관련 처리를 담당하는 서비스 구현체
 * @author : 개발팀
 * @since : 2025/07/10
 * @modification ===========================================================
 *               DATE AUTHOR NOTE
 *               ===========================================================
 *               2025/07/10 개발팀 최초 생성
 * 
 */
@Service("nurseServiceImpl")
public class NurseServiceImpl implements NurseService {

	@Resource(name = "nurseDAO")
	private NurseDAO nurseDAO;

	/**
	 * 페이징을 처리하여 간호사 정보 목록을 조회한다.
	 * 
	 * @process 1. 간호사 정보 목록을 조회한다. 2. 조회 결과를 List<NurseVo> 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws ElException
	 */
	public List<NurseVo> selectNurseList(NurseVo nurseVo) throws ElException {
		List<NurseVo> list = nurseDAO.selectListNurse(nurseVo);
		return list;
	}

	/**
	 * 간호사 정보를 상세 조회한다.
	 * 
	 * @process 1. 간호사 정보를 상세 조회한다. 2. 조회 결과를 NurseVo 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 NurseVo
	 * @throws ElException
	 */
	public NurseVo selectNurse(NurseVo nurseVo) throws ElException {
		NurseVo resultVO = nurseDAO.selectNurse(nurseVo);

//		if (resultVO == null) {
//			throw new UserException("EL.ERROR.COMM.001"); // 별도의 예외 메시지가 필요한 경우 처리 예시
//		}

		return resultVO;
	}

	/**
	 * 간호사 정보를 등록 처리한다.
	 * 
	 * @process 1. 간호사 정보를 등록 처리한다. 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	public int insertNurse(NurseVo nurseVo) throws ElException {
		int iRet = nurseDAO.insertNurse(nurseVo);
		return iRet;
	}

	/**
	 * 간호사 정보를 다중 등록 처리한다.
	 * 
	 * @process 1. 간호사 정보를 다중 등록 처리한다. 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param nurseListVo 간호사 정보 NurseListVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	public int insertNurseList(NurseListVo nurseListVo) throws ElException {
		int iRet = 0;

		for (NurseVo nurseVo : nurseListVo.getNurseVoList()) {
			iRet += nurseDAO.insertNurse(nurseVo);
		}

		return iRet;
	}

	/**
	 * 간호사 정보를 갱신 처리한다.
	 * 
	 * @process 1. 간호사 정보를 갱신 처리한다. 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	public int updateNurse(NurseVo nurseVo) throws ElException {
		int updRet = nurseDAO.updateNurse(nurseVo);
		return updRet;
	}

	/**
	 * 간호사 정보를 삭제 처리한다.
	 * 
	 * @process 1. 간호사 정보를 삭제 처리한다. 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	public int deleteNurse(NurseVo nurseVo) throws ElException {
		int del = nurseDAO.deleteNurse(nurseVo);
		return del;
	}

}