package com.demo.proworks.nurse.vo;

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
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "간호사정보")
public class NurseVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    private int _offset;

    public NurseVo(){
        this._offset = 0;
    }

    public NurseVo(int iOffset){
        this._offset = iOffset;
    }

    @ElDtoField(logicalName = "간호사 ID", physicalName = "nurseId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int nurseId;

    @ElDtoField(logicalName = "간호사명", physicalName = "nurseName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nurseName;

    @ElDtoField(logicalName = "직급", physicalName = "position", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String position;

    @ElDtoField(logicalName = "특이사항", physicalName = "specialNote", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String specialNote;

    @ElDtoField(logicalName = "생성일", physicalName = "createdAt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String createdAt;

    @ElDtoField(logicalName = "수정일", physicalName = "updatedAt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updatedAt;

    @ElDtoField(logicalName = "입사일", physicalName = "hireDate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String hireDate;

    @ElDtoField(logicalName = "경력", physicalName = "career", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int career;

    @ElDtoField(logicalName = "병동 ID", physicalName = "wardId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int wardId;

    @ElVoField(physicalName = "nurseId")
    public int getNurseId(){
        return nurseId;
    }

    @ElVoField(physicalName = "nurseId")
    public void setNurseId(int nurseId){
        this.nurseId = nurseId;
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

    @ElVoField(physicalName = "position")
    public String getPosition(){
        String ret = this.position;
        return ret;
    }

    @ElVoField(physicalName = "position")
    public void setPosition(String position){
        this.position = position;
    }

    @ElVoField(physicalName = "specialNote")
    public String getSpecialNote(){
        String ret = this.specialNote;
        return ret;
    }

    @ElVoField(physicalName = "specialNote")
    public void setSpecialNote(String specialNote){
        this.specialNote = specialNote;
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

    @ElVoField(physicalName = "hireDate")
    public String getHireDate(){
        String ret = this.hireDate;
        return ret;
    }

    @ElVoField(physicalName = "hireDate")
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }

    @ElVoField(physicalName = "career")
    public int getCareer(){
        return career;
    }

    @ElVoField(physicalName = "career")
    public void setCareer(int career){
        this.career = career;
    }

    @ElVoField(physicalName = "wardId")
    public int getWardId(){
        return wardId;
    }

    @ElVoField(physicalName = "wardId")
    public void setWardId(int wardId){
        this.wardId = wardId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NurseVo [");
        sb.append("nurseId").append("=").append(nurseId).append(",");
        sb.append("nurseName").append("=").append(nurseName).append(",");
        sb.append("position").append("=").append(position).append(",");
        sb.append("specialNote").append("=").append(specialNote).append(",");
        sb.append("createdAt").append("=").append(createdAt).append(",");
        sb.append("updatedAt").append("=").append(updatedAt).append(",");
        sb.append("hireDate").append("=").append(hireDate).append(",");
        sb.append("career").append("=").append(career).append(",");
        sb.append("wardId").append("=").append(wardId);
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
