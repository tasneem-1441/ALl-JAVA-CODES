package skl_oop_java_B3;

/*
 * Aim : WAP to display the name of the month by entering the month's number using switch statement
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */



import java.util.*;


public class MonthUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
	
		
		switch(n)
		{
		case 1 :
			System.out.println("January");
			break;
			
		case 2 :
			System.out.println("Febuary");
			break;
			
		case 3 :
			System.out.println("March");
			break;
			
		case 4 :
			System.out.println("April");
			break;
			
			
		case 5 :
			System.out.println("May");
			break;
			
		case 6 :
			System.out.println("June");
			break;
			
		case 7 :
			System.out.println("July");
			break;
			
		case 8 :
			System.out.println("August");
			break;
			
		case 9 :
			System.out.println("September");
			break;
			
		case 10 :
			System.out.println("October");
			break;
			
		case 11 :
			System.out.println("November");
			break;
			
		case 12 :
			System.out.println("December");
			break;
		}

	}

}
