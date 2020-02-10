/************************************************************************************
 * @author 	Vishal kumar
 * @Version 1.0
 * @purpose To create a program for linear Searching
 * @file 	Linearsearch.java
 * @date 	02/02/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.capablity_3;

import Utility.KeybordUtil;

public class LinearSearch {

	static int i=0;
	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		int len=KeybordUtil.getint();
		int []arr=new int[len];
		for(int i=0;i<len;i++)
		{
			System.out.println("Enter the "+i+" Element of array");
			arr[i]=KeybordUtil.getint();
		}
		System.out.println("Enter the element to be searched");
		int element=KeybordUtil.getint();
		int out=linearSearch(arr,element);
		if(out>0)
			System.out.println("Element found at "+ out+" index");
		else
			System.out.println("Element not found");

	}
/*method to perform the linear search
 * @param	int[],int
 * @return	int
 * @logic	using recurssion to check that element is present or not
 */
	private static int linearSearch(int[] arr,int key) {
		i++;
		if(arr[i]!=key)	{
			linearSearch(arr,key);
			return i;
		}
		else
			return i;
	}

}
