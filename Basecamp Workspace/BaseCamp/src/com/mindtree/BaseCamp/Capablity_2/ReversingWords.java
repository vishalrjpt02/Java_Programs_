package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class ReversingWords {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		printreverse(KeybordUtil.getline());

	}
	
	private static void printreverse(String input)
	{
		for(int i=0;i<input.length();i++) //loop to Iterate the whole string
		{
			if(input.charAt(i)==' '|| i==0) //to check the next word
			{
				if(i!=0) {
				 i=i+1;
				  System.out.print(" ");}
				
				if(65<input.charAt(i)&&input.charAt(i)<90 || input.charAt(i)<122&&input.charAt(i)>96)//checking for alphabets
				{
						String temp="";
						while(input.charAt(i)!=' ') //adding word into a temprory variable
						{
							temp=temp+input.charAt(i);
							i++;
						}
						i--;
						for(int j=temp.length()-1;j>=0;j--) //printing a word into reverse order
							System.out.print(temp.charAt(j));
									
					
				}
				else
				System.out.print(input.charAt(i)); //
				
			}
			else
				System.out.print(input.charAt(i));
			
				
		}
	}
}
