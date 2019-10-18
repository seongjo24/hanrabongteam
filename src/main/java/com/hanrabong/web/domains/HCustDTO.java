package com.hanrabong.web.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class HCustDTO implements Serializable{
	private static final long serialVersionUID= 1L;

	private String cnum, cid, cpw, cname, gen, birth, skinProb, skinType, child, addr, tel, cpoint;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCpw() {
		return cpw;
	}

	public void setCpw(String cpw) {
		this.cpw = cpw;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

}



