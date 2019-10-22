package com.hanrabong.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanrabong.web.domains.HAdminDTO;
import com.hanrabong.web.domains.HCustDTO;

@Repository
public interface HCustMapper {


	public int countHCusts(HCustDTO hcust);
	public void joinHCust(HCustDTO hcust);
	public HCustDTO loginHcust (HCustDTO hcust);
}
