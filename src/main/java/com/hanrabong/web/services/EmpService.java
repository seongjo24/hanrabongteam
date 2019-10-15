package com.hanrabong.web.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.EmpDTO;


@Component 
public interface EmpService {
	

	public int countEmp();
}
