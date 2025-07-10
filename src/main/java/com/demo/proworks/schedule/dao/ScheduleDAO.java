package com.demo.proworks.schedule.dao;

import java.util.List;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.cmmn.dao.ProworksDefaultAbstractDAO;
import com.demo.proworks.schedule.vo.ScheduleVo;
import com.demo.proworks.nurse.vo.NurseVo;

/**
 * @subject		: 스케줄 정보 관련 처리를 담당하는 DAO
 * @description	: 스케줄 정보 관련 처리를 담당하는 DAO
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Repository("scheduleDAO")
public class ScheduleDAO extends ProworksDefaultAbstractDAO {

	/**
	 * 스케줄 정보를 등록 처리한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
    public int insertSchedule(ScheduleVo scheduleVo) throws ElException {
        return insert("com.demo.proworks.schedule.insertSchedule", scheduleVo);
    }
    
    /**
     * 스케줄 정보를 갱신 처리한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int updateSchedule(ScheduleVo scheduleVo) throws ElException {
        return update("com.demo.proworks.schedule.updateSchedule", scheduleVo);
    }
    
    /**
     * 스케줄 정보를 삭제 처리한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int deleteSchedule(ScheduleVo scheduleVo) throws ElException {
    	return delete("com.demo.proworks.schedule.deleteSchedule", scheduleVo);
    }
    
    /**
     * 스케줄 정보를 상세 조회한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 스케줄 정보 ScheduleVo
     * @throws ElException
     */
    public ScheduleVo selectSchedule(ScheduleVo scheduleVo) throws ElException {
        return (ScheduleVo) selectByPk("com.demo.proworks.schedule.selectSchedule", scheduleVo);
    }
    
    /**
     * 스케줄 정보 목록을 조회한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 스케줄 정보 목록 List<ScheduleVo>
     * @throws ElException
     */
    public List<ScheduleVo> selectListSchedule(ScheduleVo scheduleVo) throws ElException {
        return list("com.demo.proworks.schedule.selectListSchedule", scheduleVo);
    }
    
    /**
     * 스케줄 정보 목록 건수를 조회한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 스케줄 정보 목록 건수 long
     * @throws ElException
     */
    public long selectListCountSchedule(ScheduleVo scheduleVo) throws ElException {
        return (Long) selectByPk("com.demo.proworks.schedule.selectListCountSchedule", scheduleVo);
    }
    
    /**
     * 간호사 정보 목록을 조회한다.
     * @param searchKeyHm 조건 검색 정보 HashMap
     * @return 간호사 정보 목록 List<NurseVo>
     * @throws ElException
     */
    public List<NurseVo> selectListNurse(HashMap searchKeyHm) throws ElException {
    	return list("com.demo.proworks.schedule.selectListNurse", searchKeyHm);
    }
} 