package skl_oop_java_B3;

import java.util.*;

public class SmallestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		SMT obj1=new SMT();
		
		
		System.out.println("Start the program : ");
		
		obj1.getdata();
		
		obj1.FindSmall();
		
		
	}

}
	class SMT{
		
		int a, b, c;
		
		void getdata()
		
		{
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter the value of a : ");
			a=sc.nextInt();
		
			System.out.println("Enter the value of b : ");
			b=sc.nextInt();
			
			System.out.println("Enter the value of c : ");
			c=sc.nextInt();
			
		}
		
		void FindSmall()
		{
			if (a<b && a<c)
			{
				System.out.println("The smallest number is a ");
			}
			else if(b<c && b<a)
			{
				System.out.println("The smallest number is b ");
			}
			else
			{
				System.out.println("The smallest number is c ");
			}
		
			
		}
		
		
		
	}