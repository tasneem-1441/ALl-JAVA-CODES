package myPackage;

///*
//* Aim : Write a program in java to find Largest between two number using packages.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

import myPackage.Compare;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10, m=20;
		Compare current = new Compare(n, m);
		if(n != m) {
		current.getmax();
		}
		else {
		System.out.println("Both the values are same");
		}
		
		System.out.println("\nThank You ");	
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("\nUIN : 231P043");
	}

}
