/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	To create a program for finding out the maximum and minimum value in an array of objects
*@File		MaxElement.java
*@Since		Feb 3, 2020
************************************************************************/
package com.mindtree.BaseCamp.capablity_3;

import java.util.Scanner;

import Utility.KeybordUtil;

public class MaxElement {

	/*
	*@param args
	*@return void
	*/
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the the length");
		int len=KeybordUtil.getint();
		Object[] arr=new Object[len];
		for(int i=0;i<len;i++)
			arr[i]=KeybordUtil.getint();
		System.out.println("Enter the start and End index");
		int start=KeybordUtil.getint(),end=KeybordUtil.getint(),max=0,index=0;
		for(int i=start;i<=end;i++) {
			if(arr[i].hashCode()>max) {
				max=(int) arr[i];
				index=i;
			}
		}
		System.out.println(max+" Element found at " +index);
	}
	

}







