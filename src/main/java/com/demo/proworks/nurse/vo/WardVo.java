package com.demo.proworks.nurse.vo;

/**
 * 병동 정보 VO (DB 스키마 기반)
 * 
 * @author Inswave
 * @since 2024.01.01
 */
public class WardVo {
    
    // 기본 정보 (DB 컬럼 기반)
    private Integer wardId;           // 병동 ID (INT PRIMARY KEY)
    private String wardName;          // 병동명 (VARCHAR(50) NOT NULL)
    
    // 기본 생성자
    public WardVo() {}
    
    // 생성자
    public WardVo(Integer wardId, String wardName) {
        this.wardId = wardId;
        this.wardName = wardName;
    }
    
    // Getter/Setter 메서드들
    
    public Integer getWardId() {
        return wardId;
    }
    
    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }
    
    public String getWardName() {
        return wardName;
    }
    
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
    
    @Override
    public String toString() {
        return "WardVo{" +
                "wardId=" + wardId +
                ", wardName='" + wardName + '\'' +
                '}';
    }
} 