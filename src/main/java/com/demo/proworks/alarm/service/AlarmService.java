package com.demo.proworks.alarm.service;

import java.util.List;

import com.demo.proworks.alarm.vo.AlarmVo;

/**  
 * @subject     : 알람정보 관련 처리를 담당하는 인터페이스
 * @description : 알람정보 관련 처리를 담당하는 인터페이스
 * @author      : 오원석
 * @since       : 2025/07/23
 * @modification
 * ===========================================================
 * DATE				AUTHOR				DESC
 * ===========================================================
 * 2025/07/23			 오원석	 		최초 생성
 * 
 */
public interface AlarmService {
	
    /**
     * 알람정보 페이징 처리하여 목록을 조회한다.
     *
     * @param  alarmVo 알람정보 AlarmVo
     * @return 알람정보 목록 List<AlarmVo>
     * @throws Exception
     */
	public List<AlarmVo> selectListAlarm(AlarmVo alarmVo) throws Exception;
	
    /**
     * 조회한 알람정보 전체 카운트
     * 
     * @param  alarmVo 알람정보 AlarmVo
     * @return 알람정보 목록 전체 카운트
     * @throws Exception
     */
	public long selectListCountAlarm(AlarmVo alarmVo) throws Exception;
	
    /**
     * 알람정보를 상세 조회한다.
     *
     * @param  alarmVo 알람정보 AlarmVo
     * @return 단건 조회 결과
     * @throws Exception
     */
	public AlarmVo selectAlarm(AlarmVo alarmVo) throws Exception;
		
    /**
     * 알람정보를 등록 처리 한다.
     *
     * @param  alarmVo 알람정보 AlarmVo
     * @return 번호
     * @throws Exception
     */
	public int insertAlarm(AlarmVo alarmVo) throws Exception;
	
    /**
     * 알람정보를 갱신 처리 한다.
     *
     * @param  alarmVo 알람정보 AlarmVo
     * @return 번호
     * @throws Exception
     */
	public int updateAlarm(AlarmVo alarmVo) throws Exception;
	
    /**
     * 알람정보를 삭제 처리 한다.
     *
     * @param  alarmVo 알람정보 AlarmVo
     * @return 번호
     * @throws Exception
     */
	public int deleteAlarm(AlarmVo alarmVo) throws Exception;
	
}
