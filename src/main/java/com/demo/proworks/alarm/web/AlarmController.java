package com.demo.proworks.alarm.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.proworks.alarm.service.AlarmService;
import com.demo.proworks.alarm.vo.AlarmVo;
import com.demo.proworks.alarm.vo.AlarmListVo;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import org.springframework.web.bind.annotation.RequestMethod;

/**  
 * @subject     : 알람정보 관련 처리를 담당하는 컨트롤러
 * @description : 알람정보 관련 처리를 담당하는 컨트롤러
 * @author      : 오원석
 * @since       : 2025/07/23
 * @modification
 * ===========================================================
 * DATE				AUTHOR				DESC
 * ===========================================================
 * 2025/07/23			 오원석	 		최초 생성
 * 
 */
@Controller
public class AlarmController {
	
    /** AlarmService */
    @Resource(name = "alarmServiceImpl")
    private AlarmService alarmService;
	
    
    /**
     * 알람정보 목록을 조회합니다.
     *
     * @param  alarmVo 알람정보
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "selectlistalarm")
    @RequestMapping(value = "selectlistalarm")    
    @ElDescription(sub = "알람정보 목록조회", desc = "페이징을 처리하여 알람정보 목록 조회를 한다.")               
    public AlarmListVo selectListAlarm(AlarmVo alarmVo) throws Exception {    	   	

        List<AlarmVo> alarmList = alarmService.selectListAlarm(alarmVo);                  
        long totCnt = alarmService.selectListCountAlarm(alarmVo);
	
		AlarmListVo retAlarmList = new AlarmListVo();
		retAlarmList.setAlarmVoList(alarmList); 
		retAlarmList.setTotalCount(totCnt);
		retAlarmList.setPageSize(alarmVo.getPageSize());
		retAlarmList.setPageIndex(alarmVo.getPageIndex());

        return retAlarmList;            
    }  
        
    /**
     * 알람정보을 단건 조회 처리 한다.
     *
     * @param  alarmVo 알람정보
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "selectalarm")    
    @RequestMapping(value = "selectalarm") 
    @ElDescription(sub = "알람정보 갱신 폼을 위한 조회", desc = "알람정보 갱신 폼을 위한 조회를 한다.")    
    public AlarmVo selectAlarm(AlarmVo alarmVo) throws Exception {
    	AlarmVo selectAlarmVo = alarmService.selectAlarm(alarmVo);    	    
		
        return selectAlarmVo;
    } 
 
    /**
     * 알람정보를 등록 처리 한다.
     *
     * @param  alarmVo 알람정보
     * @throws Exception
     */
    @ElService(key = "insertalarm")    
    @RequestMapping(value = "insertalarm")
    @ElDescription(sub = "알람정보 등록처리", desc = "알람정보를 등록 처리 한다.")
    public void insertAlarm(AlarmVo alarmVo) throws Exception {    	 
    	alarmService.insertAlarm(alarmVo);   
    }
       
    /**
     * 알람정보를 갱신 처리 한다.
     *
     * @param  alarmVo 알람정보
     * @throws Exception
     */
    @ElService(key = "updatealarm")    
    @RequestMapping(value = "updatealarm")    
    @ElDescription(sub = "알람정보 갱신처리", desc = "알람정보를 갱신 처리 한다.")    
    public void updateAlarm(AlarmVo alarmVo) throws Exception {  
 
    	alarmService.updateAlarm(alarmVo);                                            
    }

    /**
     * 알람정보를 삭제 처리한다.
     *
     * @param  alarmVo 알람정보    
     * @throws Exception
     */
    @ElService(key = "deletealarm")    
    @RequestMapping(value = "deletealarm")
    @ElDescription(sub = "알람정보 삭제처리", desc = "알람정보를 삭제 처리한다.")    
    public void deleteAlarm(AlarmVo alarmVo) throws Exception {
        alarmService.deleteAlarm(alarmVo);
    }
   
}
