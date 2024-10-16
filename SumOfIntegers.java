package skl_oop_java_B3;

/*
 * Aim : Write a Java program and compute the sum of an integer's digits.
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */

import java.util.*;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum = 0, num, rem;
		
	
		System.out.println("Enter a group of number");
		num = sc.nextInt();
		
		while(num>0) {
			rem = num%10;
			sum = sum +rem;
			num = num/10;
	}
	
		System.out.println("Sum of the digits is :"+sum);
		
		System.out.println("Thank You ");

		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");

	}

}
