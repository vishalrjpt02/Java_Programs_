/************************************************************************************
 * @author Vishal kumar
 * @Version 1.0
 * @purpose To create a program to find out leading elements in an array
 * @file Leader.java
 * @date 02/02/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class Leader {

	public static void main(String[] args) {
		System.out.println("set the limit for making the array of elements");
		int arr[]=new int[KeybordUtil.getint()];

		//Scanning the array of elements
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+" element");
			arr[i]=KeybordUtil.getint();
		}
		checkLead(arr);
	}
	
	
	
/*Method to find out all leading elements in the whole array
 *@param	 int[]
 *@return	 void 
 *@logic 	 By using two for loops and one if condition for
 *			 comparing and replacing the previous leading element 
 *			 is printing the all leading elements in the array
 */
	private static void checkLead(int[] arr) {
		int lead=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(lead<arr[j]) {
				lead=arr[j];
				i=j;
				}
			}
			System.out.println(lead);
			lead=0;
		}
		
	}

}
