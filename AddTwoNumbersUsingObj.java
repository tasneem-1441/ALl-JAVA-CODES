package skl_oop_java_B3;

import java.util.*;


class Add
{
	int a,b;
	
	Scanner sc=new Scanner(System.in);
	
	void getdata() {
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		
		
		System.out.println("Enter the value of b : ");
		b=sc.nextInt();
	}
	
	void display() {
		System.out.println("Addition : "+(a+b));
	}
	
}





public class AddTwoNumbersUsingObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program starts :");
		
		Add obj1 = new Add();
		
		obj1.getdata();
		obj1.display();
		
	}

}
