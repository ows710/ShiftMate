package com.demo.proworks.dutyrequest.service.impl;

import java.util.List;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.dutyrequest.dao.DutyRequestDAO;
import com.demo.proworks.dutyrequest.service.DutyRequestService;
import com.demo.proworks.dutyrequest.vo.DutyRequestVo;
import com.demo.proworks.nurse.vo.NurseVo;

/**
 * @subject		: 근무신청 정보 관련 처리를 담당하는 서비스 구현체
 * @description	: 근무신청 정보 관련 처리를 담당하는 서비스 구현체
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Service("dutyRequestServiceImpl")
public class DutyRequestServiceImpl implements DutyRequestService {
	
    @Resource(name="dutyRequestDAO")
    private DutyRequestDAO dutyRequestDAO;

    /**
     * 페이징을 처리하여 근무신청 정보 목록을 조회한다.
     * @process
     * 1. 근무신청 정보 목록을 조회한다.
     * 2. 조회 결과를 List<DutyRequestVo> 타입으로 리턴한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 목록 List<DutyRequestVo>
	 * @throws ElException
     */
	public List<DutyRequestVo> selectListDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		List<DutyRequestVo> list = dutyRequestDAO.selectListDutyRequest(dutyRequestVo);	
		return list;
	}
	
	/**
	 * 근무신청 정보 목록 건수를 조회한다.
     * @process
     * 1. 근무신청 정보 목록 건수를 조회한다.
     * 2. 조회 결과를 long 타입으로 리턴한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		return dutyRequestDAO.selectListCountDutyRequest(dutyRequestVo);
	}

    /**
	 * 근무신청 정보를 상세 조회한다.
     * @process
     * 1. 근무신청 정보를 상세 조회한다.
     * 2. 조회 결과를 DutyRequestVo 타입으로 리턴한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 DutyRequestVo
	 * @throws ElException
     */
	public DutyRequestVo selectDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		DutyRequestVo resultVO = dutyRequestDAO.selectDutyRequest(dutyRequestVo);
        return resultVO;
	}

    /**
	 * 근무신청 정보를 등록 처리한다.
     * @process
     * 1. 근무신청 정보를 등록 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int insertDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
        int iRet = dutyRequestDAO.insertDutyRequest(dutyRequestVo);
        return iRet;
	}
	
    /**
	 * 근무신청 정보를 갱신 처리한다.
     * @process
     * 1. 근무신청 정보를 갱신 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int updateDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {				
        int updRet = dutyRequestDAO.updateDutyRequest(dutyRequestVo);
        return updRet;   		
	}

    /**
	 * 근무신청 정보를 삭제 처리한다.
     * @process
     * 1. 근무신청 정보를 삭제 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int deleteDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		int del = dutyRequestDAO.deleteDutyRequest(dutyRequestVo);
		return del;
	}
	
    /**
	 * 간호사 정보 목록을 조회한다.
     * @process
     * 1. 간호사 정보 목록을 조회한다.
     * 2. 조회 결과를 List<NurseVo> 타입으로 리턴한다.
	 * @param searchKeyHm 조건 검색 정보 HashMap 
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws ElException
     */
	public List<NurseVo> selectListNurse(HashMap searchKeyHm) throws ElException {
		return dutyRequestDAO.selectListNurse(searchKeyHm);
	}
} 