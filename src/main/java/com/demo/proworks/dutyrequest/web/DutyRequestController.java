package com.demo.proworks.dutyrequest.web;

import java.util.List;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import com.demo.proworks.dutyrequest.service.DutyRequestService;
import com.demo.proworks.dutyrequest.vo.DutyRequestListVo;
import com.demo.proworks.dutyrequest.vo.DutyRequestVo;

/**
 * @subject		: 근무신청 정보 관련 처리를 하는 컨트롤러
 * @description	: 근무신청 정보 관련 처리를 하는 컨트롤러
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
public class DutyRequestController {
	
    @Resource(name = "dutyRequestServiceImpl")
    private DutyRequestService dutyRequestService;
    
	/**
	 * 페이징을 처리하여 근무신청 목록을 조회한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 근무신청 목록 정보 DutyRequestListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoDutyRequestList")
    @RequestMapping(value = "DmoDutyRequestList")    
    @ElDescription(sub = "근무신청 목록 조회", desc = "페이징을 처리하여 근무신청 목록을 조회한다.")               
    public DutyRequestListVo selectDutyRequestList(DutyRequestVo dutyRequestVo) throws Exception {
    	AppLog.debug("근무신청 목록 조회 로그 테스트 : " + dutyRequestVo);
    	
        List<DutyRequestVo> dutyRequestList = dutyRequestService.selectListDutyRequest(dutyRequestVo);
        long totCnt = dutyRequestService.selectListCountDutyRequest(dutyRequestVo);
        
		DutyRequestListVo retDutyRequestVoList = new DutyRequestListVo();
		retDutyRequestVoList.setDutyRequestVoList(dutyRequestList); 
		retDutyRequestVoList.setNurseVoList(dutyRequestService.selectListNurse(new HashMap()));
		retDutyRequestVoList.setTotalCount(totCnt);

        return retDutyRequestVoList;
    } 

    /**
     * 근무신청 정보를 상세 조회한다.
     * @param dutyRequestVo 근무신청 정보 DutyRequestVo
     * @return 근무신청 정보 DutyRequestListVo
     * @throws Exception
     */
    @ElService(key = "DmoDutyRequestView")    
    @RequestMapping(value = "DmoDutyRequestView")
    @ElDescription(sub = "근무신청 상세 조회", desc = "근무신청 정보를 상세 조회한다.")  
    public DutyRequestListVo selectDutyRequestView(DutyRequestVo dutyRequestVo) throws Exception {
    	DutyRequestVo selectDutyRequestVo = dutyRequestService.selectDutyRequest(dutyRequestVo);
  
        DutyRequestListVo retDutyRequestVoList = new DutyRequestListVo();
        retDutyRequestVoList.setDutyRequestVo(selectDutyRequestVo);
        retDutyRequestVoList.setNurseVoList(dutyRequestService.selectListNurse(new HashMap()));
        
		return retDutyRequestVoList;
    }

    /**
     * 근무신청 정보를 등록 처리한다.
     * @param dutyRequestVo 근무신청 정보 DutyRequestVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoDutyRequestIns")    
    @RequestMapping(value = "DmoDutyRequestIns")
    @ElDescription(sub = "근무신청 등록 처리", desc = "근무신청 정보를 등록 처리한다.")
    @ElValidator(errUrl="")
    public String insertDutyRequest(DutyRequestVo dutyRequestVo) throws Exception {    	
    	dutyRequestService.insertDutyRequest(dutyRequestVo);   
    	return "근무신청 정보가 등록되었습니다.";
    }
        
	/**
	 * 근무신청 정보를 갱신 처리한다.
	 * @param dutyRequestVo 근무신청 정보 DutyRequestVo
	 * @return 처리 결과 메시지
	 * @throws Exception
	 */
	@ElService(key = "DmoDutyRequestUpd")    
    @RequestMapping(value = "DmoDutyRequestUpd")    
    @ElDescription(sub = "근무신청 갱신 처리", desc = "근무신청 정보를 갱신 처리한다.")    
	@ElValidator(errUrl = "")
    public String updateDutyRequest(DutyRequestVo dutyRequestVo) throws Exception {  
    	dutyRequestService.updateDutyRequest(dutyRequestVo);
    	return "근무신청 정보가 갱신되었습니다.";
    }

    /**
     * 근무신청 정보를 삭제 처리한다.
     * @param dutyRequestVo 근무신청 정보 DutyRequestVo
     * @return 처리 결과 메시지
     * @throws Exception
     */
    @ElService(key = "DmoDutyRequestDel")    
    @RequestMapping(value = "DmoDutyRequestDel")
    @ElDescription(sub = "근무신청 삭제 처리", desc = "근무신청 정보를 삭제 처리한다.")    
    public String deleteDutyRequest(DutyRequestVo dutyRequestVo) throws Exception {
    	dutyRequestService.deleteDutyRequest(dutyRequestVo);
    	return "근무신청 정보가 삭제되었습니다.";
    }
} 