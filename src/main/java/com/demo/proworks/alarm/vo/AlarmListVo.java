package com.demo.proworks.alarm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "알람정보")
public class AlarmListVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    public AlarmListVo(){
    }

    @ElDtoField(logicalName = "알람정보List", physicalName = "alarmVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<com.demo.proworks.alarm.vo.AlarmVo> alarmVoList;

    @ElVoField(physicalName = "alarmVoList")
    public java.util.List<com.demo.proworks.alarm.vo.AlarmVo> getAlarmVoList(){
        return alarmVoList;
    }

    @ElVoField(physicalName = "alarmVoList")
    public void setAlarmVoList(java.util.List<com.demo.proworks.alarm.vo.AlarmVo> alarmVoList){
        this.alarmVoList = alarmVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlarmListVo [");
        sb.append("alarmVoList").append("=").append(alarmVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; alarmVoList != null && i < alarmVoList.size() ; i++ ) {
            com.demo.proworks.alarm.vo.AlarmVo vo = (com.demo.proworks.alarm.vo.AlarmVo)alarmVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; alarmVoList != null && i < alarmVoList.size() ; i++ ) {
            com.demo.proworks.alarm.vo.AlarmVo vo = (com.demo.proworks.alarm.vo.AlarmVo)alarmVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
