package com.mindtree.BaseCamp.Capablity_2;

public class UniqueElements {

	public static void main(String[] args) {
		int arr[] =  { 10, 5, 20, 15, 25, 30};
		int arr2[] ={50, 12, 5, 30, 15, 70};
		int out[]=checkUnique(arr,arr2);
		int i=out.length-1;
		while(i>=0) {
			if(out[i]!=0)
				System.out.print(out[i]+" "); 
			i--;
		}
	}
	
	static int[] checkUnique(int Array1[] ,int Array2[])
	{
		int result[]=new int[Array1.length];
		if(Array1.length >= Array2.length)
		{
			
			
			for(int i=0;i<Array1.length;i++)
			{
				
				boolean chk=true;
				boolean ownchk=true;
				for(int j=0;j<Array1.length-1;j++)
				{
					if(Array1[i]==Array2[j]) {
						chk=false;
					}
					if(j>i && j>Array1.length-2) {
					if(Array2[i]==Array2[j+1])
					{
						ownchk=false;
					}
					}
				}
				if (chk==true) {
					result[i]=Array1[i];
					if(ownchk==true)
					{
						result[i+1]=Array2[i];
					}
					}
				else if(ownchk==true)
					result[i]=Array2[i];
					
				//System.out.println(result[i]);
				
			}
			
		}
		return result;
	}
}
