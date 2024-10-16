package skl_oop_java_B3;

/*
* Aim : Write a program for delete method of StringBuffer class.
* Name : Shaikh Tasneem Azharul
* UIN : 231P043
* Div : A.
*/

import java.util.*;

public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("Tasneem Azharul Shaikh");
		
		Scanner sc = new Scanner(System.in);
		
		 
		 System.out.println("Enter a string: "+str );

		 StringBuffer s= str.delete(8, 16);
		
		 System.out.println("Enter a string: "+s );

		 System.out.println("Thank You ");
		 System.out.println("Name : Shaikh Tasneem Azharul");
		 System.out.println("UIN : 231P043");
		
	}

}
