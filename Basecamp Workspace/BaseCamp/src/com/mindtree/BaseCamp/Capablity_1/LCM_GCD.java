/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement the logic to find lcm and hcf
 * @file	 LCM_GCD.java
 * @date 	 27/01/2020
 ************************************************************************************/

package com.mindtree.BaseCamp.Capablity_1;

import Utility.KeybordUtil;

public class LCM_GCD {

	public static void main(String[] args) {
		System.out.println("Enter the 1st and 2nd number");
		int num1=KeybordUtil.getint();
		int num2=KeybordUtil.getint();
		printHcflcm(num1,num2);
	}
	
	/*method to find out the lcm and hcf
	 * @return void
	 * @param integer,integer
	 */
	static void printHcflcm(int num1,int num2)
	{
		int temp=0;
		int x=num1;int y=num2;
		while(num2!=0)
		{
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		int hcf=num1;
		int lcm=x*y;
		System.out.println("hcf of two numbers is " +hcf +"\nlcm of two num = " +lcm);
	}

}
