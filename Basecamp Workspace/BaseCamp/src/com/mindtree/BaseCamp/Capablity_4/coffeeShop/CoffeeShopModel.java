/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	
*@File		CoffeeShopModel.java
*@Since		Feb 5, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.coffeeShop;

public class CoffeeShopModel {

	String name;
	double mobileNo;
	double feedback;
	double averegeRating;
	
	CoffeeShopModel() {
		name="";
		mobileNo=0;
		feedback=0;
	}
	CoffeeShopModel(String name, double mobno,double feedback) {
		this.name=name;
		this.mobileNo=mobno;
		this.feedback=feedback;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getFeedback() {
		return feedback;
	}
	public void setFeedback(double feedback) {
		this.feedback = feedback;
	}
	public double getAveregeRating() {
		return averegeRating;
	}
	public void setAveregeRating(double averegeRating,int count) {
		this.averegeRating = averegeRating/count;
	}
	
}
