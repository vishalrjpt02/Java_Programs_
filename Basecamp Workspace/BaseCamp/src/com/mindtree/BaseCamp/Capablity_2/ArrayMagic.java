/************************************************************************************
 * @author Vishal kumar
 * @Version 1.0
 * @purpose TO create a program for checking a magic array
 * @file ArrayMagic.java
 * @date 02/02/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class ArrayMagic {

	public static void main(String[] args) {
		System.out.println("Enter the row and collumn ");
		int arr[][]=new int[KeybordUtil.getint()][KeybordUtil.getint()];
		CheckMagic(arr);
	}

	//Method to check the magic array
	//A magic array is array whose sum row ,sum of column and sum of Diagonal are equal
	private static void CheckMagic(int[][] arr) {
		boolean chk=false;
		chk=RowMagic.isMagic(arr,"Row");
		chk=RowMagic.isMagic(arr,"Column");
		chk=RowMagic.isMagic(arr,"Diagonal");
		if(chk)
		{
			System.out.println("Congrats we have a Magic Array");
		}
		else
			System.out.println("Sorry it is not a Magic Array");
		
	}

}
