package com.demo.proworks.ward.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.ward.dao.WardDAO;
import com.demo.proworks.ward.service.WardService;
import com.demo.proworks.ward.vo.WardVo;

/**
 * @subject		: 병동 정보 관련 처리를 담당하는 서비스 구현체
 * @description	: 병동 정보 관련 처리를 담당하는 서비스 구현체
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Service("wardServiceImpl")
public class WardServiceImpl implements WardService {
	
    @Resource(name="wardDAO")
    private WardDAO wardDAO;

    /**
     * 페이징을 처리하여 병동 정보 목록을 조회한다.
     * @process
     * 1. 병동 정보 목록을 조회한다.
     * 2. 조회 결과를 List<WardVo> 타입으로 리턴한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 병동 정보 목록 List<WardVo>
	 * @throws ElException
     */
	public List<WardVo> selectListWard(WardVo wardVo) throws ElException {
		List<WardVo> list = wardDAO.selectListWard(wardVo);	
		return list;
	}
	
	/**
	 * 병동 정보 목록 건수를 조회한다.
     * @process
     * 1. 병동 정보 목록 건수를 조회한다.
     * 2. 조회 결과를 long 타입으로 리턴한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 병동 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountWard(WardVo wardVo) throws ElException {
		return wardDAO.selectListCountWard(wardVo);
	}

    /**
	 * 병동 정보를 상세 조회한다.
     * @process
     * 1. 병동 정보를 상세 조회한다.
     * 2. 조회 결과를 WardVo 타입으로 리턴한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 병동 정보 WardVo
	 * @throws ElException
     */
	public WardVo selectWard(WardVo wardVo) throws ElException {
		WardVo resultVO = wardDAO.selectWard(wardVo);
        return resultVO;
	}

    /**
	 * 병동 정보를 등록 처리한다.
     * @process
     * 1. 병동 정보를 등록 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int insertWard(WardVo wardVo) throws ElException {
        int iRet = wardDAO.insertWard(wardVo);
        return iRet;
	}
	
    /**
	 * 병동 정보를 갱신 처리한다.
     * @process
     * 1. 병동 정보를 갱신 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int updateWard(WardVo wardVo) throws ElException {				
        int updRet = wardDAO.updateWard(wardVo);
        return updRet;   		
	}

    /**
	 * 병동 정보를 삭제 처리한다.
     * @process
     * 1. 병동 정보를 삭제 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int deleteWard(WardVo wardVo) throws ElException {
		int del = wardDAO.deleteWard(wardVo);
		return del;
	}
} 