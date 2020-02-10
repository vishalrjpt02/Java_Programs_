/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement emplyee data program
 * @file	 Employee.java
 * @date 	 27/01/2020
 ************************************************************************************/

package com.mindtree.BaseCamp.Capablity_1;

import Utility.KeybordUtil;

public class Empolyee {

	public static void main(String[] args) {
		
		String jobBand[]= {"C1","C2","C2","C3","C4","C"};
		
		
		System.out.println("enter the employee id,jobBand,department code");
		int id=KeybordUtil.getint();
		String band=KeybordUtil.getString();
		int code=KeybordUtil.getint();
		if(bandcheck(jobBand,band) && (code<125 && code>110))
		{
			System.out.println("Emplyee id=" +id+ " jobBand is "+band+ " Dpartment code is " +code);
		}
		else
			System.out.println("invalid input");
		
	}
	
	/*method to validate band
	 * @param String array and String 
	 * @return boolean
	 */
	static boolean bandcheck(String arr[],String in)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(in))
			{
				System.out.println(arr[i]);
				return true;
			}
		}
		return false;
		
	}

}
