/*************************************************************************************
 *@author	M1057961 Vishal kumar
 *@Version	1.0
 *@purpose	TO check a given id of astudent is valid or not 
 *@file		StringValiation.java
 *************************************************************************************/

package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class StringValidation {

	public static void main(String[] args) {
		
		System.out.println("Enter the string that to be validated");
		System.out.println(validation(KeybordUtil.getline()));
		
	}
	
	/*method to validate the whole string
	 * @param String
	 * @return String
	 */
	static String validation(String input)
	{
		boolean check=false;
		if(input.length()!=10)
			return "failure";
		
		for(int i=0;i<input.length();i++)
		{
			if(i==0||i==4||i==5||i>7)
				check=digitValidation(input.charAt(i),i);
			else if(i==2||i==3)
			{
				check=AlphabetValidation(input.charAt(i));
			}
			else if(i==6)
			{
				check=SubstringValidation(i,input);
				i=i+2;
			}
		}
		if(check==true)
			return "Sucess";
		else
			return "failure";
	}
	
	
	/*Method to perform the Substring validation
	 * @param int,String
	 * @return boolean
	 */
	private static boolean SubstringValidation(int i, String input) {
			String comp="";
			comp=comp+input.charAt(i)+input.charAt(i+1);
			if(comp=="CS"||comp=="IS"||comp=="EC"||comp=="ME")
				return true;
		return false;
	}
	
	
	/*Method to perform the alphabet validation
	 * @param char
	 * @return boolean
	 */
	private static boolean AlphabetValidation(char Inputchar) {
			if(Inputchar>64&&Inputchar<91)
				return true;
		return false;
	}

	/*Method to perform the digit validation
	 * @param int,String
	 * @return boolean
	 */
	private static boolean digitValidation( char i,int index) {
		
		//for 1st character  which should be 1 or 2
		if((index==0)&&(i=='1' && i=='2')) 
		{
			return true;
		}
		else if(index!=0)
		{
			if(i>47 && i<58)
			{
				return true;
			}
		}
			return false;
		
	}

}
