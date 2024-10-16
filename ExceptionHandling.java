package quiz;
import java.util.Scanner;

///*
//* Aim : Write a program to perform division of two numbers accepted from user. Handle the NumberFormatException and also handle the divide by exception using nested try catch block.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  try {
	            
	            System.out.print("Enter the first number: ");
	            String input1 = sc.nextLine(); 
	            int num1 = Integer.parseInt(input1); 

	            System.out.print("Enter the second number: ");
	            String input2 = sc.nextLine(); 
	            int num2 = Integer.parseInt(input2); 

	           
	            try {
	                int result = num1 / num2;       
	                System.out.println("The result is: " + result);
	            } catch (ArithmeticException e) {
	                System.out.println("Error: Cannot divide by zero.");
	            }

	        } catch (NumberFormatException e) {
	            System.out.println("Error: Please enter valid integer numbers.");
	        }
		  System.out.println("\nThank You ");	
			System.out.println("Name : Shaikh Tasneem Azharul");
			System.out.println("\nUIN : 231P043");
	}

}


      
    