package skl_oop_java_B3;
import java.util.*;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b,temporary = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		b=sc.nextInt();
		
		temporary=a;
		a=b;
		b=temporary;
		
		System.out.println("The value of a after swapping is :"+b);
		System.out.println("The value of b after swapping is :"+a);
	}

}
