package com.demo.proworks.dutyrequest.vo;

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
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "근무신청정보")
public class DutyRequestVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    private int _offset;

    public DutyRequestVo(){
        this._offset = 0;
    }

    public DutyRequestVo(int iOffset){
        this._offset = iOffset;
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "reqId", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "신청번호", attr = "")
    private int reqId;

    @ElDtoField(logicalName = "신청일", physicalName = "reqDate", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "신청일", attr = "")
    private String reqDate;

    @ElDtoField(logicalName = "제출일", physicalName = "submittedAt", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "제출일", attr = "")
    private String submittedAt;

    @ElDtoField(logicalName = "생성일", physicalName = "createdAt", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "생성일", attr = "")
    private String createdAt;

    @ElDtoField(logicalName = "수정일", physicalName = "updatedAt", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "수정일", attr = "")
    private String updatedAt;

    @ElDtoField(logicalName = "간호사번호", physicalName = "nurseId", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "간호사번호", attr = "")
    private int nurseId;

    @ElDtoField(logicalName = "근무유형", physicalName = "shiftType", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 1, dotLen = 0, baseValue = "", desc = "근무유형", attr = "")
    private String shiftType;

    @ElDtoField(logicalName = "근무자명", physicalName = "nurseName", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "근무자명", attr = "")
    private String nurseName;

    @ElVoField(physicalName = "reqId")
    public int getReqId(){
        return reqId;
    }

    @ElVoField(physicalName = "reqId")
    public void setReqId(int reqId){
        this.reqId = reqId;
    }

    @ElVoField(physicalName = "reqDate")
    public String getReqDate(){
        String ret = this.reqDate;
        return ret;
    }

    @ElVoField(physicalName = "reqDate")
    public void setReqDate(String reqDate){
        this.reqDate = reqDate;
    }

    @ElVoField(physicalName = "submittedAt")
    public String getSubmittedAt(){
        String ret = this.submittedAt;
        return ret;
    }

    @ElVoField(physicalName = "submittedAt")
    public void setSubmittedAt(String submittedAt){
        this.submittedAt = submittedAt;
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

    @ElVoField(physicalName = "nurseId")
    public int getNurseId(){
        return nurseId;
    }

    @ElVoField(physicalName = "nurseId")
    public void setNurseId(int nurseId){
        this.nurseId = nurseId;
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

    @ElVoField(physicalName = "nurseName")
    public String getNurseName(){
        String ret = this.nurseName;
        return ret;
    }

    @ElVoField(physicalName = "nurseName")
    public void setNurseName(String nurseName){
        this.nurseName = nurseName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DutyRequestVo [");
        sb.append("reqId").append("=").append(reqId).append(",");
        sb.append("reqDate").append("=").append(reqDate).append(",");
        sb.append("submittedAt").append("=").append(submittedAt).append(",");
        sb.append("createdAt").append("=").append(createdAt).append(",");
        sb.append("updatedAt").append("=").append(updatedAt).append(",");
        sb.append("nurseId").append("=").append(nurseId).append(",");
        sb.append("shiftType").append("=").append(shiftType).append(",");
        sb.append("nurseName").append("=").append(nurseName);
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
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.reqId , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.reqDate , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.submittedAt , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.createdAt , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.updatedAt , 10, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.nurseId , 11) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.shiftType , 1, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.nurseName , 50, encode ) );
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
             this.reqId = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
            this.reqDate = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.submittedAt = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.createdAt = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
            this.updatedAt = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
             this.nurseId = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 11, encode );
             _offset += 11;
            this.shiftType = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 1, encode );
             _offset += 1;
            this.nurseName = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 50, encode );
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
