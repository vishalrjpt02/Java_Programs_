/*************************************************************************************
 *@author	M1057961 Vishal kumar
 *@Version	1.0
 *@purpose	TO take the marks of students and find out the common marks in that
 *@file		Studenmarks.java
 *************************************************************************************/
package com.mindtree.BaseCamp.Capablity_2;

import Utility.KeybordUtil;

public class StudentMarks {

	static int n=0;			//so we can access from anywhere in program
	public static void main(String[] args) {
		
		System.out.println("Enter the number of students");
		n=KeybordUtil.getint();
		int marks[][]=new int[2][n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of "+(i+1) +" Student");
				marks[0][i]=KeybordUtil.getint();
		}
		int out[][]=checkRange(marks);
		
			for(int j=0;j<n;j++) {
				if(out[1][j]!=0)	//to stop the repetition
				System.out.println(out[1][j]+" Students has scored "+out[0][j]);
			}
		
		
	}

	
	/*Method to find out the same marks scored by different student and print them
	 * @param int[][]
	 * @return [][]
	 * logic : we are using a 2d array to store marks and count of students scored that marks
	 */
	private static int[][] checkRange(int[][] list) {
		int len=n;

		for(int i=0;i<len;i++)
		{
			int count=0;
			boolean flag=true;
			int k=i;
			
			// to check that there is no repetition in whole array
			while(k>0)		
			{
				if(list[0][i]==list[0][k-1])
				{
					flag=false;
				}k--;
			}
			if(flag) {
				for(int j=i;j<len;j++) {			//to check that is there any other student has same marks
					if(list[0][i]==list[0][j]) 
							count++;	
				}
			}
			if(count==0)
				count++;
			if(flag)			
				list[1][i]=count;	//adding the count of marks to the list of elements
		}
		
		return list;
		
	}

}
