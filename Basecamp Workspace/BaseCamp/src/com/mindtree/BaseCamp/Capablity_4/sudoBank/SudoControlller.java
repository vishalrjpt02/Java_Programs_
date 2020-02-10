/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	Capablity 4: KO-3. Ability to implement array of objects as per problem statement
						 Ko-4. Ability to pass array of objects as argument to a method and return an array from a method
*@File		SudoControlller.java
*@Since		Feb 4, 2020
**********************************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.sudoBank;

import Utility.KeybordUtil;

public class SudoControlller {

	
	/*
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of customer to be added for");
		int len=KeybordUtil.getint();
		SudoBank customer_data[]=new SudoBank[3+len];			//creating an array of object lenght of 3+userinput

	//in this question we can do this job by construstor overloading and also by using geeters and setters///
		
		
		
//------------------------------first approch by using construstor overloading------------------------////////
		
		SudoBank customer1=new SudoBank(1001,"kumar","RajaniNager banglore, banglore-10"); ///by paramerterised construstor
		SudoBank customer2=new SudoBank(1005,"Raja");
		SudoBank customer3=new SudoBank(1004,"Saloni","Jaynagra,RajaniNager banglore, banglore-20","SB",1500);
		customer_data[0]=customer1; ///adding values to array of objects on different indexes
		customer_data[1]=customer2;		
		customer_data[2]=customer3;
		
		/*for(int i=0;i<3;i++)
		{
			System.out.println(customer_data[i]);
		}*/
		
		
		
		
		
//----------------------------------------2nd approch by using getters and setter---------------------------------------///
		
		
		
		boolean chk=true;
		int count=3;
		while(chk)
		{
			System.out.println("mark your choice\n1.To add customers by name Id and address only\n2.To add by ID and address\n3.By giving all data\n4.perform sorting and display all customers.\n5.Perform binary Search on all data\n6.Exit");
			int in=KeybordUtil.getint();
			SudoBank obj=new SudoBank();
			switch (in) {
			
			case 1:
				if(count<len+3) {
				System.out.println("Enter the   id\tname\taddress");
				obj.setCustomer_id(KeybordUtil.getint());
				obj.setCustomer_name(KeybordUtil.getline());
				obj.setCustomer_Add(KeybordUtil.getline());
				customer_data[count]=obj;
				count++;}
				else
				System.out.println("you have already entered "+len+" Customers data");
				break;
			case 2:
				if(count<len+3) {
				System.out.println("Enter the   id\tname");
				obj.setCustomer_id(KeybordUtil.getint());
				obj.setCustomer_name(KeybordUtil.getline());
				customer_data[count]=obj;
				count++;}
				else
					System.out.println("you have already entered "+len+" Customers data");
				break;
			case 3:
				
				if(count<len+3) {
					System.out.println("Enter the   id\tname\taddress\tAccount type\tCurrent Balance");
				obj.setCustomer_id(KeybordUtil.getint());
				obj.setCustomer_name(KeybordUtil.getline());
				obj.setCustomer_Add(KeybordUtil.getline());
				obj.setAccount_type(KeybordUtil.getString());
				obj.setCurr_Balance(KeybordUtil.getDouble());
				customer_data[count]=obj;
				count++;}
				else
					System.out.println("you have already entered "+len+" Customers data");
				break;
			case 4:
				printCustomerDetail(SotingAndPrint(customer_data,count),count);
				break;
			case 5:
				System.out.println("Enter the id of the customer to search");
				SotingAndPrint(customer_data,count);
				printCustomerDetailOnid(customer_data,count);int left=0;int right=count-1;
				System.out.println(customer_data[performBinarySearchingOnId(customer_data,left,right,KeybordUtil.getint())]);
				break;
			case 6:
				chk=false;
				System.out.println("Thank you");
				break;
			default :
				System.out.println("Invalid input");
			}
		}
		
	}
	
	
	/*
	*@param customer_data
	*@param count
	*@return void
	*/
	private static void printCustomerDetailOnid(SudoBank[] customer_data, int count) {
		for(int i=0;i<count;i++)
		{
			System.out.println(customer_data[i].getCustomer_id());
		}
		
	}


	/*method to search for a id from customer data array of object
	*@param customer_data[]
	*@param left
	*@param right
	*@param mid
	*@param getint
	*@return void
	*/
	private static int performBinarySearchingOnId(SudoBank[] customer_data, int left, int right,int key) {
		try {
			
			if(left<=right) {
				int mid=left+(right-left)/2;

			if(customer_data[mid].getCustomer_id()==key) {
				System.out.println("Element found at index "+mid);
				return mid;
			}
			else if(key<customer_data[mid].getCustomer_id())
				return performBinarySearchingOnId(customer_data,left,mid-1,key);
			else if(key>customer_data[mid].getCustomer_id())
				return performBinarySearchingOnId(customer_data,mid+1,right,key);
			}
			return -left+1;
			}
			catch(Exception e) {
			System.out.println("Enter array in sorted manner Invalid input");
			return -1;
			}
		
		
	}


	/*Method used for performing the sorting the customer according to thier Id
	*@param customer_data
	*@return void
	*/
	private static SudoBank[] SotingAndPrint(SudoBank[] customer_data,int count) {
		
		for(int i=0;i<count;i++) {
			for(int j=i;j<count;j++) {
				SudoBank temp=new SudoBank();
			if(customer_data[i].getCustomer_id()>(customer_data[j].getCustomer_id())) {
					temp=customer_data[i];
					customer_data[i]=customer_data[j];
					customer_data[j]=temp;
			}
		}
		}
		return customer_data;
	}


	/*method only used for printing the customer details
	*@param customer_data
	*@return void
	*/
	private static void printCustomerDetail(SudoBank[] customer_data,int count) {
		for(int i=0;i<count;i++)
		{
			System.out.println(customer_data[i]);
		}
		
	}
	
}
