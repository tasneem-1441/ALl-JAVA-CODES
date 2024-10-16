package skl_oop_java_B3;

/*
 * Aim : WAP to guess the number until the predefined number is guessed correctly
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */



import java.util.*;


public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n; //n is the number while user inputs
		int predefinedNumber = 5;
		
		
		do {
			System.out.println("Enter a number to guess : ");
			n=sc.nextInt();
			
			if(n==predefinedNumber)
			{
				System.out.println("Yayyy!! You have guessed it right!!!");
			}
			else
			{
				System.out.println("Nope, that's not right");

			}
			
		}while(n!=predefinedNumber);
		
	
	}

}
