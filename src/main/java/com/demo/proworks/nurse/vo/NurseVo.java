package com.demo.proworks.nurse.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "간호사정보")
public class NurseVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "간호사번호", physicalName = "nurse_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "간호사번호")
    private int nurseId;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "사원번호")
    private int empno;

    @ElDtoField(logicalName = "간호사명", physicalName = "ename", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "간호사명")
    private String nurseName;

    @ElDtoField(logicalName = "직책", physicalName = "position", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "직책")
    private String position;

    @ElDtoField(logicalName = "특이사항", physicalName = "special_note", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 255, dotLen = 0, baseValue = "", desc = "특이사항")
    private String specialNote;

    @ElDtoField(logicalName = "생성일", physicalName = "created_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "생성일")
    private String createdAt;

    @ElDtoField(logicalName = "수정일", physicalName = "updated_at", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "수정일")
    private String updatedAt;

    @ElDtoField(logicalName = "입사일", physicalName = "hire_date", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "입사일")
    private String hireDate;

    @ElDtoField(logicalName = "병동번호", physicalName = "ward_id", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "병동번호")
    private int wardId;

    @ElDtoField(logicalName = "경력", physicalName = "carrer", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 11, dotLen = 0, baseValue = "", desc = "경력")
    private int carrer;

    @ElDtoField(logicalName = "병동명", physicalName = "ward_name", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 50, dotLen = 0, baseValue = "", desc = "병동명")
    private String wardName;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "검색_간호사번호", physicalName = "scNurseId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scNurseId;

    @ElDtoField(logicalName = "검색_간호사명", physicalName = "scNurseName", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scNurseName;

    @ElDtoField(logicalName = "검색_직책", physicalName = "scPosition", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scPosition;

    @ElDtoField(logicalName = "검색_병동번호", physicalName = "scWardId", type = "String", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scWardId;

    // Getters and Setters
    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
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

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    public int getCarrer() {
        return carrer;
    }

    public void setCarrer(int carrer) {
        this.carrer = carrer;
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

    public String getScNurseId() {
        return scNurseId;
    }

    public void setScNurseId(String scNurseId) {
        this.scNurseId = scNurseId;
    }

    public String getScNurseName() {
        return scNurseName;
    }

    public void setScNurseName(String scNurseName) {
        this.scNurseName = scNurseName;
    }

    public String getScPosition() {
        return scPosition;
    }

    public void setScPosition(String scPosition) {
        this.scPosition = scPosition;
    }

    public String getScWardId() {
        return scWardId;
    }

    public void setScWardId(String scWardId) {
        this.scWardId = scWardId;
    }

    @Override
    public String toString() {
        return "NurseVo{" +
                "nurseId=" + nurseId +
                ", empno=" + empno +
                ", nurseName='" + nurseName + '\'' +
                ", position='" + position + '\'' +
                ", specialNote='" + specialNote + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", wardId=" + wardId +
                ", carrer=" + carrer +
                ", wardName='" + wardName + '\'' +
                ", rowStatus='" + rowStatus + '\'' +
                ", scNurseId='" + scNurseId + '\'' +
                ", scNurseName='" + scNurseName + '\'' +
                ", scPosition='" + scPosition + '\'' +
                ", scWardId='" + scWardId + '\'' +
                '}';
    }
} 