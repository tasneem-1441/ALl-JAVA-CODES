package myPackage;

///*
//* Aim : Write a program in java to add two number using packages.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

public class Add {

	int num1;
	int num2;
	Add(int n, int m){
		num1= n;
		num2 = m;
	}
		public void getAddition() {
			int result;
			result = num1+num2;
			System.out.println("The addition of two number is " + result);
		}
}
