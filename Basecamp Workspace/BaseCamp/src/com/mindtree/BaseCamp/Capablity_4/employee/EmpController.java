/***********************************************************************
*@author 	Vishal Rajput
*@Version 	1.0
*@Purpose	Controller class for employee class
*@File		EmpConroller.java
*@Since		Feb 4, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.employee;

import Utility.KeybordUtil;

public class EmpController {
	

	public static void main (String[]args)
	{
		Employee obj=new Employee();
		
		System.out.println(obj.getEmpId());
		System.out.print("Enter the Emplyee id :");
		obj.setEmpId(KeybordUtil.getint());
		KeybordUtil.getline();
		System.out.print("Enter the of Emplyee name :\n");
		obj.setEmpName(KeybordUtil.getline());
		
		System.out.print("Enter the Desigenation of Emplyee :");
		obj.setEmpDesig(KeybordUtil.getString());
		
		System.out.print("Enter the name of Deparatment of Emplyee :");
		obj.setEmpName(KeybordUtil.getString());
		
		System.out.print("Printing the the Emplyee detatils\n");
		
		System.out.println(obj.toString());
	}
}
