package com.demo.proworks.nurse.vo;

import java.util.List;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.demo.proworks.ward.vo.WardVo;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "간호사정보목록")
public class NurseListVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "간호사정보리스트", physicalName = "nurseVoList", type = "List", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "간호사정보리스트")
    private List<NurseVo> nurseVoList;

    @ElDtoField(logicalName = "간호사정보", physicalName = "nurseVo", type = "NurseVo", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "간호사정보")
    private NurseVo nurseVo;

    @ElDtoField(logicalName = "병동정보리스트", physicalName = "wardVoList", type = "List", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "병동정보리스트")
    private List<WardVo> wardVoList;

    @ElDtoField(logicalName = "전체건수", physicalName = "totalCount", type = "long", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "전체건수")
    private long totalCount;

    public List<NurseVo> getNurseVoList() {
        return nurseVoList;
    }

    public void setNurseVoList(List<NurseVo> nurseVoList) {
        this.nurseVoList = nurseVoList;
    }

    public NurseVo getNurseVo() {
        return nurseVo;
    }

    public void setNurseVo(NurseVo nurseVo) {
        this.nurseVo = nurseVo;
    }

    public List<WardVo> getWardVoList() {
        return wardVoList;
    }

    public void setWardVoList(List<WardVo> wardVoList) {
        this.wardVoList = wardVoList;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "NurseListVo{" +
                "nurseVoList=" + nurseVoList +
                ", nurseVo=" + nurseVo +
                ", wardVoList=" + wardVoList +
                ", totalCount=" + totalCount +
                '}';
    }
} 