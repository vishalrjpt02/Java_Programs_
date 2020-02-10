/***********************************************************************
*@author 	Vishal Rajput
*@version 	1.0
*@Purpose	
*@File		Student.java
*@Since		Feb 5, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.Student;

public class Student {

	int studenId;
	String studenName;
	float studentMarks;
	boolean secondChance;
	
	/**
	 * @param studenId
	 * @param studenName
	 * @param studentMarks
	 * @param secondChance
	 */
	public Student(int studenId, String studenName, boolean secondChance) {
		this.studenId = studenId;
		this.studenName = studenName;
		this.secondChance = secondChance;
	}
	
	
	public int getStudenId() {
		return studenId;
	}
	public String getStudenName() {
		return studenName;
	}
	public float getStudenMarks() {
		return studentMarks;
	}
	public boolean isSecondChance() {
		identifyMarks(studentMarks);
		return secondChance;
	}
	
	public void identifyMarks(float marks) {
		if(marks>80)
			secondChance=false;
	}
	
	public void identifyMarks(float mark1,float mark2) {
		if(secondChance==true)
		{
			if(mark1>mark2)
				studentMarks=mark1;
			else
				studentMarks=mark2;
		}
	}
}
