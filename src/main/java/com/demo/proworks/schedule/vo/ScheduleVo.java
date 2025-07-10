package com.demo.proworks.schedule.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "스케줄정보")
public class ScheduleVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "근무일", physicalName = "shift_date", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "근무일")
    private String shiftDate;

    @ElDtoField(logicalName = "간호사번호", physicalName = "nurse_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "간호사번호")
    private int nurseId;

    @ElDtoField(logicalName = "자동여부", physicalName = "is_auto", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 1, dotLen = 0, baseValue = "", desc = "자동여부")
    private String isAuto;

    @ElDtoField(logicalName = "생성일", physicalName = "created_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "생성일")
    private String createdAt;

    @ElDtoField(logicalName = "수정일", physicalName = "updated_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "수정일")
    private String updatedAt;

    @ElDtoField(logicalName = "간호사명", physicalName = "nurse_name", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "간호사명")
    private String nurseName;

    @ElDtoField(logicalName = "고용일", physicalName = "hire_date", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "고용일")
    private String hireDate;

    @ElDtoField(logicalName = "근무유형", physicalName = "shift_type", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "근무유형")
    private String shiftType;

    @ElDtoField(logicalName = "간호사직책", physicalName = "nurse_position", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "간호사직책")
    private String nursePosition;

    @ElDtoField(logicalName = "병동번호", physicalName = "ward_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "병동번호")
    private int wardId;

    @ElDtoField(logicalName = "병동명", physicalName = "ward_name", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "병동명")
    private String wardName;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "검색_근무일시작", physicalName = "scShiftDateFrom", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scShiftDateFrom;

    @ElDtoField(logicalName = "검색_근무일종료", physicalName = "scShiftDateTo", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scShiftDateTo;

    @ElDtoField(logicalName = "검색_간호사번호", physicalName = "scNurseId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scNurseId;

    @ElDtoField(logicalName = "검색_병동번호", physicalName = "scWardId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scWardId;

    @ElDtoField(logicalName = "검색_근무유형", physicalName = "scShiftType", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scShiftType;

    @ElDtoField(logicalName = "검색_자동여부", physicalName = "scIsAuto", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scIsAuto;

    // Getters and Setters
    public String getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(String shiftDate) {
        this.shiftDate = shiftDate;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(String isAuto) {
        this.isAuto = isAuto;
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

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
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

    public String getScShiftDateFrom() {
        return scShiftDateFrom;
    }

    public void setScShiftDateFrom(String scShiftDateFrom) {
        this.scShiftDateFrom = scShiftDateFrom;
    }

    public String getScShiftDateTo() {
        return scShiftDateTo;
    }

    public void setScShiftDateTo(String scShiftDateTo) {
        this.scShiftDateTo = scShiftDateTo;
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

    public String getScShiftType() {
        return scShiftType;
    }

    public void setScShiftType(String scShiftType) {
        this.scShiftType = scShiftType;
    }

    public String getScIsAuto() {
        return scIsAuto;
    }

    public void setScIsAuto(String scIsAuto) {
        this.scIsAuto = scIsAuto;
    }

    @Override
    public String toString() {
        return "ScheduleVo{" +
                "shiftDate='" + shiftDate + '\'' +
                ", nurseId=" + nurseId +
                ", isAuto='" + isAuto + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", shiftType='" + shiftType + '\'' +
                ", nursePosition='" + nursePosition + '\'' +
                ", wardId=" + wardId +
                ", wardName='" + wardName + '\'' +
                ", rowStatus='" + rowStatus + '\'' +
                ", scShiftDateFrom='" + scShiftDateFrom + '\'' +
                ", scShiftDateTo='" + scShiftDateTo + '\'' +
                ", scNurseId='" + scNurseId + '\'' +
                ", scWardId='" + scWardId + '\'' +
                ", scShiftType='" + scShiftType + '\'' +
                ", scIsAuto='" + scIsAuto + '\'' +
                '}';
    }
} 