package com.alpha.certificate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Certificate {
	
	@Id
	Integer cid;
	Integer cyear;
	String ccollege;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid=cid;
	}
	public Integer getCyear() {
		return cyear;
	}
	public void setCyear(Integer cyear) {
		this.cyear=cyear;
	}
	public String getCcollege() {
		return ccollege;
	}
	public void setCcollege(String ccollege) {
		this.ccollege=ccollege;
	}
}
