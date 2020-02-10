/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	
*@File		Demo.java
*@Since		Feb 5, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.Student;

import Utility.KeybordUtil;

public class Demo {

	/*
	*@param args
	*@return void
	*/
	static Student sobj=new Student(101,"vishal",false);
	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			System.out.println("mark your choice ....\n1.Enter the student Details\n2.Display student details\n3. Exit");
			int choice=KeybordUtil.getint();
			switch (choice) {
			case 1:
					getStudentData();
					break;
			case 2:
					
			}	
				
		}
		
	}
	/*
	*
	*@return void
	*/
	private static void getStudentData() {
		
		//taking the inputs
		System.out.println("Enter student Id :");
		int id=KeybordUtil.getint();
		System.out.println("Enter the name of the student :");
		String name=KeybordUtil.getline();
		System.out.println("Enter student marks :");
		int marks=KeybordUtil.getint();
		//identifing the marks
		sobj.identifyMarks(marks);
		
		
	}

}
