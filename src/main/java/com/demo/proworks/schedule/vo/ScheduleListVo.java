package com.demo.proworks.schedule.vo;

import java.util.List;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.demo.proworks.nurse.vo.NurseVo;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "스케줄정보목록")
public class ScheduleListVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "스케줄정보리스트", physicalName = "scheduleVoList", type = "List", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "스케줄정보리스트")
    private List<ScheduleVo> scheduleVoList;

    @ElDtoField(logicalName = "스케줄정보", physicalName = "scheduleVo", type = "ScheduleVo", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "스케줄정보")
    private ScheduleVo scheduleVo;

    @ElDtoField(logicalName = "간호사정보리스트", physicalName = "nurseVoList", type = "List", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "간호사정보리스트")
    private List<NurseVo> nurseVoList;

    @ElDtoField(logicalName = "전체건수", physicalName = "totalCount", type = "long", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "전체건수")
    private long totalCount;

    public List<ScheduleVo> getScheduleVoList() {
        return scheduleVoList;
    }

    public void setScheduleVoList(List<ScheduleVo> scheduleVoList) {
        this.scheduleVoList = scheduleVoList;
    }

    public ScheduleVo getScheduleVo() {
        return scheduleVo;
    }

    public void setScheduleVo(ScheduleVo scheduleVo) {
        this.scheduleVo = scheduleVo;
    }

    public List<NurseVo> getNurseVoList() {
        return nurseVoList;
    }

    public void setNurseVoList(List<NurseVo> nurseVoList) {
        this.nurseVoList = nurseVoList;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "ScheduleListVo{" +
                "scheduleVoList=" + scheduleVoList +
                ", scheduleVo=" + scheduleVo +
                ", nurseVoList=" + nurseVoList +
                ", totalCount=" + totalCount +
                '}';
    }
} 