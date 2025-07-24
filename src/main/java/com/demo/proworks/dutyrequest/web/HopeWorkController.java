package com.demo.proworks.dutyrequest.web;

import java.util.List;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import com.demo.proworks.dutyrequest.service.DutyRequestService;
import com.demo.proworks.schedule.service.ScheduleService;
import com.demo.proworks.dutyrequest.vo.DutyRequestVo;
import com.demo.proworks.schedule.vo.ScheduleVo;

/**
 * @subject		: 희망근무 신청 관련 처리를 하는 컨트롤러
 * @description	: 희망근무 신청 관련 처리를 하는 컨트롤러
 * @author		: 개발팀
 * @since 		: 2025/01/27
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/01/27		개발팀			최초 생성
 * 
 */
@Controller
public class HopeWorkController {
	
    @Resource(name = "dutyRequestServiceImpl")
    private DutyRequestService dutyRequestService;
    
    @Resource(name = "scheduleServiceImpl")
    private ScheduleService scheduleService;
    
    /**
     * 희망근무 신청을 처리한다.
     * @param dutyRequestVo 근무신청 정보 DutyRequestVo
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "HopeWorkRequest")    
    @RequestMapping(value = "HopeWorkRequest")
    @ElDescription(sub = "희망근무 신청", desc = "희망근무 신청을 처리한다.")
    @ElValidator(errUrl="")
    public String requestHopeWork(DutyRequestVo dutyRequestVo, ScheduleVo scheduleVo) throws Exception {
        AppLog.debug("희망근무 신청 처리 시작 - nurseId: " + dutyRequestVo.getNurseId() + ", date: " + dutyRequestVo.getReqDate());
        
        try {
            // 1. dutyrequest 테이블에 신청 정보 저장
            dutyRequestService.insertDutyRequest(dutyRequestVo);
            
            // 2. schedule 테이블에 스케줄 정보 저장
            scheduleService.insertSchedule(scheduleVo);
            
            AppLog.debug("희망근무 신청 처리 완료");
            return "희망근무 신청이 완료되었습니다.";
            
        } catch (Exception e) {
            AppLog.error("희망근무 신청 처리 중 오류 발생: " + e.getMessage(), e);
            throw e;
        }
    }
    
    /**
     * 희망근무 신청을 수정한다.
     * @param dutyRequestVo 근무신청 정보 DutyRequestVo
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "HopeWorkUpdate")    
    @RequestMapping(value = "HopeWorkUpdate")
    @ElDescription(sub = "희망근무 수정", desc = "희망근무 신청을 수정한다.")
    @ElValidator(errUrl="")
    public String updateHopeWork(DutyRequestVo dutyRequestVo, ScheduleVo scheduleVo) throws Exception {
        AppLog.debug("희망근무 수정 처리 시작 - nurseId: " + dutyRequestVo.getNurseId() + ", date: " + dutyRequestVo.getReqDate());
        
        try {
            // 1. dutyrequest 테이블 수정
            dutyRequestService.updateDutyRequest(dutyRequestVo);
            
            // 2. schedule 테이블 수정
            scheduleService.updateSchedule(scheduleVo);
            
            AppLog.debug("희망근무 수정 처리 완료");
            return "희망근무 수정이 완료되었습니다.";
            
        } catch (Exception e) {
            AppLog.error("희망근무 수정 처리 중 오류 발생: " + e.getMessage(), e);
            throw e;
        }
    }
    
    /**
     * 희망근무 신청을 삭제한다.
     * @param dutyRequestVo 근무신청 정보 DutyRequestVo
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "HopeWorkDelete")    
    @RequestMapping(value = "HopeWorkDelete")
    @ElDescription(sub = "희망근무 삭제", desc = "희망근무 신청을 삭제한다.")
    @ElValidator(errUrl="")
    public String deleteHopeWork(DutyRequestVo dutyRequestVo, ScheduleVo scheduleVo) throws Exception {
        AppLog.debug("희망근무 삭제 처리 시작 - nurseId: " + dutyRequestVo.getNurseId() + ", date: " + dutyRequestVo.getReqDate());
        
        try {
            // 1. dutyrequest 테이블에서 삭제
            dutyRequestService.deleteDutyRequest(dutyRequestVo);
            
            // 2. schedule 테이블에서 삭제
            scheduleService.deleteSchedule(scheduleVo);
            
            AppLog.debug("희망근무 삭제 처리 완료");
            return "희망근무 삭제가 완료되었습니다.";
            
        } catch (Exception e) {
            AppLog.error("희망근무 삭제 처리 중 오류 발생: " + e.getMessage(), e);
            throw e;
        }
    }
    
    /**
     * 특정 간호사의 희망근무 목록을 조회한다.
     * @param dutyRequestVo 근무신청 정보 DutyRequestVo
     * @return 근무신청 목록
     * @throws Exception
     */
    @ElService(key = "HopeWorkList")    
    @RequestMapping(value = "HopeWorkList")
    @ElDescription(sub = "희망근무 목록 조회", desc = "특정 간호사의 희망근무 목록을 조회한다.")
    public List<DutyRequestVo> selectHopeWorkList(DutyRequestVo dutyRequestVo) throws Exception {
        AppLog.debug("희망근무 목록 조회 - nurseId: " + dutyRequestVo.getNurseId());
        
        try {
            List<DutyRequestVo> list = dutyRequestService.selectListDutyRequest(dutyRequestVo);
            AppLog.debug("희망근무 목록 조회 완료 - 건수: " + list.size());
            return list;
            
        } catch (Exception e) {
            AppLog.error("희망근무 목록 조회 중 오류 발생: " + e.getMessage(), e);
            throw e;
        }
    }
} 