package com.demo.proworks.schedule.vo;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.log.AppLog;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "스케줄정보")
public class ScheduleVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    private int _offset;

    public ScheduleVo(){
        this._offset = 0;
    }

    public ScheduleVo(int iOffset){
        this._offset = iOffset;
    }

    @ElDtoField(logicalName = "근무일", physicalName = "shiftDate", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "근무일", attr = "")
    private String shiftDate;

    @ElDtoField(logicalName = "간호사번호", physicalName = "nurseId", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "간호사번호", attr = "")
    private int nurseId;

    @ElDtoField(logicalName = "자동여부", physicalName = "isAuto", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 1, dotLen = 0, baseValue = "", desc = "자동여부", attr = "")
    private String isAuto;

    @ElDtoField(logicalName = "생성일", physicalName = "createdAt", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "생성일", attr = "")
    private String createdAt;

    @ElDtoField(logicalName = "수정일", physicalName = "updatedAt", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "수정일", attr = "")
    private String updatedAt;

    @ElDtoField(logicalName = "간호사명", physicalName = "nurseName", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "간호사명", attr = "")
    private String nurseName;

    @ElDtoField(logicalName = "고용일", physicalName = "hireDate", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "고용일", attr = "")
    private String hireDate;

    @ElDtoField(logicalName = "근무유형", physicalName = "shiftType", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "근무유형", attr = "")
    private String shiftType;

    @ElDtoField(logicalName = "간호사직책", physicalName = "position", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "간호사직책", attr = "")
    private String position;

    @ElDtoField(logicalName = "병동번호", physicalName = "wardId", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "병동번호", attr = "")
    private int wardId;

    @ElDtoField(logicalName = "병동명", physicalName = "wardName", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "병동명", attr = "")
    private String wardName;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rowStatus;

    @ElDtoField(logicalName = "검색_근무일시작", physicalName = "scShiftDateFrom", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scShiftDateFrom;

    @ElDtoField(logicalName = "검색_근무일종료", physicalName = "scShiftDateTo", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scShiftDateTo;

    @ElDtoField(logicalName = "검색_간호사번호", physicalName = "scNurseId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scNurseId;

    @ElDtoField(logicalName = "검색_병동번호", physicalName = "scWardId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scWardId;

    @ElDtoField(logicalName = "검색_근무유형", physicalName = "scShiftType", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scShiftType;

    @ElDtoField(logicalName = "검색_자동여부", physicalName = "scIsAuto", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scIsAuto;

    @ElDtoField(logicalName = "듀티고유번호", physicalName = "schId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int schId;

    @ElDtoField(logicalName = "사용자번호", physicalName = "userId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int userId;

    @ElVoField(physicalName = "shiftDate")
    public String getShiftDate(){
        String ret = this.shiftDate;
        return ret;
    }

    @ElVoField(physicalName = "shiftDate")
    public void setShiftDate(String shiftDate){
        this.shiftDate = shiftDate;
    }

    @ElVoField(physicalName = "nurseId")
    public int getNurseId(){
        return nurseId;
    }

    @ElVoField(physicalName = "nurseId")
    public void setNurseId(int nurseId){
        this.nurseId = nurseId;
    }

    @ElVoField(physicalName = "isAuto")
    public String getIsAuto(){
        String ret = this.isAuto;
        return ret;
    }

    @ElVoField(physicalName = "isAuto")
    public void setIsAuto(String isAuto){
        this.isAuto = isAuto;
    }

    @ElVoField(physicalName = "createdAt")
    public String getCreatedAt(){
        String ret = this.createdAt;
        return ret;
    }

    @ElVoField(physicalName = "createdAt")
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }

    @ElVoField(physicalName = "updatedAt")
    public String getUpdatedAt(){
        String ret = this.updatedAt;
        return ret;
    }

    @ElVoField(physicalName = "updatedAt")
    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }

    @ElVoField(physicalName = "nurseName")
    public String getNurseName(){
        String ret = this.nurseName;
        return ret;
    }

    @ElVoField(physicalName = "nurseName")
    public void setNurseName(String nurseName){
        this.nurseName = nurseName;
    }

    @ElVoField(physicalName = "hireDate")
    public String getHireDate(){
        String ret = this.hireDate;
        return ret;
    }

    @ElVoField(physicalName = "hireDate")
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }

    @ElVoField(physicalName = "shiftType")
    public String getShiftType(){
        String ret = this.shiftType;
        return ret;
    }

    @ElVoField(physicalName = "shiftType")
    public void setShiftType(String shiftType){
        this.shiftType = shiftType;
    }

    @ElVoField(physicalName = "position")
    public String getPosition(){
        String ret = this.position;
        return ret;
    }

    @ElVoField(physicalName = "position")
    public void setPosition(String position){
        this.position = position;
    }

    @ElVoField(physicalName = "wardId")
    public int getWardId(){
        return wardId;
    }

    @ElVoField(physicalName = "wardId")
    public void setWardId(int wardId){
        this.wardId = wardId;
    }

    @ElVoField(physicalName = "wardName")
    public String getWardName(){
        String ret = this.wardName;
        return ret;
    }

    @ElVoField(physicalName = "wardName")
    public void setWardName(String wardName){
        this.wardName = wardName;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        String ret = this.rowStatus;
        return ret;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "scShiftDateFrom")
    public String getScShiftDateFrom(){
        String ret = this.scShiftDateFrom;
        return ret;
    }

    @ElVoField(physicalName = "scShiftDateFrom")
    public void setScShiftDateFrom(String scShiftDateFrom){
        this.scShiftDateFrom = scShiftDateFrom;
    }

    @ElVoField(physicalName = "scShiftDateTo")
    public String getScShiftDateTo(){
        String ret = this.scShiftDateTo;
        return ret;
    }

    @ElVoField(physicalName = "scShiftDateTo")
    public void setScShiftDateTo(String scShiftDateTo){
        this.scShiftDateTo = scShiftDateTo;
    }

    @ElVoField(physicalName = "scNurseId")
    public String getScNurseId(){
        String ret = this.scNurseId;
        return ret;
    }

    @ElVoField(physicalName = "scNurseId")
    public void setScNurseId(String scNurseId){
        this.scNurseId = scNurseId;
    }

    @ElVoField(physicalName = "scWardId")
    public String getScWardId(){
        String ret = this.scWardId;
        return ret;
    }

    @ElVoField(physicalName = "scWardId")
    public void setScWardId(String scWardId){
        this.scWardId = scWardId;
    }

    @ElVoField(physicalName = "scShiftType")
    public String getScShiftType(){
        String ret = this.scShiftType;
        return ret;
    }

    @ElVoField(physicalName = "scShiftType")
    public void setScShiftType(String scShiftType){
        this.scShiftType = scShiftType;
    }

    @ElVoField(physicalName = "scIsAuto")
    public String getScIsAuto(){
        String ret = this.scIsAuto;
        return ret;
    }

    @ElVoField(physicalName = "scIsAuto")
    public void setScIsAuto(String scIsAuto){
        this.scIsAuto = scIsAuto;
    }

    @ElVoField(physicalName = "schId")
    public int getSchId(){
        return schId;
    }

    @ElVoField(physicalName = "schId")
    public void setSchId(int schId){
        this.schId = schId;
    }

    @ElVoField(physicalName = "userId")
    public int getUserId(){
        return userId;
    }

    @ElVoField(physicalName = "userId")
    public void setUserId(int userId){
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScheduleVo [");
        sb.append("shiftDate").append("=").append(shiftDate).append(",");
        sb.append("nurseId").append("=").append(nurseId).append(",");
        sb.append("isAuto").append("=").append(isAuto).append(",");
        sb.append("createdAt").append("=").append(createdAt).append(",");
        sb.append("updatedAt").append("=").append(updatedAt).append(",");
        sb.append("nurseName").append("=").append(nurseName).append(",");
        sb.append("hireDate").append("=").append(hireDate).append(",");
        sb.append("shiftType").append("=").append(shiftType).append(",");
        sb.append("position").append("=").append(position).append(",");
        sb.append("wardId").append("=").append(wardId).append(",");
        sb.append("wardName").append("=").append(wardName).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("scShiftDateFrom").append("=").append(scShiftDateFrom).append(",");
        sb.append("scShiftDateTo").append("=").append(scShiftDateTo).append(",");
        sb.append("scNurseId").append("=").append(scNurseId).append(",");
        sb.append("scWardId").append("=").append(scWardId).append(",");
        sb.append("scShiftType").append("=").append(scShiftType).append(",");
        sb.append("scIsAuto").append("=").append(scIsAuto).append(",");
        sb.append("schId").append("=").append(schId).append(",");
        sb.append("userId").append("=").append(userId);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return true;
    }

    public byte[] marshalFld() throws IOException{
        return marshalFld( com.inswave.elfw.ElConfig.getFldEncode() ); 
    }

	public byte[] marshalFld(String encode) throws IOException{
    	ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(bout);
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.shiftDate , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.nurseId , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.isAuto , 1, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.createdAt , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.updatedAt , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.nurseName , 50, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.hireDate , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.shiftType , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.position , 50, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.wardId , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.wardName , 50, encode ) );
        } catch (IOException e) {
                AppLog.error("marshalFld Error:["+ toString()+"]", e);
                throw e;
        } finally {
            try	{
                if (out != null) out.close();
           } catch (IOException ie) {
                AppLog.error("marshalFld out close Error", ie);
           }
            try	{
                if (bout != null) bout.close();
           } catch (IOException ie) {
                AppLog.error("marshalFld bout close Error", ie);
           }
        }
        return bout.toByteArray();
    }

    public void unMarshalFld( byte[] bytes ) throws ElException{
        unMarshalFld( bytes, com.inswave.elfw.ElConfig.getFldEncode() ); 
    }

    public void unMarshalFld( byte[] bytes , String encode) throws ElException{
        try{ 
            this.shiftDate = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
             this.nurseId = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
            this.isAuto = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 1, encode );
             _offset += 1;
            this.createdAt = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.updatedAt = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.nurseName = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 50, encode );
             _offset += 50;
            this.hireDate = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.shiftType = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.position = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 50, encode );
             _offset += 50;
             this.wardId = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
            this.wardName = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 50, encode );
             _offset += 50;
        }catch(ElException e) { 
            String errorLine = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, 0, bytes.length, encode );
            AppLog.error("unMarshalFld Error:["+ errorLine+"]", e);
            throw e;
        } 
    }

    public int getOffset(){
        return _offset;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
