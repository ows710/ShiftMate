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

    @ElDtoField(logicalName = "간호사번호", physicalName = "nurse_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "간호사번호", attr = "")
    private int nurse_id;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "사원번호", attr = "")
    private int empno;

    @ElDtoField(logicalName = "간호사명", physicalName = "ename", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "간호사명", attr = "")
    private String ename;

    @ElDtoField(logicalName = "직책", physicalName = "position", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "직책", attr = "")
    private String position;

    @ElDtoField(logicalName = "특이사항", physicalName = "special_note", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 255, dotLen = 0, baseValue = "", desc = "특이사항", attr = "")
    private String special_note;

    @ElDtoField(logicalName = "생성일", physicalName = "created_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "생성일", attr = "")
    private String created_at;

    @ElDtoField(logicalName = "수정일", physicalName = "updated_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "수정일", attr = "")
    private String updated_at;

    @ElDtoField(logicalName = "입사일", physicalName = "hire_date", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "입사일", attr = "")
    private String hire_date;

    @ElDtoField(logicalName = "병동번호", physicalName = "ward_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "병동번호", attr = "")
    private int ward_id;

    @ElDtoField(logicalName = "경력", physicalName = "career", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "경력", attr = "")
    private int career;

    @ElDtoField(logicalName = "병동명", physicalName = "ward_name", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "병동명", attr = "")
    private String ward_name;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rowStatus;

    @ElDtoField(logicalName = "검색_간호사번호", physicalName = "scNurseId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scNurseId;

    @ElDtoField(logicalName = "검색_간호사명", physicalName = "scNurseName", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scNurseName;

    @ElDtoField(logicalName = "검색_직책", physicalName = "scPosition", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scPosition;

    @ElDtoField(logicalName = "검색_병동번호", physicalName = "scWardId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scWardId;

    @ElVoField(physicalName = "nurse_id")
    public int getNurse_id(){
        return nurse_id;
    }

    @ElVoField(physicalName = "nurse_id")
    public void setNurse_id(int nurse_id){
        this.nurse_id = nurse_id;
    }

    @ElVoField(physicalName = "empno")
    public int getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(int empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "ename")
    public String getEname(){
        String ret = this.ename;
        return ret;
    }

    @ElVoField(physicalName = "ename")
    public void setEname(String ename){
        this.ename = ename;
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

    @ElVoField(physicalName = "special_note")
    public String getSpecial_note(){
        String ret = this.special_note;
        return ret;
    }

    @ElVoField(physicalName = "special_note")
    public void setSpecial_note(String special_note){
        this.special_note = special_note;
    }

    @ElVoField(physicalName = "created_at")
    public String getCreated_at(){
        String ret = this.created_at;
        return ret;
    }

    @ElVoField(physicalName = "created_at")
    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }

    @ElVoField(physicalName = "updated_at")
    public String getUpdated_at(){
        String ret = this.updated_at;
        return ret;
    }

    @ElVoField(physicalName = "updated_at")
    public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }

    @ElVoField(physicalName = "hire_date")
    public String getHire_date(){
        String ret = this.hire_date;
        return ret;
    }

    @ElVoField(physicalName = "hire_date")
    public void setHire_date(String hire_date){
        this.hire_date = hire_date;
    }

    @ElVoField(physicalName = "ward_id")
    public int getWard_id(){
        return ward_id;
    }

    @ElVoField(physicalName = "ward_id")
    public void setWard_id(int ward_id){
        this.ward_id = ward_id;
    }

    @ElVoField(physicalName = "career")
    public int getCareer(){
        return career;
    }

    @ElVoField(physicalName = "career")
    public void setCareer(int career){
        this.career = career;
    }

    @ElVoField(physicalName = "ward_name")
    public String getWard_name(){
        String ret = this.ward_name;
        return ret;
    }

    @ElVoField(physicalName = "ward_name")
    public void setWard_name(String ward_name){
        this.ward_name = ward_name;
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

    @ElVoField(physicalName = "scNurseId")
    public String getScNurseId(){
        String ret = this.scNurseId;
        return ret;
    }

    @ElVoField(physicalName = "scNurseId")
    public void setScNurseId(String scNurseId){
        this.scNurseId = scNurseId;
    }

    @ElVoField(physicalName = "scNurseName")
    public String getScNurseName(){
        String ret = this.scNurseName;
        return ret;
    }

    @ElVoField(physicalName = "scNurseName")
    public void setScNurseName(String scNurseName){
        this.scNurseName = scNurseName;
    }

    @ElVoField(physicalName = "scPosition")
    public String getScPosition(){
        String ret = this.scPosition;
        return ret;
    }

    @ElVoField(physicalName = "scPosition")
    public void setScPosition(String scPosition){
        this.scPosition = scPosition;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NurseVo [");
        sb.append("nurse_id").append("=").append(nurse_id).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("ename").append("=").append(ename).append(",");
        sb.append("position").append("=").append(position).append(",");
        sb.append("special_note").append("=").append(special_note).append(",");
        sb.append("created_at").append("=").append(created_at).append(",");
        sb.append("updated_at").append("=").append(updated_at).append(",");
        sb.append("hire_date").append("=").append(hire_date).append(",");
        sb.append("ward_id").append("=").append(ward_id).append(",");
        sb.append("career").append("=").append(career).append(",");
        sb.append("ward_name").append("=").append(ward_name).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("scNurseId").append("=").append(scNurseId).append(",");
        sb.append("scNurseName").append("=").append(scNurseName).append(",");
        sb.append("scPosition").append("=").append(scPosition).append(",");
        sb.append("scWardId").append("=").append(scWardId);
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
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.nurse_id , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.empno , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.ename , 50, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.position , 50, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.special_note , 255, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.created_at , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.updated_at , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.hire_date , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.ward_id , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.career , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.ward_name , 50, encode ) );
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
             this.nurse_id = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
             this.empno = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
            this.ename = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 50, encode );
             _offset += 50;
            this.position = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 50, encode );
             _offset += 50;
            this.special_note = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 255, encode );
             _offset += 255;
            this.created_at = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.updated_at = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.hire_date = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
             this.ward_id = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
             this.career = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
            this.ward_name = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 50, encode );
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
