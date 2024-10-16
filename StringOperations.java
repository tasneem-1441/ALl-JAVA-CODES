package skl_oop_java_B3;

/*
 * Aim : Create a simple Java application that allows users to perform various
string manipulation operations.
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */

import java.util.*;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JaVa PrOgRaMmInG";
		String str2 = " Tasneem";

		Scanner sc =new Scanner(System.in);
		
		int ch;
		
		String str = new String();

		do {
		System.out.println("---MENU--- :");
		System.out.println("\n1.Reverse a String\n 2.Check for Palindrome:\n 3.Count Vowels and Consonants:\n 4.Convert to Uppercase and Lowercase:\n 5.Find Substring:\n");
		System.out.println("Enter a Choice :");
		ch = sc.nextInt();
		switch(ch) 
		{
		case 1: String result = " ";
			for(int i = str1.length()-1;i>=0;i--) {
			result +=str1.charAt(i);
			}
			System.out.println("New string is:"+result);
			break;
			
		case 2: String result1 = " ";
			for(int i = str1.length()-1;i>=0;i--) {
			result1 = result1+ str1.charAt(i);
		}
			if(str1.equalsIgnoreCase(result1)) {
				System.out.println("Palindrome");
				}
			else {
				System.out.println("Not Palindrome");
			}
			break;
		
		case 3:int count=0, value = 0;
			for(int i = 0; i<=str1.length()-1; i++)
			if(str1.charAt(i)=='a'|| str1.charAt(i)=='e'|| str1.charAt(i)=='i'|| str1.charAt(i)=='o'|| str1.charAt(i)=='u' || str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I' || str1.charAt(i)=='O' || str1.charAt(i)=='U')
			{
				count=count+1;
			}
			else {
				value = value+1;
			}
			System.out.println("Frequency of vowel is :"+count);
			System.out.println("Frequency of consonants is :"+value);
			break;
		case 4:
				System.out.println("New string is  :");
				System.out.println(str1.toLowerCase());
				System.out.println("New string is  :");
				System.out.println(str1.toUpperCase());
				break;
		case 5:
			if(str1.contains(str2)) {
				System.out.println("The substring exists");
			}
			else {
				System.out.println("The substring does not exists");
			}
			break;
		default	:System.out.println("Invalid Choice");

			
		}
		}while(ch!=0);
	
		System.out.println("Thank You ");

		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
		}
	}
	

