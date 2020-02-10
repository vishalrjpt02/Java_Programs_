/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	
*@File		InsertionSort.java
*@Since		Feb 3, 2020
************************************************************************/
package com.mindtree.BaseCamp.capablity_3;

import Utility.KeybordUtil;

public class InsertionSort {
	
	/*
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		System.out.println("Enter the length of Arrayy");
		int len=KeybordUtil.getint();
		
		//scaning a 1d Array from console using the method in util Package
		int inArray[]=insertionSort(KeybordUtil.scan1DArray(len));  
		for(int i=0;i<len;i++)
			System.out.println(inArray[i]);

	}

	
	/*method to perform the insertion sort in int array
	*@param inArray
	*@return void
	*/
	private static int [] insertionSort(int[] inArray) {
		
		int len=inArray.length;
		for(int i=1;i<len;i++)
		{
			
			int j=i;
			while(j>=0 && inArray[j-1]>inArray[j])
			{
				int temp=inArray[j-1];
				inArray[j-1]=inArray[j];
				inArray[j]=temp;
				j--;
			}
			
		}
		return inArray;
		
	}

}
