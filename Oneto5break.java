package skl_oop_java_B3;

/*
 * Aim : WAP to display number 1 to 5
 * Name: Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A
 */

import java.util.Scanner;

public class Oneto5break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n :");
		
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("\nThank You ");	
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
	}

}
