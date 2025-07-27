package com.demo.proworks.dutyrequest.dao;

import java.util.List;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.cmmn.dao.ProworksDefaultAbstractDAO;
import com.demo.proworks.dutyrequest.vo.DutyRequestVo;
import com.demo.proworks.nurse.vo.NurseVo;

/**
 * @subject : 근무신청 정보 관련 처리를 담당하는 DAO
 * @description : 근무신청 정보 관련 처리를 담당하는 DAO
 * @author : 개발팀
 * @since : 2025/07/10
 * @modification ===========================================================
 *               DATE AUTHOR NOTE
 *               ===========================================================
 *               2025/07/10 개발팀 최초 생성
 * 
 */
@Repository("dutyRequestDAO")
public class DutyRequestDAO extends ProworksDefaultAbstractDAO {

	/**
	 * 근무신청 정보를 등록 처리한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	public int insertDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		return insert("com.demo.proworks.dutyrequest.insertDutyRequest", dutyRequestVo);
	}

	/**
	 * 근무신청 정보를 갱신 처리한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	public int updateDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		return update("com.demo.proworks.dutyrequest.updateDutyRequest", dutyRequestVo);
	}

	/**
	 * 근무신청 정보를 삭제 처리한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
	public int deleteDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		return delete("com.demo.proworks.dutyrequest.deleteDutyRequest", dutyRequestVo);
	}

	/**
	 * 근무신청 정보를 상세 조회한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 DutyRequestVo
	 * @throws ElException
	 */
	public DutyRequestVo selectDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		return (DutyRequestVo) selectByPk("com.demo.proworks.dutyrequest.selectDutyRequest", dutyRequestVo);
	}

	/**
	 * 근무신청 정보 목록을 조회한다.
	 * 
	 * @param userId 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 목록 List<DutyRequestVo>
	 * @throws ElException
	 */
	public List<DutyRequestVo> selectListDutyRequest(String userId) throws ElException {
		return list("com.demo.proworks.dutyrequest.selectListDutyRequest", userId);
	}

	/**
	 * 근무신청 정보 목록 건수를 조회한다.
	 * 
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountDutyRequest(DutyRequestVo dutyRequestVo) throws ElException {
		return (Long) selectByPk("com.demo.proworks.dutyrequest.selectListCountDutyRequest", dutyRequestVo);
	}

	/**
	 * 간호사 정보 목록을 조회한다.
	 * 
	 * @param searchKeyHm 조건 검색 정보 HashMap
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws ElException
	 */
	public List<NurseVo> selectListNurse(HashMap searchKeyHm) throws ElException {
		return list("com.demo.proworks.dutyrequest.selectListNurse", searchKeyHm);
	}

	public List<DutyRequestVo> selectListHopeDutyList(String paramDate) {
		return list("com.demo.proworks.dutyrequest.selectListHopeDutyList", paramDate);
	}

	public List<DutyRequestVo> selectHopeDutyListByDate(String paramDate) {
		return list("com.demo.proworks.dutyrequest.selectHopeDutyListByDate", paramDate);
	}
}