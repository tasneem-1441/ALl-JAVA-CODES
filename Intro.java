package skl_oop_java_B3;

/*
 * Aim : Write a Java program that prompts the user to enter their name, age, and favorite number. 
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */


import java.util.*;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		 String st=sc.nextLine();
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		System.out.println("Enter your favorite number : ");
	    int fav_no=sc.nextInt();
	    
		
	    System.out.println("Enter your name "+st);
	    System.out.println("Enter your age "+age);
	    System.out.println("The double of your favorite number is "+fav_no);
	    
	}

}
