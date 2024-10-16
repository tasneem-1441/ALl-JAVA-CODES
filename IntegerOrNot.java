package skl_oop_java_B3;

import java.util.*;

public class IntegerOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the value of n : ");
		n=sc.nextInt();
		
		do
			{if(n>=1)
		{
			System.out.println("The entered number is an integer. ");
		}
		else
		{
			System.out.println("The entered number is not an integer. ");
		}
			}while(n<1);
		
	}
	

}
