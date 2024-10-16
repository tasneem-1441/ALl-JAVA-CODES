package skl_oop_java_B3;

/*
 * Aim : Write a program to find area of Rectangle, Triangle and circle using method overloading.
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A
 */

import java.util.*;

public class RectangleTriangleCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int length, breath;
		double height, base;
		int radius;
		
		System.out.println("Start the program : ");
		
		
		Area obj1 = new Area();
		System.out.println("Enter length: ");
		length = sc.nextInt();
		System.out.println("Enter breath : ");
		breath = sc.nextInt();
		obj1.area(length, breath);
		obj1.display1();
		

		Area obj2 = new Area();
		System.out.println("Enter height: ");
		height = sc.nextDouble();
		System.out.println("Enter base : ");
		base = sc.nextDouble();
		obj2.area(height, base);
		obj2.display2();
		
		
		Area obj3 = new Area();
		System.out.println("Enter radius : ");
		radius = sc.nextInt();
		obj3.area(radius);
		obj3.display3();
		
		
		System.out.println("Thank You ");
		
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
		
	}

}

class Area 
	{
	
	double result1;
	double result2;
	double result3;
	
	Scanner sc =new Scanner(System.in);
	
	// method for rectangle
	void area(int length , int breath)
	{	
		result1 = (length * breath);
		
	 }
	 
	// method for triangle
		void area( double height, double base)
		{
			result2 = (height * base)/2;
			
		 }
		
		// method for circle
				void area( int radius)
				{
					result3 = 3.14*radius*radius;
					
			    }
				
				void display1()
				{
					System.out.println("The area of the rectangle is : "+result1);
					
				}
				
		void display2()
		{
			System.out.println("The area of the triangle is : "+result2);
		}
		
		void display3()
		{
			System.out.println("The area of the circle is : "+result3);
			
		}
		
	
	}
