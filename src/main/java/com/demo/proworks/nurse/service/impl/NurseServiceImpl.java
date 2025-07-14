package com.demo.proworks.nurse.service.impl;

import java.util.List;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.nurse.dao.NurseDAO;
import com.demo.proworks.nurse.service.NurseService;
import com.demo.proworks.nurse.vo.NurseVo;
import com.demo.proworks.ward.vo.WardVo;

/**
 * @subject		: 간호사 정보 관련 처리를 담당하는 서비스 구현체
 * @description	: 간호사 정보 관련 처리를 담당하는 서비스 구현체
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Service("nurseServiceImpl")
public class NurseServiceImpl implements NurseService {
	
    @Resource(name="nurseDAO")
    private NurseDAO nurseDAO;

    /**
     * 페이징을 처리하여 간호사 정보 목록을 조회한다.
     * @process
     * 1. 간호사 정보 목록을 조회한다.
     * 2. 조회 결과를 List<NurseVo> 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws ElException
     */
	public List<NurseVo> selectListNurse(NurseVo nurseVo) throws ElException {
		List<NurseVo> list = nurseDAO.selectListNurse(nurseVo);	
		return list;
	}
	
	/**
	 * 간호사 정보 목록 건수를 조회한다.
     * @process
     * 1. 간호사 정보 목록 건수를 조회한다.
     * 2. 조회 결과를 long 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountNurse(NurseVo nurseVo) throws ElException {
		return nurseDAO.selectListCountNurse(nurseVo);
	}

    /**
	 * 간호사 정보를 상세 조회한다.
     * @process
     * 1. 간호사 정보를 상세 조회한다.
     * 2. 조회 결과를 NurseVo 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 NurseVo
	 * @throws ElException
     */
	public NurseVo selectNurse(NurseVo nurseVo) throws ElException {
		NurseVo resultVO = nurseDAO.selectNurse(nurseVo);
        return resultVO;
	}

    /**
	 * 간호사 정보를 등록 처리한다.
     * @process
     * 1. 간호사 정보를 등록 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int insertNurse(NurseVo nurseVo) throws ElException {
        int iRet = nurseDAO.insertNurse(nurseVo);
        return iRet;
	}
	
    /**
	 * 간호사 정보를 갱신 처리한다.
     * @process
     * 1. 간호사 정보를 갱신 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
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
     * @process
     * 1. 간호사 정보를 삭제 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int deleteNurse(NurseVo nurseVo) throws ElException {
		int del = nurseDAO.deleteNurse(nurseVo);
		return del;
	}
	
    /**
	 * 병동 정보 목록을 조회한다.
     * @process
     * 1. 병동 정보 목록을 조회한다.
     * 2. 조회 결과를 List<WardVo> 타입으로 리턴한다.
	 * @param searchKeyHm 조건 검색 정보 HashMap 
	 * @return 병동 정보 목록 List<WardVo>
	 * @throws ElException
     */
	public List<WardVo> selectListWard(HashMap searchKeyHm) throws ElException {
		return nurseDAO.selectListWard(searchKeyHm);
	}

    @Override
    public int getNextNurseId() throws Exception {
        Integer maxId = nurseDAO.selectMaxNurseId();
        if (maxId == null) {
            return 1;
        }
        return maxId + 1;
    }
} 