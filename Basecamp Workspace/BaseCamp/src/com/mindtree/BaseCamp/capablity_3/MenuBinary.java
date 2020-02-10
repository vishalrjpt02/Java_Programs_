/************************************************************************************
 * @author 	Vishal kumar
 * @Version 1.0
 * @purpose to create a menu driven program for binary searching of string and integer
 * @file 	MenuBinary.java
 * @date 	02/02/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.capablity_3;

import Utility.KeybordUtil;

public class MenuBinary {

	public static void main(String[] args) {
	
		boolean flag=true;
		while(flag)
		{
			try {
				System.out.print("Mark your choice below...\n1.Binary search for integer\n2.Binary search for String\n3.Exit...\n");
			
				int choice=KeybordUtil.getint();
			switch (choice){
			case 1:
				System.out.print("Enter the length of array\n");
				int arr[]=KeybordUtil.scan1DArray(KeybordUtil.getint());
				System.out.println("Enter the key to be search for");
				int key=KeybordUtil.getint(),l=0,r=arr.length; 
				System.out.println("Element found at index "+binarySearchInt(arr,key,l,r));
				break;
			case 2:
				System.out.print("Enter the 10 String elements in sorted manner\n");
				String input[]=KeybordUtil.ScanStringarray(KeybordUtil.getint());  
				input=KeybordUtil.
				System.out.println("Enter the key to be search for");
				String key1=KeybordUtil.getString();
				int L=0,R=input.length;
				binarySearchString(input,key1,L,R);
				break;
			case 3:
				System.out.println("Thank you for visiting.....");
				flag=false;
				break;
			default :
				System.out.println("Invalid choice");
				break;
					
				
			}
		
		}
		catch(Exception e) {
			System.out.println("Input Mismatch");
			System.out.println("Try again");
	}
	
	}
		

	}

	
	/*Method for performing the Binary searching on String Array
	*@param input
	*@param  int
	*@param  int
	*@param  int
	*@return void
	*/
	private static void binarySearchString(String[] input, String key1,int l,int r) {
		try {
			
		if(l<=r) 
		{
			int mid=l+r-l/2;
		
		if(key1.compareTo(input[mid])==0)
			System.out.println("Element found at index "+mid);
		
		else if(key1.compareTo(input[mid])<0)
			binarySearchString(input,key1,l,r);

		else if(key1.compareTo(input[mid])>0)
			binarySearchString(input,key1,mid+1,r);
		}
		}
		catch(Exception vishal)
		{
			System.out.println("Enter the sorted array " +vishal);
			
		}
	}

	
	
	/*Method to search an element in an array using Binary search
	*@param arr[]
	*@param key
	*@param left
	*@param right
	*@return void
	*/
	private static int binarySearchInt(int[] arr, int key,int left,int right) {
		try {
		
		if(left<=right) {
			int mid=left+(right-left)/2;
			
		if(arr[mid]==key) {
			System.out.println("Element found at index "+mid);
			return mid;
		}
		else if(key<arr[mid])
			return binarySearchInt(arr,key,left,mid-1);
		
		else if(key>arr[mid])
			return binarySearchInt(arr,key,mid+1,right);
		}
		return -left+1;
		}
		catch(Exception e) {
		System.out.println("Enter array in sorted manner");
		return -1;
		}
		
	}

}
