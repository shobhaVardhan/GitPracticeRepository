package com.hibernatedemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class AdharCard {

	@Id
	private int uid;
	private String address;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
