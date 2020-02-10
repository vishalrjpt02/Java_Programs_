/************************************************************************************
 * @author 	Vishal kumar
 * @Version 1.0
 * @purpose To create a program for Bubble sorting
 * @file BubbleSort.java
 * @date 02/02/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.capablity_3;

import Utility.KeybordUtil;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		int len=KeybordUtil.getint();
		int[] arr=new int[len];
		System.out.println("Enter "+len+ "Integeer element of array");
		KeybordUtil.scan1DArray(len);
		int out[]=bubbleSort(arr);
		for(int i=0;i<out.length;i++)
			System.out.print(" "+out[i]);
	}
/*Method to perform the Bubble Sorting
 * @param int[]
 * @return int[]
 */
	private static int[] bubbleSort(int[] out) {
		int len=out.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				int temp=0;
				if(out[i]>out[j]) {
					temp=out[i];
					out[i]=out[j];
					out[j]=temp;
				}
			}
		}
		return out;
	}

}
