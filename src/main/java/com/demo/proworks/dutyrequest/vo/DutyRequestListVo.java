package com.demo.proworks.dutyrequest.vo;

import java.util.List;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.demo.proworks.nurse.vo.NurseVo;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "근무신청정보목록")
public class DutyRequestListVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "근무신청정보리스트", physicalName = "dutyRequestVoList", type = "List", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "근무신청정보리스트")
    private List<DutyRequestVo> dutyRequestVoList;

    @ElDtoField(logicalName = "근무신청정보", physicalName = "dutyRequestVo", type = "DutyRequestVo", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "근무신청정보")
    private DutyRequestVo dutyRequestVo;

    @ElDtoField(logicalName = "간호사정보리스트", physicalName = "nurseVoList", type = "List", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "간호사정보리스트")
    private List<NurseVo> nurseVoList;

    @ElDtoField(logicalName = "전체건수", physicalName = "totalCount", type = "long", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "전체건수")
    private long totalCount;

    public List<DutyRequestVo> getDutyRequestVoList() {
        return dutyRequestVoList;
    }

    public void setDutyRequestVoList(List<DutyRequestVo> dutyRequestVoList) {
        this.dutyRequestVoList = dutyRequestVoList;
    }

    public DutyRequestVo getDutyRequestVo() {
        return dutyRequestVo;
    }

    public void setDutyRequestVo(DutyRequestVo dutyRequestVo) {
        this.dutyRequestVo = dutyRequestVo;
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
        return "DutyRequestListVo{" +
                "dutyRequestVoList=" + dutyRequestVoList +
                ", dutyRequestVo=" + dutyRequestVo +
                ", nurseVoList=" + nurseVoList +
                ", totalCount=" + totalCount +
                '}';
    }
} 