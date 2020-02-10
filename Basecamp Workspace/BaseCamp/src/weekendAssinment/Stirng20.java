/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	
*@File		Stirng20.java
*@Since		Feb 3, 2020
************************************************************************/
package weekendAssinment;

import Utility.KeybordUtil;

public class Stirng20 {

	/*main method for the program
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		
		System.out.println("Enter the length of array");
		int len=KeybordUtil.getint();
		String send[]=new String[len];
		for(int i=0;i<len;i++)
			send[i]=KeybordUtil.getString();
		sortOnLength(send);
	}
	
	
	/*method to sort the 
	*@param input
	*@return void
	*/
	private static void sortOnLength(String[] input)
	{
		String out[]=new String[input.length];
		for(int i=0;i<input.length;i++)
		{
			for(int j=i;j<input.length;j++) {
				String temp="";
				if(input[i].length()>input[j].length())
				{
					temp=input[i];
					input[j]=input[i];
					input[j]=temp;
				}
			}
		}
	}
}
