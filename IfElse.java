package skl_oop_java_B3;

/*
 * Aim : WAP to check whether the entered number is positive, negative or zero using if else statement
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */


import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		System.out.println("Enter a number : ");
		a = sc.nextInt();
		
		if(a<0)
		{
			System.out.println("The entered number is negative");
		}
		else if(a>=1)
		{
			System.out.println("The entered number is positive");
		}
		else
		{
			System.out.println("The entered number is zero");
		}
	}

}
