/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to perform the test problems in class
 * @file	 Test01.java
 * @date 	 27/01/2020
 ************************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=KeybordUtil.getint();
		int out1=0;
		int out2=0;
		int decr=num-1;
		for(int i=0;i<num;i++) {
			out1=out1*10 +num-i;
			out2=out2*10+num-decr;
			decr--;
		}
		System.out.println(out1+ ""+out2);
		int pnum=num-1;
		for(int i=0;i<num-1;i++)
		{
			
			for(int j=pnum;j>0;j--)
			{
				System.out.print(j);
				
			}
			System.out.println();
			pnum--;
		}
		for(int j=2;j<=num;j++)
		{
			System.out.println(j);
		}
		
	}

}
