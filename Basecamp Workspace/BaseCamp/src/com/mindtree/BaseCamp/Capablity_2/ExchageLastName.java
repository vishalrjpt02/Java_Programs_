package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class ExchageLastName {

	public static void main(String[] args) {
		
		System.out.println("Enter the name of student 1 and  Student2");
		changelast(KeybordUtil.getline(),KeybordUtil.getline());
		}
	static void  changelast(String name1,String name2)
	{
		//for the first name 
		String last1="";
		int index1=0;
		String first1="";
		//finding out the starting index of the last name of 1st student
		for(int i=name1.length()-1;i>0;i--)
		{
			if((name1.charAt(i)<65 && name1.charAt(i)>90) && (name1.charAt(i)<97&&name1.charAt(i)>122)) {
				index1=i+1;
				break;}
				
		}
		String last2="";
		int index2=0;
		String first2="";
		//finding out the starting index of the last name of 2nd student
		for(int i=name2.length()-1;i>0;i--)
		{
			if((name2.charAt(i)<65 && name2.charAt(i)>90) && (name2.charAt(i)<97&&name2.charAt(i)>122)) {
				index2=i+1;
				break;
				}
				
		}
		//adding the last name to a temporary string 
		for(int i=index1;i<name1.length();i++)
			last1=last1+name1.charAt(i);
		
		for(int i=index2;i<name2.length();i++)
			last2=last2+name2.charAt(i);
		
		//Storing the first name into the temporay string variable
		
		for(int i=0;i<index1-1;i++)
		{
			first1=first1+name1.charAt(i);
		}
		first1=first1+last2; 
		
		//swaping the last name of the 1st student with the last name of 2nd student
		for(int i=0;i<index2-1;i++)
		{
			first2=first2+name2.charAt(i);
		}
		first2=first2+last1; //swaping the last name of the 2nd student with the last name of 1st student 
		
		System.out.println("Printing the swaped name of students \n"+first1+" \n"+first2);//printing the updated name
	}
}
