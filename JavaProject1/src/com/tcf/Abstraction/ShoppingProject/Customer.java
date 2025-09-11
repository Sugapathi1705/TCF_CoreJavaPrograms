package com.tcf.Abstraction.ShoppingProject;

public class Customer {
	
	private int cid;
	private String name;
	private String city;  
	
	private ShoppingMall sh;
	
	public Customer(int cid,String name,String city,ShoppingMall sh)
	{
		super();
		this.cid=cid;
		this.name=name;
		this.city=city;
		this.sh=sh;
	}
	
	public void order()
	{
		sh.purchase();
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String setCity()
	{
		return city;
	}
	public void getCity(String city)
	{
		this.city=city;
	}
	
	@Override
	public String toString()
	{
		return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
