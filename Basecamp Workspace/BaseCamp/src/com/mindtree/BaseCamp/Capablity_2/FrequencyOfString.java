package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class FrequencyOfString {

	static int[] alphabet=new int[26];
	static int[] capsalphabet=new int[26];
	public static void main(String[] args) {
		System.out.println("enter the String");
		System.out.println(findcompress(KeybordUtil.getline()));
		
		
	}
	private static String findcompress(String rawstring) {
		String out="";
		for(int i=0;i<rawstring.length();i++) {
			char tempout='0';
			int count=0;
			
			if(rawstring.charAt(i)>64 && rawstring.charAt(i)<90)
				tempout = (char) ((char)rawstring.charAt(i)+32);
			for(int j=i;j<rawstring.length();j++)
			{
				char tempin='0';
				if(rawstring.charAt(j)>64 && rawstring.charAt(j)<90)
					tempin = (char) ((char)rawstring.charAt(j)+32);
				else 
					tempin=rawstring.charAt(j);
				
				if(tempin==tempout)
					count++;
			}
			i=i+count;
			out=out+tempout+count;
		}
		return out;
		
	
	
	
	/*static void findFrequecy(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			int index=0;
			int capsindex=0;
			if(input.charAt(i)<91 && input.charAt(i)>64)
			{
				index=input.charAt(i)-65;
			}
			else 
			{
				capsindex=input.charAt(i)-97;
			}
			alphabet[index]=alphabet[index]+1;	
			capsalphabet[index]=capsalphabet[capsindex]+1;
		}
		String out="";
		for(int i=0;i<alphabet.length;i++)
		{
			if(alphabet[i]!=0)
			{
				char temp=(char)i;
				System.out.println("Count of "+(char)(temp+65)+" ->"+alphabet[i]);
				out=out+((char)(temp+65))+alphabet[i];
			}
			if(capsalphabet[i]!=0)
			{
				char temp=(char)i;
				out=
			}
			
		}
		System.out.println(out);*/
	}
}
