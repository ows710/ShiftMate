package com.demo.proworks.ward.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import com.demo.proworks.ward.service.WardService;
import com.demo.proworks.ward.vo.WardListVo;
import com.demo.proworks.ward.vo.WardVo;

/**
 * @subject		: 병동 정보 관련 처리를 하는 컨트롤러
 * @description	: 병동 정보 관련 처리를 하는 컨트롤러
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
public class WardController {
	
    @Resource(name = "wardServiceImpl")
    private WardService wardService;
    
	/**
	 * 페이징을 처리하여 병동 목록을 조회한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 병동 목록 정보 WardListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoWardList")
    @RequestMapping(value = "DmoWardList")    
    @ElDescription(sub = "병동 목록 조회", desc = "페이징을 처리하여 병동 목록을 조회한다.")               
    public WardListVo selectWardList(WardVo wardVo) throws Exception {
    	AppLog.debug("병동 목록 조회 로그 테스트 : " + wardVo);
    	
        List<WardVo> wardList = wardService.selectListWard(wardVo);
        long totCnt = wardService.selectListCountWard(wardVo);
        
		WardListVo retWardVoList = new WardListVo();
		retWardVoList.setWardVoList(wardList); 
		retWardVoList.setTotalCount(totCnt);

        return retWardVoList;
    } 

    /**
     * 병동 정보를 상세 조회한다.
     * @param wardVo 병동 정보 WardVo
     * @return 병동 정보 WardListVo
     * @throws Exception
     */
    @ElService(key = "DmoWardView")    
    @RequestMapping(value = "DmoWardView")
    @ElDescription(sub = "병동 상세 조회", desc = "병동 정보를 상세 조회한다.")  
    public WardListVo selectWardView(WardVo wardVo) throws Exception {
    	WardVo selectWardVo = wardService.selectWard(wardVo);
  
        WardListVo retWardVoList = new WardListVo();
        retWardVoList.setWardVo(selectWardVo);
        
		return retWardVoList;
    }

    /**
     * 병동 정보를 등록 처리한다.
     * @param wardVo 병동 정보 WardVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoWardIns")    
    @RequestMapping(value = "DmoWardIns")
    @ElDescription(sub = "병동 등록 처리", desc = "병동 정보를 등록 처리한다.")
    @ElValidator(errUrl="")
    public String insertWard(WardVo wardVo) throws Exception {    	
    	wardService.insertWard(wardVo);   
    	return "병동 정보가 등록되었습니다.";
    }
        
	/**
	 * 병동 정보를 갱신 처리한다.
	 * @param wardVo 병동 정보 WardVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoWardUpd")    
    @RequestMapping(value = "DmoWardUpd")    
    @ElDescription(sub = "병동 갱신 처리", desc = "병동 정보를 갱신 처리한다.")    
	@ElValidator(errUrl = "")
    public String updateWard(WardVo wardVo) throws Exception {  
    	wardService.updateWard(wardVo);
    	return "병동 정보가 갱신되었습니다.";
    }

    /**
     * 병동 정보를 삭제 처리한다.
     * @param wardVo 병동 정보 WardVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoWardDel")    
    @RequestMapping(value = "DmoWardDel")
    @ElDescription(sub = "병동 삭제 처리", desc = "병동 정보를 삭제 처리한다.")    
    public String deleteWard(WardVo wardVo) throws Exception {
    	wardService.deleteWard(wardVo);
    	return "병동 정보가 삭제되었습니다.";
    }
} 