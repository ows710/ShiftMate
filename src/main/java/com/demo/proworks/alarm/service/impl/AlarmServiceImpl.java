package com.demo.proworks.alarm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.demo.proworks.alarm.service.AlarmService;
import com.demo.proworks.alarm.vo.AlarmVo;
import com.demo.proworks.alarm.dao.AlarmDAO;

/**  
 * @subject     : 알람정보 관련 처리를 담당하는 ServiceImpl
 * @description	: 알람정보 관련 처리를 담당하는 ServiceImpl
 * @author      : 오원석
 * @since       : 2025/07/23
 * @modification
 * ===========================================================
 * DATE				AUTHOR				DESC
 * ===========================================================
 * 2025/07/23			 오원석	 		최초 생성
 * 
 */
@Service("alarmServiceImpl")
public class AlarmServiceImpl implements AlarmService {

    @Resource(name="alarmDAO")
    private AlarmDAO alarmDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;

    /**
     * 알람정보 목록을 조회합니다.
     *
     * @process
     * 1. 알람정보 페이징 처리하여 목록을 조회한다.
     * 2. 결과 List<AlarmVo>을(를) 리턴한다.
     * 
     * @param  alarmVo 알람정보 AlarmVo
     * @return 알람정보 목록 List<AlarmVo>
     * @throws Exception
     */
	public List<AlarmVo> selectListAlarm(AlarmVo alarmVo) throws Exception {
		List<AlarmVo> list = alarmDAO.selectListAlarm(alarmVo);	
	
		return list;
	}

    /**
     * 조회한 알람정보 전체 카운트
     *
     * @process
     * 1. 알람정보 조회하여 전체 카운트를 리턴한다.
     * 
     * @param  alarmVo 알람정보 AlarmVo
     * @return 알람정보 목록 전체 카운트
     * @throws Exception
     */
	public long selectListCountAlarm(AlarmVo alarmVo) throws Exception {
		return alarmDAO.selectListCountAlarm(alarmVo);
	}

    /**
     * 알람정보를 상세 조회한다.
     *
     * @process
     * 1. 알람정보를 상세 조회한다.
     * 2. 결과 AlarmVo을(를) 리턴한다.
     * 
     * @param  alarmVo 알람정보 AlarmVo
     * @return 단건 조회 결과
     * @throws Exception
     */
	public AlarmVo selectAlarm(AlarmVo alarmVo) throws Exception {
		AlarmVo resultVO = alarmDAO.selectAlarm(alarmVo);			
        
        return resultVO;
	}

    /**
     * 알람정보를 등록 처리 한다.
     *
     * @process
     * 1. 알람정보를 등록 처리 한다.
     * 
     * @param  alarmVo 알람정보 AlarmVo
     * @return 번호
     * @throws Exception
     */
	public int insertAlarm(AlarmVo alarmVo) throws Exception {
		return alarmDAO.insertAlarm(alarmVo);	
	}
	
    /**
     * 알람정보를 갱신 처리 한다.
     *
     * @process
     * 1. 알람정보를 갱신 처리 한다.
     * 
     * @param  alarmVo 알람정보 AlarmVo
     * @return 번호
     * @throws Exception
     */
	public int updateAlarm(AlarmVo alarmVo) throws Exception {				
		return alarmDAO.updateAlarm(alarmVo);	   		
	}

    /**
     * 알람정보를 삭제 처리 한다.
     *
     * @process
     * 1. 알람정보를 삭제 처리 한다.
     * 
     * @param  alarmVo 알람정보 AlarmVo
     * @return 번호
     * @throws Exception
     */
	public int deleteAlarm(AlarmVo alarmVo) throws Exception {
		return alarmDAO.deleteAlarm(alarmVo);
	}
	
}
