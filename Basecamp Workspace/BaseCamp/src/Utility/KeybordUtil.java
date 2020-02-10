/************************************************************************************
 * @author Vishal kumar
 * @Version 1.0
 * @purpose to create own scanner
 * @file Util.java
 * @date 27/01/2020
 ************************************************************************************/
package Utility;
import java.util.Scanner;
public class KeybordUtil {
	
	
	static Scanner sc=new Scanner(System.in);
	
	/*
	 * @param noting
	 * @return String
	 */
	public static String getline()
	{
		try {
		return sc.nextLine();
		}
		catch(Exception e) {
		System.out.println(e);
		}
		return "Error";
	}
	/*
	 * @param void
	 * @return String
	 */
	public static String getString()
	{
		return sc.next();
	}
	/*
	 * @param void 
	 * @return int
	 */
	public static int getint()
	{
		return sc.nextInt();
	}
	/*
	 * @param void 
	 * @return double
	 */
	public static double getDouble()
	{
		return sc.nextDouble();
	}
	/*
	 * @param void 
	 * @return float
	 */
	public static float getfloat()
	{
		return sc.nextFloat();
	}
	
	public static void printIntArray1D(int inputArray[])
	{
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.print(inputArray[i] +" ");
		}
	}
	
	
	/*Method to scan 2d Array
	 * @param int,int	//value of row and column
	 * @return int [][] 	//2d array
	 */
	public static int[][] Scan2dArray(int m,int n)
	{
		int [][]out=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				out[i][j]=getint();
			}
		}
		return out;
	}
	
	
	/*method to print 2d array
	 * @param int 2d array
	 * @return int 2d Array
	 */
	public static void print2dArray(int input[][] )
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length;j++)
			{
				System.out.print(input[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	
	
	/*method to convert the String into char array
	 * @param String
	 * @return char array
	 */
	public static char[] ToCharArray(String input)
	{
		char outchar[]=new char[input.length()];
		for(int i=0;i<input.length();i++)
		{
			outchar[i]=input.charAt(i);
		}
		return outchar;
	}
	
	/*method to Scan 1-Dimational Array integer array
	 * @param	int
	 * @return	int []
	 */
	public static int[] scan1DArray(int len) {
		int out[]=new int[len];
		for(int i=0;i<len;i++)
		{
			out[i]=getint();
		}
		return out;
	}
	
	
	/*Method to find out the sting comparison lexographycally
	*@param a
	*@param b
	*@return int
	*/
	public static int compareTo(String a,String b)
	{
		int len=0;
		int comp=0;
		if(a.length()>b.length())
		{
			len=a.length();
		}
		else
			len=b.length();
		
		for(int i=0;i<len;i++)
		{
			comp=a.charAt(i)-b.charAt(i);	
		}
		return comp;
	}

	
	/*method to spit the string into the string Array
	*@param in
	*@param split
	*@return String[]
	*/
	public static String[] mySplit(String in,char split) {
		int len=0;String temp="";int spacecount=0;String out[]=new String[in.length()];
		in=in+" ";
		for(int i=0;i<len;i++) {
			if(in.charAt(i)!=split) {
				temp=temp+in.charAt(i);
			}
			else 
				spacecount++;
				out[spacecount]=temp;
		}
		String fout[]=new String[spacecount];
		for(int j=0;j<spacecount+1;j++) {
			fout[j]=out[j];
		}
		return fout;
	}
	
	
	
	/*Method to print the one diamentional String[]
	*@param out
	*@return void
	*/
	public static void printStringArray(String[] out) {
		for(int i=0;i<out.length;i++)
			System.out.println(out[i]);
		
	}
	
	/*method to perform the insertion sort in int array
	*@param inArray
	*@return void
	*/
	public static int [] insertionSort(int[] inArray) {
		
		int len=inArray.length;
		for(int i=1;i<len;i++)
		{
			
			int j=i;
			while(j>=0 && inArray[j-1]>inArray[j])
			{
				int temp=inArray[j-1];
				inArray[j-1]=inArray[j];
				inArray[j]=temp;
				j--;
			}
			
		}
		return inArray;
		
	}
	
	/*Method to perform insertion sort in string array
	*@param int
	*@return void
	*/
	private static String[] insertionSortString(String in) {
		String inArray[]=mySplit(in,' ');
		int len=inArray.length;
		for(int i=1;i<len;i++)
		{
			
			int j=i;
			while(j>=0 && inArray[j-1].compareTo(inArray[j])>0)
			{
				String temp=inArray[j-1];
				inArray[j-1]=inArray[j];
				inArray[j]=temp;
				j--;
			}
			
		}
		return inArray;
		/*for(int i=0;i<len;i++)
			System.out.println(inArray[i]);*/
	}
	
	
	/*Method to scan a String user from console
	*@param getint
	*@return void
	*/
	public static String[] ScanStringarray(int len) {
		String out[]=new String[len];
		for(int i=0;i<len;i++)
			out[i]=KeybordUtil.getString();
		return out;
	}
}
