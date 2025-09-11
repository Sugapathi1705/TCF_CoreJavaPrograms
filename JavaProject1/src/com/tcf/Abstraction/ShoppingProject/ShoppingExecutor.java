package com.tcf.Abstraction.ShoppingProject;

public class ShoppingExecutor {

	public static void main(String[] args) {
		
		ShoppingMall d=new Dresses();
		Customer c1= new Customer(1,"Sugapathi","Puducherry",d);
		System.out.println(c1);
		c1.order();
		
		ShoppingMall f =new Food();
		Customer c2=new Customer(2,"Nadenapathi","Puducherry",f);
		System.out.println();

	}

}
