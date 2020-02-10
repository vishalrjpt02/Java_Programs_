/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	
*@File		Swaping07_02_2020.java
*@Since		Feb 7, 2020
************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class Swaping07_02_2020 {

	/*
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		String in=KeybordUtil.getline();
		in=in+" ";
		String out="";
		String fout="";
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)!=' ')
				out=out+in.charAt(i);
			
			else if(out.length()>2) {
				fout=swap(out);
				System.out.print(out.charAt(0)+fout+out.charAt(out.length()-1)+" ");
				out="";
				fout="";
			}
			else {
					System.out.print(out+" ");
					out="";
			}
					
		}
		

	}

	/*
	*@param out
	*@return void
	*/
	private static String swap(String out) {
		
		String fout="";
		for(int i=out.length()-2;i>0;i--)
		{
			fout=fout+out.charAt(i);
		}
		return fout;
		
			
	}
}
