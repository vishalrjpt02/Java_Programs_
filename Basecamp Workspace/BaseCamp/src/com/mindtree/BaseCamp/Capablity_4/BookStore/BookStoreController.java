/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	
*@File		BookStoreController.java
*@Since		Feb 4, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.BookStore;

public class BookStoreController {

	static BookStore[] obj=new BookStore[3]; 
	public static void main(String[] args) {
		
		BookStore b1= new BookStore("Daniel Defoe", "Robinson Crusoe ", 15.50, 1719);
		BookStore b2= new BookStore("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		BookStore b3= new BookStore("Pat Conroy", "Beach Music         ", 9.50, 1996);
		obj[0]=b1;
		obj[1]=b2;
		obj[2]=b3;
		System.out.println("title\t\tname\t\t\tprice\tyear");
		for(BookStore s:obj)
		{
			System.out.println(s);
		}
		
	}

}
