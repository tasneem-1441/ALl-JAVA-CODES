package skl_oop_java_B3;

import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int principle,interest,time;
		int SI;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the principle amount : ");
		principle=sc.nextInt();
		
		System.out.println("Enter the rate of interest : ");
		interest=sc.nextInt();
		
		System.out.println("Enter the no of years : ");
		time=sc.nextInt();
		
		SI=principle*interest*time/100;
		
		System.out.println("The value of simple interest is : "+SI);
		
	}

}
