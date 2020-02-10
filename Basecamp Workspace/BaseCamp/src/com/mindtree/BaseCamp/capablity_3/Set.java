/***********************************************************************
*@author 	Vishal Rajput
*@Vrersion 	1.0
*@Purpose	To search an element in a Set
*@File		Set.java
*@Since		Feb 3, 2020
************************************************************************/
package com.mindtree.BaseCamp.capablity_3;

import Utility.KeybordUtil;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of set");
		System.out.println("Element found at index"+createSet(KeybordUtil.getint()));
	}

	/*method get the elements in set of object and key to search and find
	*@param getint
	*@return void
	*/
	private static int createSet(int len) {
		Object set[]=new Object[len];
		int out=0;
		for(int i=0;i<len;i++) {
			System.out.println("Enter the "+i+" Element");
				set[i]=KeybordUtil.getint();
			}
		for(int i=0;i<len-1;i++)
		{
			if(set[i].hashCode()==set[i+1].hashCode()) {
				System.out.println("INVALID INPUT");
				createSet(len);
			}
		}
		System.out.println("Enter the element to search");
		Object key=KeybordUtil.getint();
		for(int i=0;i<set.length;i++)
		{
			if(set[i]==key)
				out=i;
		}return out;
	}

}
