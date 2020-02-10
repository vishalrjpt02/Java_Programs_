/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement the logic for Muptiplication table
 * @file	 Employee.java
 * @date 	 27/01/2020
 ************************************************************************************/

package com.mindtree.BaseCamp.Capablity_1;

import Utility.KeybordUtil;

public class Multiplication_Table {

	public static void main(String[] args) {
		System.out.println("Enter the number to calculate the table");
		int userinput=KeybordUtil.getint();
		Table(userinput);
	}
	
	/*method to calculate and print table
	 * @param integer
	 * @return void
	 */
	
	static void Table(int in)
	{
		for(int i=1;i<13;i++)
		System.out.println(in+ "*"+i +"= "+ in*i);
	}

}
