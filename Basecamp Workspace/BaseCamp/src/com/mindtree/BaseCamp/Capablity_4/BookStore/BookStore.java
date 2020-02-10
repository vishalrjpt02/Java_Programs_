/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	To create a book store class file for 
*@File		BookStore.java
*@Since		Feb 4, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.BookStore;

public class BookStore {

	 String title;
	 String name;
	 double price;
	 int  year;
	
	public BookStore(String title,String name,double price,int year) {
		this.title=title;
		this.name=name;
		this.price=price;
		this.year=year;
		
	}

	@Override
	public String toString() {
		return title+"\t" +name+ "\t"+price+"\t"+ year+"\n";
	}
	
}
