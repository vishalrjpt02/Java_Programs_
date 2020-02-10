
/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement the logic for finding a passward
 * @file	 GenratePassword.java
 * @date 	 28/01/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class Genrate_Password {

	public static void main(String[] args) {
		System.out.println("Enter your name and age");
		String name=KeybordUtil.getline();
		String initals=Compute_Initals.CreateInital(name);
		String age=KeybordUtil.getline();
		System.out.println("your passward is " +password(initals,age));
		
	}
	static String password(String name,String age)
	{
		return name+age;
	}

}
