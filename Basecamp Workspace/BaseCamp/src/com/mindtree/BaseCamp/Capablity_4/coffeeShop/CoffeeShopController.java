/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	
*@File		CoffeeShopController.java
*@Since		Feb 5, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.coffeeShop;

import Utility.KeybordUtil;

public class CoffeeShopController {

	
	/*
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of customer");
		int len=KeybordUtil.getint();
		CoffeeShopModel []obj=new CoffeeShopModel[len];
		CoffeeShopModel obj1=new CoffeeShopModel();
		
		for(int i=0;i<len;i++) {
			System.out.print("Enter the "+(i+1)+" Customer name :");
			KeybordUtil.getline();
			String name=KeybordUtil.getline();
			System.out.print("Enter the mobile no :");
			double number=KeybordUtil.getDouble();
			System.out.print("Enter the rating");
			double rating=KeybordUtil.getDouble();
			obj1.setAveregeRating(rating+obj1.getAveregeRating(), i+1);
			obj[i]=new CoffeeShopModel(name,number,rating);
		}
		for(int i=0;i<len;i++)
		System.out.println(obj[i]);
		System.out.println("Averege rating :"+obj1.getAveregeRating());
	}

}
