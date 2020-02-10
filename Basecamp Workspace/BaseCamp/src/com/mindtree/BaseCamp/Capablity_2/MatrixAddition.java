package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class MatrixAddition {

	public static void main(String[] args) {
		System.out.print("Enter the value of length of the mantrix ");
		int n=KeybordUtil.getint();
		
		System.out.print("Enter the elements of 1st 2d matrix");
		int ar1[][]=KeybordUtil.Scan2dArray(n,n); //Scanning the 2d Matrix from console
		
		System.out.print("Enter the second 2d matrix"); 
		int ar2[][]=KeybordUtil.Scan2dArray(n,n);//Scanning the 2d matrix from console
		
		
		 //calling for summing and printing the elements
		System.out.println("Printing the sum of elements");
		sumMatrix(ar1,ar2);
		
	}
	
	static int[][] sumMatrix(int in1[][],int in2[][])
	{
		int out[][]=new int[in1.length][in1.length];
		for(int i=0;i<in1.length;i++)
		{
			for(int j=0;j<in1.length;j++)
			{
				out[i][j]=in1[i][j]+in2[i][j];
			}
		}
		KeybordUtil.print2dArray(out);
		return out;
	}

}
