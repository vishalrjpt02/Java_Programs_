/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to find out the factorial of a number
 * @file	 Factorial.java
 * @date 	 28/01/2020
 ************************************************************************************/
package com.mindtree.BaseCamp.Capablity_1;
import Utility.KeybordUtil;
public class Factorial_of_A_number {

	public static void main(String[] args) {
		
			System.out.println("Enter a number to calculate the factorial");
			int userinput=KeybordUtil.getint();
			System.out.println("Factorial of" +userinput+ " " +Factorial(userinput));
	}
	/*method to find out the factorial of given number
	 * @param integer
	 * @return integer
	 */
	static int Factorial(int in)
	{
		
		if(in>0)
		{
			return in*Factorial(in-1);
		}
		 else
			return 1;
	}

}
