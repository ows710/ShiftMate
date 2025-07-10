package com.demo.proworks.schedule.service.impl;

import java.util.List;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.schedule.dao.ScheduleDAO;
import com.demo.proworks.schedule.service.ScheduleService;
import com.demo.proworks.schedule.vo.ScheduleVo;
import com.demo.proworks.nurse.vo.NurseVo;

/**
 * @subject		: 스케줄 정보 관련 처리를 담당하는 서비스 구현체
 * @description	: 스케줄 정보 관련 처리를 담당하는 서비스 구현체
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Service("scheduleServiceImpl")
public class ScheduleServiceImpl implements ScheduleService {
	
    @Resource(name="scheduleDAO")
    private ScheduleDAO scheduleDAO;

    /**
     * 페이징을 처리하여 스케줄 정보 목록을 조회한다.
     * @process
     * 1. 스케줄 정보 목록을 조회한다.
     * 2. 조회 결과를 List<ScheduleVo> 타입으로 리턴한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 목록 List<ScheduleVo>
	 * @throws ElException
     */
	public List<ScheduleVo> selectListSchedule(ScheduleVo scheduleVo) throws ElException {
		List<ScheduleVo> list = scheduleDAO.selectListSchedule(scheduleVo);	
		return list;
	}
	
	/**
	 * 스케줄 정보 목록 건수를 조회한다.
     * @process
     * 1. 스케줄 정보 목록 건수를 조회한다.
     * 2. 조회 결과를 long 타입으로 리턴한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountSchedule(ScheduleVo scheduleVo) throws ElException {
		return scheduleDAO.selectListCountSchedule(scheduleVo);
	}

    /**
	 * 스케줄 정보를 상세 조회한다.
     * @process
     * 1. 스케줄 정보를 상세 조회한다.
     * 2. 조회 결과를 ScheduleVo 타입으로 리턴한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 ScheduleVo
	 * @throws ElException
     */
	public ScheduleVo selectSchedule(ScheduleVo scheduleVo) throws ElException {
		ScheduleVo resultVO = scheduleDAO.selectSchedule(scheduleVo);
        return resultVO;
	}

    /**
	 * 스케줄 정보를 등록 처리한다.
     * @process
     * 1. 스케줄 정보를 등록 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int insertSchedule(ScheduleVo scheduleVo) throws ElException {
        int iRet = scheduleDAO.insertSchedule(scheduleVo);
        return iRet;
	}
	
    /**
	 * 스케줄 정보를 갱신 처리한다.
     * @process
     * 1. 스케줄 정보를 갱신 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int updateSchedule(ScheduleVo scheduleVo) throws ElException {				
        int updRet = scheduleDAO.updateSchedule(scheduleVo);
        return updRet;   		
	}

    /**
	 * 스케줄 정보를 삭제 처리한다.
     * @process
     * 1. 스케줄 정보를 삭제 처리한다.
     * 2. 처리 건수를 int 타입으로 리턴한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 건수 int
	 * @throws ElException
     */
	public int deleteSchedule(ScheduleVo scheduleVo) throws ElException {
		int del = scheduleDAO.deleteSchedule(scheduleVo);
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
		return scheduleDAO.selectListNurse(searchKeyHm);
	}
} 