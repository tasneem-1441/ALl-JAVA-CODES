package quiz;

///*
//* Aim : Write a Program to implement user defined Exception in java.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/
import java.util.*;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		try {
		if(n<1 || n>12) 
		{
			throw new ArithmeticException();	
		}
		 System.out.println("The entered number is "+n);
		}
		
		catch(ArithmeticException ae) {
			 System.out.println("Invalid Number");	

		}
		}while(n!=0);
	}
}

