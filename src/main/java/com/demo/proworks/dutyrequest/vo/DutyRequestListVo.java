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
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "근무신청정보목록")
public class DutyRequestListVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    private int _offset;

    public DutyRequestListVo(){
        this._offset = 0;
    }

    public DutyRequestListVo(int iOffset){
        this._offset = iOffset;
    }

    @ElDtoField(logicalName = "희망근무요청카운트", physicalName = "dutyRequestCnt", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "근무신청정보수", attr = "")
    private int dutyRequestCnt;

    @ElDtoField(logicalName = "근무신청정보List", physicalName = "dutyRequestVoList", type = "", typeKind = "List", fldYn = "Yes", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "dutyRequestCnt", desc = "근무신청정보리스트", attr = "")
    private java.util.List<com.demo.proworks.dutyrequest.vo.DutyRequestVo> dutyRequestVoList;

    @ElDtoField(logicalName = "근무신청정보", physicalName = "dutyRequestVo", type = "", typeKind = "Vo", fldYn = "No", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "근무신청정보", attr = "")
    private com.demo.proworks.dutyrequest.vo.DutyRequestVo dutyRequestVo;

    @ElVoField(physicalName = "dutyRequestCnt")
    public int getDutyRequestCnt(){
        return dutyRequestVoList != null ? dutyRequestVoList.size() : 0 ;
    }

    @ElVoField(physicalName = "dutyRequestVoList")
    public java.util.List<com.demo.proworks.dutyrequest.vo.DutyRequestVo> getDutyRequestVoList(){
        return dutyRequestVoList;
    }

    @ElVoField(physicalName = "dutyRequestVoList")
    public void setDutyRequestVoList(java.util.List<com.demo.proworks.dutyrequest.vo.DutyRequestVo> dutyRequestVoList){
        this.dutyRequestVoList = dutyRequestVoList;
    }

    @ElVoField(physicalName = "dutyRequestVo")
    public com.demo.proworks.dutyrequest.vo.DutyRequestVo getDutyRequestVo(){
        return dutyRequestVo;
    }

    @ElVoField(physicalName = "dutyRequestVo")
    public void setDutyRequestVo(com.demo.proworks.dutyrequest.vo.DutyRequestVo dutyRequestVo){
        this.dutyRequestVo = dutyRequestVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DutyRequestListVo [");
        sb.append("dutyRequestCnt").append("=").append(dutyRequestCnt).append(",");
        sb.append("dutyRequestVoList").append("=").append(dutyRequestVoList).append(",");
        sb.append("dutyRequestVo").append("=").append(dutyRequestVo);
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
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.dutyRequestVoList==null ? 0 : this.dutyRequestVoList.size() , 10) );
            for( int i=0 ; dutyRequestVoList != null && i < dutyRequestVoList.size() ; i++ ) {
                com.demo.proworks.dutyrequest.vo.DutyRequestVo vo = (com.demo.proworks.dutyrequest.vo.DutyRequestVo)dutyRequestVoList.get(i);
                out.write( vo.marshalFld(encode) );
            }
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
             this.dutyRequestCnt = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 10, encode );
             _offset += 10;

             {
                 java.util.List<com.demo.proworks.dutyrequest.vo.DutyRequestVo> alList = new java.util.ArrayList<com.demo.proworks.dutyrequest.vo.DutyRequestVo>();
                 for( int i=0 ; i < dutyRequestCnt ; i++ ) {
                     com.demo.proworks.dutyrequest.vo.DutyRequestVo vo = new com.demo.proworks.dutyrequest.vo.DutyRequestVo(_offset);
                     vo.unMarshalFld( bytes , encode );
                     alList.add( vo );
                     _offset = vo.getOffset();
                 }
                 this.dutyRequestVoList = alList;
             }

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
        for( int i=0 ; dutyRequestVoList != null && i < dutyRequestVoList.size() ; i++ ) {
            com.demo.proworks.dutyrequest.vo.DutyRequestVo vo = (com.demo.proworks.dutyrequest.vo.DutyRequestVo)dutyRequestVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.dutyRequestVo != null ) this.dutyRequestVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; dutyRequestVoList != null && i < dutyRequestVoList.size() ; i++ ) {
            com.demo.proworks.dutyrequest.vo.DutyRequestVo vo = (com.demo.proworks.dutyrequest.vo.DutyRequestVo)dutyRequestVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.dutyRequestVo != null ) this.dutyRequestVo._xStreamDec();
    }


}
