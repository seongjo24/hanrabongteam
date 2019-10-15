package com.hanrabong.web.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hanrabong.web.domains.HAdminDTO;
import com.hanrabong.web.domains.HCustDTO;


@Component 
public interface HCustService {
	

	public int countHCust();
}
