package skl_oop_java_B3;

/*
 * Aim : Write a program to check whether it is a Neon number or not.
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */

import java.util.*;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int mul;
		int sum;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Start the program : ");
		
		System.out.println("Enter number 1 to check");
		num1 = sc.nextInt();
		
		System.out.println("Enter number 2 to check");
		num2 = sc.nextInt();
		
		mul=num1*num2;
		sum=num1+num2;
		if(mul == sum) 
		{
			System.out.println("The entered number is a neon number");
		}
		else 
		{
			System.out.println("The entered number is not a neon number");
		}
		
		System.out.println("Thank You ");
		
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");

	}

}
