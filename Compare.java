package myPackage;

///*
//* Aim : Write a program in java to find Largest between two number using packages.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

public class Compare {
		
			int num1, num2;
			public Compare(int n, int m) {
			num1 = n;
			num2 = m;
			}
			public void getmax(){
			if ( num1 > num2 ) {
			System.out.println("Maximum value of two numbers is " + num1);
			}
			else {
			System.out.println("Maximum value of two numbers is " + num2);
			}
			}
		
	
			public static void main(String args[]) {
				Compare obj = new Compare(15, 34);
				Compare obj1 = new Compare(500, 345);
			obj.getmax();
			obj1.getmax();
			System.out.println("\nThank You ");	
			System.out.println("Name : Shaikh Tasneem Azharul");
			System.out.println("\nUIN : 231P043");
}
}
