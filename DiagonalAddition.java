package skl_oop_java_B3;

/*
 * Aim : Write a program in java to perform sum of diagonal elements of a matrix.
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */

import java.util.*;

public class DiagonalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int set[][] = new int[3][3];
		int i,j;
		int d1=0, d2=0;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Start the program : ");
		
		System.out.println("Enter the 3x3 matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				set[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The 3X3 matrix is : ");
		for (i=0 ; i<3 ; i++)
		{
			for (j=0 ; j<3 ; j++)
			{
				System.out.print(set[i][j]+"\t");
			}
				System.out.println(" ");
		}
		
		
		for (i=0 ; i<3 ; i++)
		{
			for (j=0 ; j<3 ; j++)
			{
				if(i==j)
				{
					d1 = d1+set[i][j];
				}
				
			}		
		}

			
			for (i=0 ; i<3 ; i++)
			{
				for (j=0 ; j<3 ; j++)
				{
					if(i==j)
					{
						d2 = d2+set[i][j];
					}
					
				}
			}	
			
			
		System.out.println("The sum of first diagonal is : "+d1);
		System.out.println("The sum of second diagonal is : "+d2);
		
		System.out.println("Thank You ");
		
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
		}

	}

