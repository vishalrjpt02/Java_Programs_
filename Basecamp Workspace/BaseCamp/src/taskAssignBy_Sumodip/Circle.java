/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement the logic for printing a circle
 * @file	 Circle.java
 * @date 	 28/01/2020
 ************************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class Circle {

	public static void main(String[] args) {
		System.out.println("Enter the radius or limit of circle");
		int radius=KeybordUtil.getint();
		printcircle(radius);
	}

	/*Method to print the circle structre
	 * @param integer
	 * @return void
	 */
	static void printcircle(int r) {
		for(int i=0;i<=2*r;i++) {
			double dist=0;
			{
				for(int j=0;j<=2*r;j++)
				{
					dist=Math.sqrt(((i-r)*(i-r))+((j-r)*(j-r)));
					
					if(dist>r-0.5 && dist<r+0.5) 
						System.out.print("*");
						
					else
							System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
	}
}
