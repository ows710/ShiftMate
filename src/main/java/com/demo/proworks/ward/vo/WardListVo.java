package com.demo.proworks.ward.vo;

import java.util.List;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "병동정보목록")
public class WardListVo extends com.demo.proworks.cmmn.ProworksCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "병동정보리스트", physicalName = "wardVoList", type = "List", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "병동정보리스트")
    private List<WardVo> wardVoList;

    @ElDtoField(logicalName = "병동정보", physicalName = "wardVo", type = "WardVo", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "병동정보")
    private WardVo wardVo;

    @ElDtoField(logicalName = "전체건수", physicalName = "totalCount", type = "long", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "전체건수")
    private long totalCount;

    public List<WardVo> getWardVoList() {
        return wardVoList;
    }

    public void setWardVoList(List<WardVo> wardVoList) {
        this.wardVoList = wardVoList;
    }

    public WardVo getWardVo() {
        return wardVo;
    }

    public void setWardVo(WardVo wardVo) {
        this.wardVo = wardVo;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "WardListVo{" +
                "wardVoList=" + wardVoList +
                ", wardVo=" + wardVo +
                ", totalCount=" + totalCount +
                '}';
    }
} 