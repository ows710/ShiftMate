package com.demo.proworks.schedule.service;

import java.util.List;
import java.util.HashMap;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.schedule.vo.ScheduleVo;
import com.demo.proworks.nurse.vo.NurseVo;

/**
 * @subject		: 스케줄 정보 관련 처리를 하는 서비스 인터페이스
 * @description	: 스케줄 정보 관련 처리를 하는 서비스 인터페이스
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
public interface ScheduleService {
	
	/**
	 * 페이징을 처리하여 스케줄 정보 목록을 조회한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 목록 List<ScheduleVo>
	 * @throws ElException
	 */
	public List<ScheduleVo> selectListSchedule(ScheduleVo scheduleVo) throws ElException;
	
	/**
	 * 스케줄 정보 목록 건수를 조회한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 목록 건수 long
	 * @throws ElException
	 */
	public long selectListCountSchedule(ScheduleVo scheduleVo) throws ElException;
	
	/**
	 * 스케줄 정보를 상세 조회한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 정보 ScheduleVo
	 * @throws ElException
	 */
	public ScheduleVo selectSchedule(ScheduleVo scheduleVo) throws ElException;
		
	/**
	 * 스케줄 정보를 등록 처리한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int insertSchedule(ScheduleVo scheduleVo) throws Exception;
	
	/**
	 * 스케줄 정보를 갱신 처리한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int updateSchedule(ScheduleVo scheduleVo) throws Exception;
	
	/**
	 * 스케줄 정보를 삭제 처리한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 건수 int
	 * @throws Exception
	 */
	public int deleteSchedule(ScheduleVo scheduleVo) throws Exception;
	
	/**
	 * 간호사 정보 목록을 조회한다.
	 * @param searchKeyHm 조건 검색 정보 HashMap 
	 * @return 간호사 정보 목록 List<NurseVo>
	 * @throws Exception
	 */
	public List<NurseVo> selectListNurse(HashMap searchKeyHm) throws Exception;
} 