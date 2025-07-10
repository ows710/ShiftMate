package com.demo.proworks.ward.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "병동정보")
public class WardVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "병동번호", physicalName = "ward_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "병동번호")
    private int wardId;

    @ElDtoField(logicalName = "병동명", physicalName = "ward_name", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "병동명")
    private String wardName;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "검색_병동번호", physicalName = "scWardId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scWardId;

    @ElDtoField(logicalName = "검색_병동명", physicalName = "scWardName", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scWardName;

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(String rowStatus) {
        this.rowStatus = rowStatus;
    }

    public String getScWardId() {
        return scWardId;
    }

    public void setScWardId(String scWardId) {
        this.scWardId = scWardId;
    }

    public String getScWardName() {
        return scWardName;
    }

    public void setScWardName(String scWardName) {
        this.scWardName = scWardName;
    }

    @Override
    public String toString() {
        return "WardVo{" +
                "wardId=" + wardId +
                ", wardName='" + wardName + '\'' +
                ", rowStatus='" + rowStatus + '\'' +
                ", scWardId='" + scWardId + '\'' +
                ", scWardName='" + scWardName + '\'' +
                '}';
    }
} 