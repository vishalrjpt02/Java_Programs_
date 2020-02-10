/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	To make a employee class for 
*@File		employee.java
*@Since		Feb 4, 2020
************************************************************************/
package com.mindtree.BaseCamp.Capablity_4.employee;

public class Employee {
	
	
	static int empId;
	static String empName;
	static String empDesig;
	static String empDept;
	
	Employee(){
		this.empId=empId;
		this.empName=empName;
		this.empDesig=empDesig;
		this.empDept=empDept;
	};
	
	
	@Override
	public String toString() {
		return "Employee [getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpDesig()="
				+ getEmpDesig() + ", getEmpDept()=" + getEmpDept() + "]";
	}


	/**
	 * @param empId
	 * @param empName
	 * @param empDesig
	 * @param empDept
	 */
	 Employee(int empId, String empName, String empDesig, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDept = empDept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		if(validateId(empId))
			this.empId = empId;
	}
	/*
	*@param empId2
	*@return
	*@return boolean
	*/
	private boolean validateId(int empId2) {
		// TODO Auto-generated method stub
		return false;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if(validateName(empName))
			this.empName = empName;
		
	}
	/*
	*@param empName2
	*@return
	*@return boolean
	*/
	private boolean validateName(String empName2) {
		if(empName2.equals(null))
		return false;
		return true;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		if(validateDesing(empDesig))
			this.empDesig = empDesig;
		
	}
	/*
	*@param empDesig2
	*@return
	*@return boolean
	*/
	private boolean validateDesing(String empDesig2) {
		if(empDesig2.equals("tester")||empDesig2.equals("devloper")||empDesig2.equals("Lead")||empDesig2.equals("manneger"))
			return true;
		else
			System.out.println("Inavlid input");
		return false;
	}
	
	
	
	/*for getting and setting of Employee Department
	*@return
	*@return String
	*/
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		if(validateDept(empDept))
			this.empDept = empDept;
		else
			System.out.println("Inavlid input");
	}
	/*
	*@param empDept2
	*@return
	*@return boolean
	*/
	private boolean validateDept(String empDept2) {
		if( empDept2.equals("TTH")|| empDept2.equals("RCM")|| empDept2.equals("Digital")||empDept2.equals(" DevOps"))
			return true;
		else
			return false;
	}

}
