package com.hanrabong.web.seviceImpls;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanrabong.web.domains.HCustDTO;
import com.hanrabong.web.mappers.HCustMapper;
import com.hanrabong.web.services.HCustService;

@Service
public class HCustServiceImpl implements HCustService{
		@Autowired HCustMapper hCustMapper;
		

	public int countHCust() {
		return 1;
				}


	@Override
	public String login(HCustDTO hcust) {
		String result="";
		hCustMapper.loginHcust(hcust);
		if(hCustMapper.loginHcust(hcust)!=null) {
			result="로그인 성공";
		}else {
			result="로그인 실패";
		}
		return result;
	}


	@Override
	public Boolean join(HCustDTO hcust) {
		Boolean a=null;
		hCustMapper.joinHCust(hcust);
		return a;
	}


	@Override
	public HCustDTO mypage(HCustDTO hcust) {
		
		return hCustMapper.loginHcust(hcust);
	}
		}
