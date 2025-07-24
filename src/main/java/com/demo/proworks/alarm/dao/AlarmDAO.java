package com.demo.proworks.alarm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.demo.proworks.alarm.vo.AlarmVo;
import com.demo.proworks.cmmn.dao.ProworksDefaultAbstractDAO;
import com.demo.proworks.alarm.dao.AlarmDAO;

/**  
 * @subject     : 알람정보 관련 처리를 담당하는 DAO
 * @description : 알람정보 관련 처리를 담당하는 DAO
 * @author      : 오원석
 * @since       : 2025/07/23
 * @modification
 * ===========================================================
 * DATE				AUTHOR				DESC
 * ===========================================================
 * 2025/07/23			 오원석	 		최초 생성
 * 
 */
@Repository("alarmDAO")
public class AlarmDAO extends ProworksDefaultAbstractDAO {

    /**
     * 알람정보 상세 조회한다.
     *  
     * @param  AlarmVo 알람정보
     * @return AlarmVo 알람정보
     * @throws ElException
     */
    public AlarmVo selectAlarm(AlarmVo vo) throws ElException {
        return (AlarmVo) selectByPk("com.demo.proworks.alarm.selectAlarm", vo);
    }

    /**
     * 페이징을 처리하여 알람정보 목록조회를 한다.
     *  
     * @param  AlarmVo 알람정보
     * @return List<AlarmVo> 알람정보
     * @throws ElException
     */
    public List<AlarmVo> selectListAlarm(AlarmVo vo) throws ElException {      	
        return (List<AlarmVo>)list("com.demo.proworks.alarm.selectListAlarm", vo);
    }

    /**
     * 알람정보 목록 조회의 전체 카운트를 조회한다.
     *  
     * @param  AlarmVo 알람정보
     * @return 알람정보 조회의 전체 카운트
     * @throws ElException
     */
    public long selectListCountAlarm(AlarmVo vo)  throws ElException{               
        return (Long)selectByPk("com.demo.proworks.alarm.selectListCountAlarm", vo);
    }
        
    /**
     * 알람정보를 등록한다.
     *  
     * @param  AlarmVo 알람정보
     * @return 번호
     * @throws ElException
     */
    public int insertAlarm(AlarmVo vo) throws ElException {    	
        return insert("com.demo.proworks.alarm.insertAlarm", vo);
    }

    /**
     * 알람정보를 갱신한다.
     *  
     * @param  AlarmVo 알람정보
     * @return 번호
     * @throws ElException
     */
    public int updateAlarm(AlarmVo vo) throws ElException {
        return update("com.demo.proworks.alarm.updateAlarm", vo);
    }

    /**
     * 알람정보를 삭제한다.
     *  
     * @param  AlarmVo 알람정보
     * @return 번호
     * @throws ElException
     */
    public int deleteAlarm(AlarmVo vo) throws ElException {
        return delete("com.demo.proworks.alarm.deleteAlarm", vo);
    }

}
