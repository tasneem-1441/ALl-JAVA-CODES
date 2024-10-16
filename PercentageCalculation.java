package skl_oop_java_B3;

import java.util.*;

public class PercentageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int sub1,sub2,sub3,sub4,sub5;
		int p,percentage;
		
		System.out.println("Enter the marks of sub1 : ");
		sub1=sc.nextInt();
		
		System.out.println("Enter the marks of sub2 : ");
		sub2=sc.nextInt();
		
		System.out.println("Enter the marks of sub3 : ");
		sub3=sc.nextInt();
		
		System.out.println("Enter the marks of sub4 : ");
		sub4=sc.nextInt();
		
		System.out.println("Enter the marks of sub5 : ");
		sub5=sc.nextInt();
		
		p=(sub1+sub2+sub3+sub4+sub5)/100;
				percentage=p*500;
		
		
		System.out.println("The percentage is : "+percentage);
	}

}
