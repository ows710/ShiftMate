package com.demo.proworks.alarm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "알람정보")
public class AlarmVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    public AlarmVo(){
    }

    @ElDtoField(logicalName = "alarmId", physicalName = "alarmid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String alarmid;

    @ElDtoField(logicalName = "senderId", physicalName = "senderid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String senderid;

    @ElDtoField(logicalName = "content", physicalName = "content", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String content;

    @ElDtoField(logicalName = "createdAt", physicalName = "createdat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String createdat;

    @ElDtoField(logicalName = "search_alarmId", physicalName = "scAlarmid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scAlarmid;

    @ElDtoField(logicalName = "search_senderId", physicalName = "scSenderid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scSenderid;

    @ElDtoField(logicalName = "search_content", physicalName = "scContent", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scContent;

    @ElDtoField(logicalName = "search_createdAt", physicalName = "scCreatedat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scCreatedat;

    @ElVoField(physicalName = "alarmid")
    public String getAlarmid(){
        String ret = this.alarmid;
        return ret;
    }

    @ElVoField(physicalName = "alarmid")
    public void setAlarmid(String alarmid){
        this.alarmid = alarmid;
    }

    @ElVoField(physicalName = "senderid")
    public String getSenderid(){
        String ret = this.senderid;
        return ret;
    }

    @ElVoField(physicalName = "senderid")
    public void setSenderid(String senderid){
        this.senderid = senderid;
    }

    @ElVoField(physicalName = "content")
    public String getContent(){
        String ret = this.content;
        return ret;
    }

    @ElVoField(physicalName = "content")
    public void setContent(String content){
        this.content = content;
    }

    @ElVoField(physicalName = "createdat")
    public String getCreatedat(){
        String ret = this.createdat;
        return ret;
    }

    @ElVoField(physicalName = "createdat")
    public void setCreatedat(String createdat){
        this.createdat = createdat;
    }

    @ElVoField(physicalName = "scAlarmid")
    public String getScAlarmid(){
        String ret = this.scAlarmid;
        return ret;
    }

    @ElVoField(physicalName = "scAlarmid")
    public void setScAlarmid(String scAlarmid){
        this.scAlarmid = scAlarmid;
    }

    @ElVoField(physicalName = "scSenderid")
    public String getScSenderid(){
        String ret = this.scSenderid;
        return ret;
    }

    @ElVoField(physicalName = "scSenderid")
    public void setScSenderid(String scSenderid){
        this.scSenderid = scSenderid;
    }

    @ElVoField(physicalName = "scContent")
    public String getScContent(){
        String ret = this.scContent;
        return ret;
    }

    @ElVoField(physicalName = "scContent")
    public void setScContent(String scContent){
        this.scContent = scContent;
    }

    @ElVoField(physicalName = "scCreatedat")
    public String getScCreatedat(){
        String ret = this.scCreatedat;
        return ret;
    }

    @ElVoField(physicalName = "scCreatedat")
    public void setScCreatedat(String scCreatedat){
        this.scCreatedat = scCreatedat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlarmVo [");
        sb.append("alarmid").append("=").append(alarmid).append(",");
        sb.append("senderid").append("=").append(senderid).append(",");
        sb.append("content").append("=").append(content).append(",");
        sb.append("createdat").append("=").append(createdat).append(",");
        sb.append("scAlarmid").append("=").append(scAlarmid).append(",");
        sb.append("scSenderid").append("=").append(scSenderid).append(",");
        sb.append("scContent").append("=").append(scContent).append(",");
        sb.append("scCreatedat").append("=").append(scCreatedat);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
