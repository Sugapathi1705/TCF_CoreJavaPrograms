package com.tcf.encapsulation;

public class Customer {
	
	private int cid;
	private String name;
	private String ccity;
	
	//Getter Method
	public int getCid() {
		return cid;
	}
	
	//Setter Method
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	//Getter Method
	public String getName() {
		return name;
	}
	
	//Setter Method
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter Method
	public String getCcity() {
		return ccity;
	}
	
	//Setter Method
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", ccity=" + ccity + "]";
	}
	

}
