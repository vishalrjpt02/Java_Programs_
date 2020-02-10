/************************************************************************************
 * @author Vishal kumar
 * @Version 1.0
 * @purpose to implement heilstone logic program
 * @file heilstone.java
 * @date 27/01/2020
 ************************************************************************************/


package com.mindtree.BaseCamp.Capablity_1;

import Utility.KeybordUtil;

public class Helistone {

	public static void main(String[] args) {
		System.out.println("Enter a number to find out the helistone");
		helistone(KeybordUtil.getint());
	}
	
	
	/*
	 * @param integer
	 * @return void
	 */
	static void helistone(int num)
	{
		int count=0;
		while(num!=1)
		{
			if(num%2==0) {
				System.out.println(num+" is a even so i take half " +num/2);
				num=num/2;
			}
			else {
				System.out.println(num+ " is a odd so i make 3n+1 " +3*num+1);
				num=3*num+1;
			}
			count++;
		}
		System.out.println("There are total " +count+ " steps to reach 1 ");
	}

}
