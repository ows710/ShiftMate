package com.demo.proworks.ward.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.cmmn.dao.ProworksDefaultAbstractDAO;
import com.demo.proworks.ward.vo.WardVo;

/**
 * @subject		: 병동 정보 관련 처리를 담당하는 DAO
 * @description	: 병동 정보 관련 처리를 담당하는 DAO
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Repository("wardDAO")
public class WardDAO extends ProworksDefaultAbstractDAO {

	/**
	 * 병동 정보를 등록 처리한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
    public int insertWard(WardVo wardVo) throws ElException {
        return insert("com.demo.proworks.ward.insertWard", wardVo);
    }
    
    /**
     * 병동 정보를 갱신 처리한다.
     * @param wardVo 병동 정보 WardVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int updateWard(WardVo wardVo) throws ElException {
        return update("com.demo.proworks.ward.updateWard", wardVo);
    }
    
    /**
     * 병동 정보를 삭제 처리한다.
     * @param wardVo 병동 정보 WardVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int deleteWard(WardVo wardVo) throws ElException {
    	return delete("com.demo.proworks.ward.deleteWard", wardVo);
    }
    
    /**
     * 병동 정보를 상세 조회한다.
     * @param wardVo 병동 정보 WardVo
     * @return 병동 정보 WardVo
     * @throws ElException
     */
    public WardVo selectWard(WardVo wardVo) throws ElException {
        return (WardVo) selectByPk("com.demo.proworks.ward.selectWard", wardVo);
    }
    
    /**
     * 병동 정보 목록을 조회한다.
     * @param wardVo 병동 정보 WardVo
     * @return 병동 정보 목록 List<WardVo>
     * @throws ElException
     */
    public List<WardVo> selectListWard(WardVo wardVo) throws ElException {
        return list("com.demo.proworks.ward.selectListWard", wardVo);
    }
    
    /**
     * 병동 정보 목록 건수를 조회한다.
     * @param wardVo 병동 정보 WardVo
     * @return 병동 정보 목록 건수 long
     * @throws ElException
     */
    public long selectListCountWard(WardVo wardVo) throws ElException {
        return (Long) selectByPk("com.demo.proworks.ward.selectListCountWard", wardVo);
    }
} 