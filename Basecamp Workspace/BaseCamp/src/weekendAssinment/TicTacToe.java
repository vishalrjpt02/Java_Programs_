/***********************************************************************
 *@author 	Vishal Rajput
 *@version 	1.0
 *@Purpose	to create a gaming program tic tac toe
 *@File		TicTacToe.java
 *@Since	Feb 4, 2020
 ************************************************************************/
package weekendAssinment;

import java.util.Scanner;

public class TicTacToe {

	static char [][] tictac=new char[3][3];

	// 	1. Display unit
	static void display()
	{
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				System.out.print(tictac[i][j]+"  ");
			}
		System.out.println();
		}
	}

	
	// 2. replace unit
	public static void replace(char find,char replace)
	{
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(tictac[i][j]==find) {
					tictac[i][j]=replace;
					return;
				}
			}
		}
	}
	
	
	//	3. checking for win function

	static boolean checkforWin()
	{
		if(checkrow()||checkcolumn()||checkDiagonal())
			return true;
		else
			return false;
	}


	private static boolean checkDiagonal() {
		if((tictac[0][0]==tictac[1][1]&&tictac[2][2]==tictac[1][1])||(tictac[2][0]==tictac[1][1]&&tictac[1][1]==tictac[0][2]))
			return true;
		return false;
	}

	static boolean checkrow()
	{
		for(int i=0;i<3;i++)
		{
			if(tictac[i][0]==tictac[i][1]&&tictac[i][1]==tictac[i][2])
				return true;
		}
		return false;
	}

	static boolean checkcolumn()
	{
		for(int i=0;i<3;i++)
		{
			if(tictac[0][i]==tictac[1][i]&&tictac[1][i]==tictac[2][i])
				return true;
		}
		return false;
	}

	public static void main(String[] args)
	{

		// installing on bord
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				tictac[i][j]=Character.forDigit(++count,10);
			}
		}
		
		// taking user names 
		String user1,user2;
		char mark1=0,mark2;
		
		System.out.println("enter player1 name");
		user1=sc.nextLine();
		
		System.out.println("enter player2 name");
		user2=sc.nextLine();
		
		
  //-----------------------------------Markselection-----------------------------------------------------//	
		
		System.out.println("enter mark forplayer 1");
		char chk=(sc.next().charAt(0));
		if((chk=='x'||chk=='o')||(chk=='X'||chk=='O'))
		{
			mark1=chk;
		
			if(mark1=='X'||mark1=='x')
			{
				mark2='O';
			}
			else
				mark2='X';
		}
		else
		{
			System.out.println("enter the correct mark selection");
			chk=(sc.next().charAt(0));
			mark1=chk;
			
			if(mark1=='X'||mark1=='x')
			{
				mark2='O';
			}
			else
				mark2='X';
		}
		
		
		
		//Display Board
		display();
		
	//play...
		char input;
		for(int i=0;i<4;i++)
		{
			System.out.print(user1+" Turn :");
			input=sc.next().charAt(0);
			replace(input,mark1);
			display();
			if(checkforWin())
			{
				System.out.print("we have a winner " +user1);
				break;
			}
			System.out.print(user2+" Turn :");
			input=sc.next().charAt(0);
			replace(input,mark2);
			display();
			if(checkforWin())
				{
					System.out.print("we have a winner "+user2);
					break;
				}
		}
		if(checkforWin()==false)
			System.out.print(user1 +"turn: ");
		input=sc.next().charAt(0);
		replace(input,mark1);
		display();
		
		if(checkforWin())
		{
			System.out.print("we have a winner");
		}
		else
			System.out.print("match is draw");
		
		sc.close();
	}
		
}