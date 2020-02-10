/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	KO: 1. Proper entity classes identified and implemented?
			KO: 2. Ability to initialize data members using constructors and setter methods
*@File		SudoBank.java
*@Since		Feb 4, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.sudoBank;

public class SudoBank {
	
	int Customer_id;
	String customer_name;
	String customer_Add;
	String Account_type;
	double curr_Balance;
	
	public SudoBank()
	{
		this.Customer_id=000;
		this.customer_name="Customer Name";
		this.customer_Add="Bhubneswer";
		this.Account_type="Saving";
		this.curr_Balance=00.00;
	}
	
	public SudoBank(int id,String name,String add) {
		this.Customer_id=id;
		this.customer_name=name;
		this.customer_Add=add;
	}
	
	public SudoBank(int id,String name) {
		this.Customer_id=id;
		this.customer_name=name;
	}
	
	public SudoBank(int id,String name,String add,String acType,double crBalance) {
		this.Customer_id=id;
		this.customer_name=name;
		this.customer_Add=add;
		this.Account_type=acType;
		this.curr_Balance=crBalance;
	}
	
	
	
	
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_Add() {
		return customer_Add;
	}
	public void setCustomer_Add(String customer_Add) {
		this.customer_Add = customer_Add;
	}
	public String getAccount_type() {
		return Account_type;
	}
	public void setAccount_type(String account_type) {
		Account_type = account_type;
	}
	public double getCurr_Balance() {
		return curr_Balance;
	}
	public void setCurr_Balance(double curr_Balance) {
		this.curr_Balance = curr_Balance;
	}
	
	@Override
	public String toString() {
		return "SudoBank [Customer_id=" + Customer_id + ", customer_name=" + customer_name + ", customer_Add="
				+ customer_Add + ", Account_type=" + Account_type + ", curr_Balance=" + curr_Balance + "]";
	}

	
	
}
