/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	
*@File		Test02.java
*@Since		Feb 4, 2020
************************************************************************/
package taskAssignBy_Sumodip;

import Utility.KeybordUtil;

public class Test02 {

	/*
	*@param args
	*@return void
	*/
	static String []arr={"","jan","Feb","mar","april","may","june","july","augest","september","october","november","December"};
	public static void main(String[] args) {
		int in=1;
		checkout(in);
		
		/*int count=0;
		boolean chk=true;
		while(chk) {
			System.out.println("Enter a number in 1 to 12 to exit press 0");
			int in=KeybordUtil.getint();
			if(in>0) {
			String []arr={"","jan","Feb","mar","april","may","june","july","augest","september","october","november","December"};
			System.out.println(arr[in]);
			}
			else if(in<13)
				System.out.println("Invalid input");
			else
				chk=false;
		}*/
		/*int count=0;
		boolean chk=true;
		while(chk) {
			
		if(count>0) {
				System.out.println("Enter anthor number in 1 to 12/t to exit press  0");
				}
			count++;
			int month=KeybordUtil.getint();
		switch (month) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("faburary");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("augest");
			break;
		case 9:
			System.out.println("sepetember");
			break;
		case 10 :
			System.out.println("november");
				break;
		case 11:
			System.out.println("december");
				break;
		case 12:
			System.out.println("january");
				break;
		case 0:
			System.out.println("Thank you");
			chk=false;
			break;
			default:
				System.out.println("Invalid choice");
		}

	}*/
	}
	
	public static void checkout(int in) {
		if(in>0&&in<13) {
			System.out.println("Enter the number in between 1 to 12 and to exit press o");
			in =KeybordUtil.getint();
			System.out.println(arr[in]);
			checkout(in);
		}
		else
			System.out.println("Thank you");
		
	}

}
