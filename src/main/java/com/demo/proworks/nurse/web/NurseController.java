package com.demo.proworks.nurse.web;

import java.util.List;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import com.demo.proworks.nurse.service.NurseService;
import com.demo.proworks.nurse.vo.NurseListVo;
import com.demo.proworks.nurse.vo.NurseVo;

/**
 * @subject		: 간호사 정보 관련 처리를 하는 컨트롤러
 * @description	: 간호사 정보 관련 처리를 하는 컨트롤러
 * @author		: 개발팀
 * @since 		: 2025/07/10
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2025/07/10		개발팀			최초 생성
 * 
 */
@Controller
@RequestMapping(value = "/nurse")
public class NurseController {
	
    @Resource(name = "nurseServiceImpl")
    private NurseService nurseService;
    
	/**
	 * 페이징을 처리하여 간호사 목록을 조회한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 간호사 목록 정보 NurseListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoNurseList")
    @RequestMapping(value = {"DmoNurseList", "/list.pwkjson"})    
    @ElDescription(sub = "간호사 목록 조회", desc = "페이징을 처리하여 간호사 목록을 조회한다.")               
    public NurseListVo selectNurseList(NurseVo nurseVo) throws Exception {
    	AppLog.debug("간호사 목록 조회 로그 테스트 : " + nurseVo);
    	
    	// 페이지 기본값 설정
    	if (nurseVo.getPageIndex() <= 0) {
    	    nurseVo.setPageIndex(1);
    	}
    	if (nurseVo.getPageSize() <= 0) {
    	    nurseVo.setPageSize(10);
    	}
    	
        List<NurseVo> nurseList = nurseService.selectListNurse(nurseVo);
        long totCnt = nurseService.selectListCountNurse(nurseVo);
        
		NurseListVo retNurseVoList = new NurseListVo();
		retNurseVoList.setNurseVoList(nurseList); 
		retNurseVoList.setWardVoList(nurseService.selectListWard(new HashMap()));
		retNurseVoList.setTotalCount(totCnt);

        return retNurseVoList;
    } 

    /**
     * 간호사 정보를 상세 조회한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 간호사 정보 NurseListVo
     * @throws Exception
     */
    @ElService(key = "DmoNurseView")    
    @RequestMapping(value = {"DmoNurseView", "/view.pwkjson"})
    @ElDescription(sub = "간호사 상세 조회", desc = "간호사 정보를 상세 조회한다.")  
    public NurseListVo selectNurseView(NurseVo nurseVo) throws Exception {
    	NurseVo selectNurseVo = nurseService.selectNurse(nurseVo);
  
        NurseListVo retNurseVoList = new NurseListVo();
        retNurseVoList.setNurseVo(selectNurseVo);
        retNurseVoList.setWardVoList(nurseService.selectListWard(new HashMap()));
        
		return retNurseVoList;
    }

    /**
     * 간호사 정보를 등록 처리한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoNurseIns")    
    @RequestMapping(value = {"DmoNurseIns", "/insert.pwkjson"})
    @ElDescription(sub = "간호사 등록 처리", desc = "간호사 정보를 등록 처리한다.")
    @ElValidator(errUrl="")
    public String insertNurse(NurseVo nurseVo) throws Exception {
    	// 생성일, 수정일 자동 설정
    	if (nurseVo.getCreatedAt() == null || nurseVo.getCreatedAt().isEmpty()) {
    	    nurseVo.setCreatedAt(getCurrentDate());
    	}
    	if (nurseVo.getUpdatedAt() == null || nurseVo.getUpdatedAt().isEmpty()) {
    	    nurseVo.setUpdatedAt(getCurrentDate());
    	}
    	// 병동ID 기본값 설정 (내과병동)
    	if (nurseVo.getWardId() == 0) {
    	    nurseVo.setWardId(1);
    	}
    	
    	nurseService.insertNurse(nurseVo);   
    	return "간호사 정보가 등록되었습니다.";
    }
        
	/**
	 * 간호사 정보를 갱신 처리한다.
	 * @param nurseVo 간호사 정보 NurseVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoNurseUpd")    
    @RequestMapping(value = {"DmoNurseUpd", "/update.pwkjson"})    
    @ElDescription(sub = "간호사 갱신 처리", desc = "간호사 정보를 갱신 처리한다.")    
	@ElValidator(errUrl = "")
    public String updateNurse(NurseVo nurseVo) throws Exception {
		// 수정일 자동 설정
		nurseVo.setUpdatedAt(getCurrentDate());
		
    	nurseService.updateNurse(nurseVo);
    	return "간호사 정보가 갱신되었습니다.";
    }

    /**
     * 간호사 정보를 삭제 처리한다.
     * @param nurseVo 간호사 정보 NurseVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoNurseDel")    
    @RequestMapping(value = {"DmoNurseDel", "/delete.pwkjson"})
    @ElDescription(sub = "간호사 삭제 처리", desc = "간호사 정보를 삭제 처리한다.")    
    public String deleteNurse(NurseVo nurseVo) throws Exception {
    	nurseService.deleteNurse(nurseVo);
    	return "간호사 정보가 삭제되었습니다.";
    }
    
    /**
     * 현재 날짜를 YYYY-MM-DD 형식으로 반환한다.
     * @return 현재 날짜 문자열
     */
    private String getCurrentDate() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new java.util.Date());
    }
} 