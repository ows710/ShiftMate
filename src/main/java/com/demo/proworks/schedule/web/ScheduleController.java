package com.demo.proworks.schedule.web;

import java.util.List;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import com.demo.proworks.schedule.service.ScheduleService;
import com.demo.proworks.schedule.vo.ScheduleListVo;
import com.demo.proworks.schedule.vo.ScheduleVo;

/**
 * @subject		: 스케줄 정보 관련 처리를 하는 컨트롤러
 * @description	: 스케줄 정보 관련 처리를 하는 컨트롤러
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Controller
public class ScheduleController {
	
    @Resource(name = "scheduleServiceImpl")
    private ScheduleService scheduleService;
    
	/**
	 * 페이징을 처리하여 스케줄 목록을 조회한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 스케줄 목록 정보 ScheduleListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleList")
    @RequestMapping(value = "DmoScheduleList")    
    @ElDescription(sub = "스케줄 목록 조회", desc = "페이징을 처리하여 스케줄 목록을 조회한다.")               
    public ScheduleListVo selectScheduleList(ScheduleVo scheduleVo) throws Exception {
    	AppLog.debug("스케줄 목록 조회 로그 테스트 : " + scheduleVo);
    	
        List<ScheduleVo> scheduleList = scheduleService.selectListSchedule(scheduleVo);
        long totCnt = scheduleService.selectListCountSchedule(scheduleVo);
        
		ScheduleListVo retScheduleVoList = new ScheduleListVo();
		retScheduleVoList.setScheduleVoList(scheduleList); 
		retScheduleVoList.setNurseVoList(scheduleService.selectListNurse(new HashMap()));
		retScheduleVoList.setTotalCount(totCnt);

        return retScheduleVoList;
    } 

    /**
     * 스케줄 정보를 상세 조회한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 스케줄 정보 ScheduleListVo
     * @throws Exception
     */
    @ElService(key = "DmoScheduleView")    
    @RequestMapping(value = "DmoScheduleView")
    @ElDescription(sub = "스케줄 상세 조회", desc = "스케줄 정보를 상세 조회한다.")  
    public ScheduleListVo selectScheduleView(ScheduleVo scheduleVo) throws Exception {
    	ScheduleVo selectScheduleVo = scheduleService.selectSchedule(scheduleVo);
  
        ScheduleListVo retScheduleVoList = new ScheduleListVo();
        retScheduleVoList.setScheduleVo(selectScheduleVo);
        retScheduleVoList.setNurseVoList(scheduleService.selectListNurse(new HashMap()));
        
		return retScheduleVoList;
    }

    /**
     * 스케줄 정보를 등록 처리한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoScheduleIns")    
    @RequestMapping(value = "DmoScheduleIns")
    @ElDescription(sub = "스케줄 등록 처리", desc = "스케줄 정보를 등록 처리한다.")
    @ElValidator(errUrl="")
    public String insertSchedule(ScheduleVo scheduleVo) throws Exception {    	
    	scheduleService.insertSchedule(scheduleVo);   
    	return "스케줄 정보가 등록되었습니다.";
    }
        
	/**
	 * 스케줄 정보를 갱신 처리한다.
	 * @param scheduleVo 스케줄 정보 ScheduleVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoScheduleUpd")    
    @RequestMapping(value = "DmoScheduleUpd")    
    @ElDescription(sub = "스케줄 갱신 처리", desc = "스케줄 정보를 갱신 처리한다.")    
	@ElValidator(errUrl = "")
    public String updateSchedule(ScheduleVo scheduleVo) throws Exception {  
    	scheduleService.updateSchedule(scheduleVo);
    	return "스케줄 정보가 갱신되었습니다.";
    }

    /**
     * 스케줄 정보를 삭제 처리한다.
     * @param scheduleVo 스케줄 정보 ScheduleVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoScheduleDel")    
    @RequestMapping(value = "DmoScheduleDel")
    @ElDescription(sub = "스케줄 삭제 처리", desc = "스케줄 정보를 삭제 처리한다.")    
    public String deleteSchedule(ScheduleVo scheduleVo) throws Exception {
    	scheduleService.deleteSchedule(scheduleVo);
    	return "스케줄 정보가 삭제되었습니다.";
    }
} 