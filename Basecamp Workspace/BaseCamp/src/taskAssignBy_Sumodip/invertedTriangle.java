/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement logic for printing a inverted triangle
 * @file	 Inverted_Traingle.java
 * @date 	 28/01/2020
 ************************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class invertedTriangle {

	public static void main(String[] args) {
		
		int userInput=KeybordUtil.getint();
		printTriangle(userInput);
	}
	/*method to find out the inverted triangle
	 * @param integer
	 * @return void
	 */
	
	static void printTriangle(int limit)
	{
		for(int i=limit;i>0;i--) {
			
		for(int k=i;k<limit;k++) 
			System.out.print(" ");
		
		for(int j=i;j>0;j--)
			System.out.print("*");
		
		System.out.println();
		
		}
		
	}

}
