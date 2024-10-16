package quiz;

///*
//* Aim : Write a program to perform division of two numbers accepted from user. Handle the IOException, NumberFormatException and also handle the divide by exception using multiple try catch block.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		    try {
		    	String input1;
		    	String input2;
		      System.out.print("Enter the first number: ");
		      input1 = sc.readLine();  
		      System.out.print("Enter the second number: ");
		      input2 = sc.readLine();  
		            
		   try {
		         int num1 = Integer.parseInt(input1);
		         int num2 = Integer.parseInt(input2);
		    try {
		         int result = num1 / num2;
		          System.out.println("The result is: " + result);
		        }
		    catch (ArithmeticException e) {
		          System.out.println("Error: Cannot divide by zero.");
		           }

		            } catch (NumberFormatException e) {
		                System.out.println("Error: Please enter valid integer numbers.");
		            }

		        } catch (IOException e) {
		            System.out.println("Error: An I/O error occurred while reading input.");
		        }
		    System.out.println("\nThank You ");	
			System.out.println("Name : Shaikh Tasneem Azharul");
			System.out.println("\nUIN : 231P043");
		    }
		}

