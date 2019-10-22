package com.hanrabong.web.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.hanrabong.web.domains.HCustDTO;


@Component 
public interface HCustService {
	
	public String login(HCustDTO hcust);
	public Boolean join(HCustDTO hcust);
	public int countHCust();
	public HCustDTO mypage(HCustDTO hcust);
}
