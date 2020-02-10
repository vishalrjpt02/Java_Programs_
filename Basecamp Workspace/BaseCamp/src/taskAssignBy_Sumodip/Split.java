/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	To convert a string into to 2d Array and seprate them into Different columns
*@File		Split.java
*@Since		Feb 6, 2020
************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class Split {

	/*main method
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		String input=KeybordUtil.getline();
		input=input+" ";
				int row=0,max=0;String out="";
				for(int i=0;i<input.length();i++)
				{
					
					if(input.charAt(i)!=' ')
					{
						out=out+input.charAt(i);
						
					}
					else
					{
						if(out.length()>max) {
							max=out.length();
							}
							row++; out="";
					}
				}
				
				System.out.println("Nubmer of row "+row+ " no of collum "+max);
				String arr[][]=printArray(row,max,input); //calling the method to find the 2d array of string
				
				for(int l=0;l<arr.length;l++) {
					for(int m=0;m<arr.length;m++) {
						if(arr[l][m]!=null)
						System.out.print(arr[l][m]);
					}
				System.out.println();
				}
				
	}

	/*method to convert the string into 2d Array
	*@param row
	*@param max
	*@return void
	*/
	private static String[][] printArray(int row, int max,String in) {
		String [][]arr=new String[row][max];
		int j=0,k=0;
		for(int i=0;i<in.length();i++)
		{
			if(in.charAt(i)!=' ')
			{
		String out="";
				arr[j][k]=out+in.charAt(i);
				System.out.println(arr[j][k]);
				k++;
			}
			else
			{
				j++;
				k=0;
			}
		}
		
		return arr;
		
	}
}
