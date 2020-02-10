/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	To perform sorting and searching on String
*@File		SortAndSearch.java
*@Since		Feb 3, 2020
************************************************************************/
package com.mindtree.BaseCamp.capablity_3;

import java.util.Scanner;

import Utility.KeybordUtil;

public class SortAndSearch {

	/*
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		while(flag)
		{
			System.out.print("Mark your choice below....\n1.Sort Using Bubble Sort\n2.Sort Using Insertion Sort\n3.Search a String\n4.Exit.\n");
			int choice=KeybordUtil.getint();
			
			switch (choice) {
				case 1:
					System.out.print("Enter the sentense for bubble sorting \n");
					String input=sc.nextLine();
					bubbleSortString(input);
					break;
				case 2:
					System.out.print("Enter the sentense for Insertion sorting \n");
					String insertion=sc.nextLine();
					String out[]=insertionSortString(insertion);
					KeybordUtil.printStringArray(out);
					break;
				case 3:
					System.out.print("Enter the sentense in string has be search\n");
					String searching=sc.nextLine();
					searchString(searching);
					break;
				case 4:
					System.out.println("Thank you for Visiting");
					flag=false;
					break;
			}
		}

	}

	/*Method to read the sentence and search an element from it
	*@param String
	*@return void
	*/
	private static void searchString(String input) {
		System.out.println("Enter the searching element");
		String key=KeybordUtil.getString();
		String []arr=toStringArray(input);
		int count=0;
		for(String temp:arr) {
			if(temp!=null && temp.equals(key))
				System.out.println("Element found at "+count);
			count++;
			System.out.println(temp);
		}
		
	}

	
	/*Method to perform insertion sort in string array
	*@param int
	*@return void
	*/
	private static String[] insertionSortString(String in) {
		String inArray[]=toStringArray(in);
		int len=inArray.length;
		for(int i=1;i<len;i++)
		{
			
			int j=i;
			while(j>=0 && inArray[j-1].compareTo(inArray[j])>0)
			{
				String temp=inArray[j-1];
				inArray[j-1]=inArray[j];
				inArray[j]=temp;
				j--;
			}
			
		}
		return inArray;
		/*for(int i=0;i<len;i++)
			System.out.println(inArray[i]);*/
	}

	
	/*Method for bubble sort on string
	*@param input
	*@return void
	*/
	private static void bubbleSortString(String input) {
		String out[]=toStringArray(input);
		int len=out.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				String temp="";
				if(out[i].compareTo(out[j])>0) {
					temp=out[i];
					out[i]=out[j];
					out[j]=temp;
				}
			}
		}
		
		
	}
	
	
	
	/*method to convert the Sentence into the String Array
	*@param input
	*@return String[]
	*/
	private static String[] toStringArray(String input)
	{
		input=input+" ";
		String Empty[]=new String[input.length()];
		String out="";
		int j=0;
		for(int i=0;i<input.length();i++)
		{
			out=out+input.charAt(i);
			if(input.charAt(i)==' '||input.charAt(i)=='\u0000') 
			{
				Empty[j]=out;
				out="";
				j++;
			}
			
		}
		return Empty;
	}

}
