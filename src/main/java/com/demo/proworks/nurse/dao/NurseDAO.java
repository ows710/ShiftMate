package com.demo.proworks.nurse.dao;

import java.util.List;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.cmmn.dao.ProworksDefaultAbstractDAO;
import com.demo.proworks.nurse.vo.NurseVo;
import com.demo.proworks.ward.vo.WardVo;

/**
 * @subject		: 간호사 정보 관련 처리를 담당하는 DAO
 * @description	: 간호사 정보 관련 처리를 담당하는 DAO
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Repository("nurseDAO")
public class NurseDAO extends ProworksDefaultAbstractDAO {

	/**
	 * 간호사 정보를 등록 처리한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
    public int insertNurse(NurseVo nurseVo) throws ElException {
        return insert("com.demo.proworks.nurse.insertNurse", nurseVo);
    }
    
    /**
     * 간호사 정보를 갱신 처리한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int updateNurse(NurseVo nurseVo) throws ElException {
        return update("com.demo.proworks.nurse.updateNurse", nurseVo);
    }
    
    /**
     * 간호사 정보를 삭제 처리한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int deleteNurse(NurseVo nurseVo) throws ElException {
    	return delete("com.demo.proworks.nurse.deleteNurse", nurseVo);
    }
    
    /**
     * 간호사 정보를 상세 조회한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 간호사 정보 NurseVo
     * @throws ElException
     */
    public NurseVo selectNurse(NurseVo nurseVo) throws ElException {
        return (NurseVo) selectByPk("com.demo.proworks.nurse.selectNurse", nurseVo);
    }
    
    /**
     * 간호사 정보 목록을 조회한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 간호사 정보 목록 List<NurseVo>
     * @throws ElException
     */
    public List<NurseVo> selectListNurse(NurseVo nurseVo) throws ElException {
        return list("com.demo.proworks.nurse.selectListNurse", nurseVo);
    }
    
    /**
     * 간호사 정보 목록 건수를 조회한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 간호사 정보 목록 건수 long
     * @throws ElException
     */
    public long selectListCountNurse(NurseVo nurseVo) throws ElException {
        return (Long) selectByPk("com.demo.proworks.nurse.selectListCountNurse", nurseVo);
    }
    
    /**
     * 병동 정보 목록을 조회한다.
     * @param searchKeyHm 조건 검색 정보 HashMap
     * @return 병동 정보 목록 List<WardVo>
     * @throws ElException
     */
    public List<WardVo> selectListWard(HashMap searchKeyHm) throws ElException {
    	return list("com.demo.proworks.nurse.selectListWard", searchKeyHm);
    }
} 