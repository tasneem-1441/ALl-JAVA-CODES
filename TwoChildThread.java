package quiz;

///*
//* Aim : Write a program to print /*/*/*/*/* using two child thread.
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

public class TwoChildThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj1 = new Thread(new PrintSlash());
		Thread obj2 = new Thread(new PrintAstrix());
		obj1.start();
		obj2.start();
		 System.out.println("\nThank You ");	
			System.out.println("Name : Shaikh Tasneem Azharul");
			System.out.println("\nUIN : 231P043");
		  obj1.setPriority(Thread.MAX_PRIORITY);  
	        obj2.setPriority(Thread.MIN_PRIORITY);

		
	}

}
class PrintSlash implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5;i++) {
			System.out.print("/"); // used print instead of println to print it all in the same line
		}
	}
	
}


class PrintAstrix implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5;i++) {
			System.out.print("*");  // same reason
			
		}
	}
	
}