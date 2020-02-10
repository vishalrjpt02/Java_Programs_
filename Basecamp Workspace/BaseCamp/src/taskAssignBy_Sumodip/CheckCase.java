/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	for learning test of menu driven
*@File		CheckCase.java
*@Since		Feb 4, 2020
************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class CheckCase {

	/*
	*@param args
	*@return void
	*/
	public static void main(String[] args) {
		boolean chk=true;
		
		while(chk)
		{
			System.out.println("Mark you choice\n1.For continue type yes continue\n2.Type no to exit");
			String choice=KeybordUtil.getString();
			
			
			switch(choice) {
				case "yes":
				case "YES":
				case "Yes":
				case "yES":
				case "yEs":
					break;
				case "NO":
				case "nO":
				case "No":
				case "no":
				System.out.println("Thank you");
				chk=false;
				break;
			default:
					System.out.println("Invalid output");
					break;
				
			}
			
		}

	}

	
}
