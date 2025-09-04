package com.tcf.encapsulation;

public class CustomerExecuter {

	public static void main(String[] args) {
		
		Customer cus1= new Customer();
		Customer cus2= new Customer();
		Customer cus3= new Customer();
		
		cus1.setCid(1);
		cus1.setName("Sugapathi");
		cus1.setCcity("Puducherry");
		System.out.println(cus1);
		
		cus2.setCid(2);
		cus2.setName("Kiruthiga");
		cus2.setCcity("Puducherry");
		System.out.println(cus2);
		
		cus3.setCid(3);
		cus3.setName("Nadenapathi");
		cus3.setCcity("Puducherry");
		System.out.println(cus3);

	}

}
