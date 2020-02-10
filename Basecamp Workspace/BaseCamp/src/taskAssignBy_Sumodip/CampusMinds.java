/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement the Standred entity class
 * @file	 CampuMinds.java
 * @date 	 27/01/2020
 ************************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class CampusMinds  {

	
	static CampusMinds obj=new CampusMinds();
	public static void main(String[] args) {
		
		MindTreeMinds mid =new MindTreeMinds();
		MindTreeMinds mid1 =new MindTreeMinds("vishal",1001,"C1");
		
		System.out.println(mid1);
		System.out.println("Mid name Id and department");
		System.out.println(mid.getMindName());
		System.out.println(mid.getMindDep());
		System.out.println(mid.getMindId());
		
		
		
	}

		

}
