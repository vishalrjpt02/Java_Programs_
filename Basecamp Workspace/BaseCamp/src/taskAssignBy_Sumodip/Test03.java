/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	
*@File		Test03.java
*@Since		Feb 7, 2020
************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class Test03 {

	/*
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		System.out.println("Enter the arry lentgth");
		int[] arr=new int[KeybordUtil.getint()];
		System.out.println("Enter the element of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=KeybordUtil.getint();
		}
		System.out.println("Enter the number whose sum to be added");
		int num=KeybordUtil.getint();
		findElementSum(arr,num);
	}

	/*
	*@param arr
	*@param num
	*@return void
	*/
	private static void findElementSum(int[] arr, int num) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=0;j<arr.length;i++) {
				
				if()
			}
		}
		
	}

}
