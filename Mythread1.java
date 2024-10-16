package quiz;

///*
//* Aim : Write a program to display the string in main thread and child thread */
//* Name : Shaikh Tasneem Azharul
//* UIN : 231P043
//* Div : A.
//*/

public class Mythread1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythread1 obj = new Mythread1();
		System.out.println("this is the main thread!");
		obj.create();
		System.out.println("\nThank You ");	
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
	}
		void create() {
			Thread t = new Thread(this);
			t.start();
}
		public void run() {
		while(true) {
			try {
				System.out.println("this is the main thread!");
				Thread.sleep(500);
			}
			catch(InterruptedException e) {}
}
}
}
