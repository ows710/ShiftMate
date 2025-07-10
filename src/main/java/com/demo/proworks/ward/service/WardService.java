package com.demo.proworks.ward.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.ward.vo.WardVo;

/**
 * @subject		: 병동 정보 관련 처리를 하는 서비스 인터페이스
 * @description	: 병동 정보 관련 처리를 하는 서비스 인터페이스
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
public interface WardService {
	
	/**
	 * 페이징을 처리하여 병동 정보 목록을 조회한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 병동 정보 목록 List<WardVo>
	 * @throws ElException
	 */
	public List<WardVo> selectListWard(WardVo wardVo) throws ElException;
	
	/**
	 * 병동 정보 목록 건수를 조회한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 병동 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountWard(WardVo wardVo) throws ElException;
	
	/**
	 * 병동 정보를 상세 조회한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 병동 정보 WardVo
	 * @throws ElException
	 */
	public WardVo selectWard(WardVo wardVo) throws ElException;
		
	/**
	 * 병동 정보를 등록 처리한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int insertWard(WardVo wardVo) throws Exception;
	
	/**
	 * 병동 정보를 갱신 처리한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int updateWard(WardVo wardVo) throws Exception;
	
	/**
	 * 병동 정보를 삭제 처리한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int deleteWard(WardVo wardVo) throws Exception;
} 