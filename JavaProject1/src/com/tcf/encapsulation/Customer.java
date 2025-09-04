package com.tcf.encapsulation;

public class Customer {
	
	private int cid;
	private String name;
	private String ccity;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", ccity=" + ccity + "]";
	}
	

}
