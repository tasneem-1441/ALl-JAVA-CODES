package quiz;

///*
//* Aim : Write a program to print alphabets and numbers using two threads.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

public class Alphabets_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread obj1 = new Thread(new PrintNumbers());
		Thread obj2 = new Thread(new PrintAlphabets());
		obj1.start();
		obj2.start();
		 System.out.println("\nThank You ");	
			System.out.println("Name : Shaikh Tasneem Azharul");
			System.out.println("UIN : 231P043");
		  obj1.setPriority(Thread.MAX_PRIORITY);  
	        obj2.setPriority(Thread.MIN_PRIORITY);
	      
		
	}

}
class PrintNumbers implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<=26;i++) {
			System.out.println(i);
		}
	}
	
}

class PrintAlphabets implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
	
}










