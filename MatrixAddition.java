package skl_oop_java_B3;

/*
 * Aim : Write a program in java to perform Matrix Addition
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */

import java.util.*;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int add[][] = new int[3][3];
		int set1[][] = new int[3][3];
		int set2[][] = new int[3][3];
		int i,j;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Start the program : ");
		
		System.out.println("Enter the first 3x3 matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				set1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the second 3x3 matrix");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				set2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The first 3X3 matrix is : ");
		for (i=0 ; i<3 ; i++)
		{
			for (j=0 ; j<3 ; j++)
			{
				System.out.print(set1[i][j]+"\t");
			}
				System.out.println(" ");
			
		}
		
		
		System.out.println("The second 3X3 matrix is : ");
		for (i=0 ; i<3 ; i++)
		{
			for (j=0 ; j<3 ; j++)
			{
				System.out.print(set2[i][j]+"\t");
			}
				System.out.println(" ");
			
		}
		
		System.out.println(" ");
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				add[i][j] = set1[i][j] + set2[i][j];
			}
		}
		
		System.out.println("The resultant addition 3X3 matrix is :") ;
		for (i=0 ; i<3 ; i++)
		{
			for (j=0 ; j<3 ; j++)
			{
				System.out.print(add[i][j]+"\t");
			}
				System.out.println(" ");
		
		}
		
		System.out.println("Thank You ");
		
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
		
	}

}
