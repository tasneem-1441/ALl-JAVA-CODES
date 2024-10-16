package skl_oop_java_B3;



/*
 * Aim : Write a Java program that prompts the user to enter their name, age, and favorite number. 
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */

import java.util.*;


public class Project_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name :");
		String ft=sc.nextLine();
		
		System.out.println("Enter your last name :");
		String lt=sc.nextLine();
		 
		System.out.println("Enter your birth year :");
		int yearOfbirth=sc.nextInt();
		
		int CURRENT_YEAR = 2024;
		
		int age = CURRENT_YEAR-yearOfbirth;
		
		System.out.println("Your first name is "+ft);
		System.out.println("Your last name is "+lt);
		System.out.println("Your age according to the current year is "+age);
		
	}

}
