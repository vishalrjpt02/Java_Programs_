/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to find out initals of any Name
 * @file	 Comput_initals.java
 * @date 	 28/01/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class Compute_Initals {

	public static void main(String[] args) {
		
		System.out.println("enter the string to find out initals "); 
		System.out.println("Your inital is "+CreateInital(KeybordUtil.getline()));
	}

	/*method to find out the initals of name
	 * @param String
	 * @return String
	 */
	 static String CreateInital(String fullString) {
		char []Elements=KeybordUtil.ToCharArray(fullString);
		String out="";
		out=out+Elements[0];
		for(int i=0;i<Elements.length;i++)
		{
			if(Elements[i]==32)
			{
				out=out+Elements[i+1];
			}
		}return out;
	}

}
