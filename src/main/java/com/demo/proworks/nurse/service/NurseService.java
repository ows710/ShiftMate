package com.demo.proworks.nurse.service;

import java.util.List;
import java.util.HashMap;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.nurse.vo.NurseVo;
import com.demo.proworks.ward.vo.WardVo;

/**
 * @subject		: 간호사 정보 관련 처리를 하는 서비스 인터페이스
 * @description	: 간호사 정보 관련 처리를 하는 서비스 인터페이스
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
public interface NurseService {
	
	/**
	 * 페이징을 처리하여 간호사 정보 목록을 조회한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws ElException
	 */
	public List<NurseVo> selectListNurse(NurseVo nurseVo) throws ElException;
	
	/**
	 * 간호사 정보 목록 건수를 조회한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountNurse(NurseVo nurseVo) throws ElException;
	
	/**
	 * 간호사 정보를 상세 조회한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 정보 NurseVo
	 * @throws ElException
	 */
	public NurseVo selectNurse(NurseVo nurseVo) throws ElException;
		
	/**
	 * 간호사 정보를 등록 처리한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int insertNurse(NurseVo nurseVo) throws Exception;
	
	/**
	 * 간호사 정보를 갱신 처리한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int updateNurse(NurseVo nurseVo) throws Exception;
	
	/**
	 * 간호사 정보를 삭제 처리한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int deleteNurse(NurseVo nurseVo) throws Exception;
	
	/**
	 * 병동 정보 목록을 조회한다.
	 * @param searchKeyHm 조건 검색 정보 HashMap 
	 * @return 병동 정보 목록 List<WardVo>
	 * @throws Exception
	 */
	public List<WardVo> selectListWard(HashMap searchKeyHm) throws Exception;

    /**
     * 신규 간호사 ID를 생성한다.
     * @return 다음 nurse_id
     * @throws Exception
     */
    public int getNextNurseId() throws Exception;
} 