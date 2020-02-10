/************************************************************************************
 * @author Vishal kumar
 * @Version 1.0
 * @purpose To create a program to check the row magic of an Array
 * @file 	RowMagic.java
 * @date 	02/02/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class RowMagic {

	public static void main(String[] args) {

		System.out.println("enter the length of array in m and n ");
		int row=KeybordUtil.getint();
		int column=KeybordUtil.getint();
		System.out.print("Enter the Elements of the 2d array");
		if(isMagic(KeybordUtil.Scan2dArray(row,column),"DiaGonal"))
				System.out.println("You have entered a ROW MAGIC array");
		
	}

	public static boolean isMagic(int inputArray[][],String choice) {
		boolean sumRow=false;
		boolean sumColumn=false;
		boolean sumDiagonal=false;
		int len=inputArray.length;
		int temp,sum=0;
		
		
		
		if(choice=="row")
			sumRow=true;
		else if(choice=="column")
			sumColumn=true;
		else if(choice=="Diagonal")
			sumDiagonal=true;
		
		// to find Diagonal sum of row and column
		if(sumDiagonal)
		{
			if(inputArray[len][len]==inputArray[len][len]);
			{
				
				for(int i=0;i<len;i++)	{ 
					int j=len;
						temp=sum+inputArray[i][j];
						j--;
						for(int k=0;k<len;k++) {
							if(i==k)
								sum=sum+inputArray[i][k];
						}
						if(temp==sum)
							return true;
				}
			}
		}
		
		
		//for row and column sum of 2d array
		for(int i=0;i<inputArray.length;i++)
			{
			  temp=sum;
			 for(int j=0;j<inputArray.length;j++)
				{
				 	if(sumRow)
				 		sum=sum+inputArray[i][j];
				 	
				 	else if(sumColumn)
				 		sum=sum+inputArray[i][j];
				 	
				}
				if(sum==temp||temp!=0)
				{
					return true;
				}
			}
		
		return false;
	}

}
