package com.demo.proworks.dept.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.proworks.dept.service.DeptService;
import com.demo.proworks.dept.vo.DeptVo;
import com.demo.proworks.dept.vo.DeptListVo;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @subject : 부서정보 관련 처리를 담당하는 컨트롤러
 * @description : 부서정보 관련 처리를 담당하는 컨트롤러
 * @author : 오원석
 * @since : 2025/06/10
 * @modification ===========================================================
 *               DATE AUTHOR DESC
 *               ===========================================================
 *               2025/06/10 오원석 최초 생성
 * 
 */
@Controller
public class DeptController {

	/** DeptService */
	@Resource(name = "deptServiceImpl")
	private DeptService deptService;

	/**
	 * 부서정보 목록을 조회합니다.
	 *
	 * @param deptVo 부서정보
	 * @return 목록조회 결과
	 * @throws Exception
	 */
	@ElService(key = "SVC0001List")
	@RequestMapping(value = "SVC0001List")
	@ElDescription(sub = "부서정보 목록조회", desc = "페이징을 처리하여 부서정보 목록 조회를 한다.")
	public DeptListVo selectListDept(DeptVo deptVo) throws Exception {

		List<DeptVo> deptList = deptService.selectListDept(deptVo);
		long totCnt = deptService.selectListCountDept(deptVo);

		DeptListVo retDeptList = new DeptListVo();
		retDeptList.setDeptVoList(deptList);
		retDeptList.setTotalCount(totCnt);
		retDeptList.setPageSize(deptVo.getPageSize());
		retDeptList.setPageIndex(deptVo.getPageIndex());

		return retDeptList;
	}

	/**
	 * 부서정보을 단건 조회 처리 한다.
	 *
	 * @param deptVo 부서정보
	 * @return 단건 조회 결과
	 * @throws Exception
	 */
	@ElService(key = "SVC0001UpdView")
	@RequestMapping(value = "SVC0001UpdView")
	@ElDescription(sub = "부서정보 갱신 폼을 위한 조회", desc = "부서정보 갱신 폼을 위한 조회를 한다.")
	public DeptVo selectDept(DeptVo deptVo) throws Exception {
		DeptVo selectDeptVo = deptService.selectDept(deptVo);

		return selectDeptVo;
	}

	/**
	 * 부서정보를 등록 처리 한다.
	 *
	 * @param deptVo 부서정보
	 * @throws Exception
	 */
	@ElService(key = "SVC0001Ins")
	@RequestMapping(value = "SVC0001Ins")
	@ElDescription(sub = "부서정보 등록처리", desc = "부서정보를 등록 처리 한다.")
	public void insertDept(DeptVo deptVo) throws Exception {
		deptService.insertDept(deptVo);
	}

	/**
	 * 부서정보를 갱신 처리 한다.
	 *
	 * @param deptVo 부서정보
	 * @throws Exception
	 */
	@ElService(key = "SVC0001Upd")
	@RequestMapping(value = "SVC0001Upd")
	@ElValidator(errUrl = "/dept/deptRegister", errContinue = true)
	@ElDescription(sub = "부서정보 갱신처리", desc = "부서정보를 갱신 처리 한다.")
	public void updateDept(DeptVo deptVo) throws Exception {

		deptService.updateDept(deptVo);
	}

	/**
	 * 부서정보를 삭제 처리한다.
	 *
	 * @param deptVo 부서정보
	 * @throws Exception
	 */
	@ElService(key = "SVC0001Del")
	@RequestMapping(value = "SVC0001Del")
	@ElDescription(sub = "부서정보 삭제처리", desc = "부서정보를 삭제 처리한다.")
	public void deleteDept(DeptVo deptVo) throws Exception {
		deptService.deleteDept(deptVo);
	}

	/**
	 * 부서 정보를 갱신 처리 한다.
	 *
	 * @param deptVoList 부서 정보
	 * @throws Exception
	 */
	@ElService(key = "SVC0001UpdTest")
	@RequestMapping(value = "SVC0001UpdTest")
	@ElDescription(sub = "부서 정보 다중갱신처리 (List 전송 테스트)", desc = "부서 정보를 다중갱신 처리 한다.(List 전송 테스트)")
	public void updateDeptTest(DeptListVo deptVoList) throws Exception {
		System.out.println("변경 : " + deptVoList.getDeptVoList());

		int cnt = deptVoList.getDeptVoList().size();

		for (int _i = 0; _i < cnt; _i++) {
			deptService.updateDept(deptVoList.getDeptVoList().get(_i));
		}
	}
	
	/**
	 * 부서정보를 신규입력 처리 한다.
	 *
	 * @param deptVoList 부서정보
	 * @throws Exception
	 */
	@ElService(key = "SVC0001InsTest")
	@RequestMapping(value = "SVC0001InsTest")
	@ElDescription(sub = "부서정보 등록처리", desc = "부서정보를 등록 처리 한다.")
	public void insertDeptTest(DeptListVo deptVoList) throws Exception {

		int cnt = deptVoList.getDeptVoList().size();

		for (int _i = 0; _i < cnt; _i++) {
			deptService.insertDept(deptVoList.getDeptVoList().get(_i));
		}
	}
	
	/**
	 * 부서정보를 다중삭제 처리한다.
	 *
	 * @param deptVoList 부서정보
	 * @throws Exception
	 */
	@ElService(key = "SVC0001DelTest")
	@RequestMapping(value = "SVC0001DelTest")
	@ElDescription(sub = "부서정보 다중 입력, 수정, 삭제처리(List 전송 테스트)", desc = "부서정보를 다중 입력, 수정, 삭제 처리한다. (List 전송 테스트)")
	public void deleteDeptTest(DeptListVo deptVoList) throws Exception {
		int cnt = deptVoList.getDeptVoList().size();

		for (int _i = 0; _i < cnt; _i++) {
			deptService.deleteDept(deptVoList.getDeptVoList().get(_i));
		}
	}
	
	/**
	 * 부서정보를 다중 입력, 수정, 삭제 처리한다.
	 *
	 * @param deptVoList 부서정보
	 * @throws Exception
	 */
	@ElService(key = "SVC0001ModTest")
	@RequestMapping(value = "SVC0001ModTest")
	@ElDescription(sub = "부서정보 다중 입력, 수정, 삭제처리(List 전송 테스트)", desc = "부서정보를 다중 입력, 수정, 삭제 처리한다. (List 전송 테스트)")
	public void modifyDeptTest(DeptListVo deptVoList) throws Exception {

		for (DeptVo dept : deptVoList.getDeptVoList()) {
         switch (dept.getRowStatus()) {
         case "D":
            deptService.deleteDept(dept);
            break;
         case "U":
            deptService.updateDept(dept);
            break;
         case "C":
            deptService.insertDept(dept);
            break;
         }
      }
	}
	

}
