package com.demo.proworks.dutyrequest.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "근무신청정보")
public class DutyRequestVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "신청번호")
    private int reqId;

    @ElDtoField(logicalName = "신청일", physicalName = "req_date", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "신청일")
    private String reqDate;

    @ElDtoField(logicalName = "제출일", physicalName = "submitted_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "제출일")
    private String submittedAt;

    @ElDtoField(logicalName = "생성일", physicalName = "created_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "생성일")
    private String createdAt;

    @ElDtoField(logicalName = "수정일", physicalName = "updated_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "수정일")
    private String updatedAt;

    @ElDtoField(logicalName = "간호사번호", physicalName = "nurse_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "간호사번호")
    private int nurseId;

    @ElDtoField(logicalName = "간호사직책", physicalName = "nurse_position", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "간호사직책")
    private String nursePosition;

    @ElDtoField(logicalName = "병동번호", physicalName = "ward_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "병동번호")
    private int wardId;

    @ElDtoField(logicalName = "병동명", physicalName = "ward_name", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "병동명")
    private String wardName;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "검색_신청번호", physicalName = "scReqId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scReqId;

    @ElDtoField(logicalName = "검색_간호사번호", physicalName = "scNurseId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scNurseId;

    @ElDtoField(logicalName = "검색_병동번호", physicalName = "scWardId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scWardId;

    @ElDtoField(logicalName = "검색_신청일시작", physicalName = "scReqDateFrom", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scReqDateFrom;

    @ElDtoField(logicalName = "검색_신청일종료", physicalName = "scReqDateTo", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scReqDateTo;

    // Getters and Setters
    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getNursePosition() {
        return nursePosition;
    }

    public void setNursePosition(String nursePosition) {
        this.nursePosition = nursePosition;
    }

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

    public String getScReqId() {
        return scReqId;
    }

    public void setScReqId(String scReqId) {
        this.scReqId = scReqId;
    }

    public String getScNurseId() {
        return scNurseId;
    }

    public void setScNurseId(String scNurseId) {
        this.scNurseId = scNurseId;
    }

    public String getScWardId() {
        return scWardId;
    }

    public void setScWardId(String scWardId) {
        this.scWardId = scWardId;
    }

    public String getScReqDateFrom() {
        return scReqDateFrom;
    }

    public void setScReqDateFrom(String scReqDateFrom) {
        this.scReqDateFrom = scReqDateFrom;
    }

    public String getScReqDateTo() {
        return scReqDateTo;
    }

    public void setScReqDateTo(String scReqDateTo) {
        this.scReqDateTo = scReqDateTo;
    }

    @Override
    public String toString() {
        return "DutyRequestVo{" +
                "reqId=" + reqId +
                ", reqDate='" + reqDate + '\'' +
                ", submittedAt='" + submittedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", nurseId=" + nurseId +
                ", nursePosition='" + nursePosition + '\'' +
                ", wardId=" + wardId +
                ", wardName='" + wardName + '\'' +
                ", rowStatus='" + rowStatus + '\'' +
                ", scReqId='" + scReqId + '\'' +
                ", scNurseId='" + scNurseId + '\'' +
                ", scWardId='" + scWardId + '\'' +
                ", scReqDateFrom='" + scReqDateFrom + '\'' +
                ", scReqDateTo='" + scReqDateTo + '\'' +
                '}';
    }
} 