package skl_oop_java_B3;


/*
 * Aim : Create a Java program to manage a simple library book management system using classes and objects. 
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */


import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int bookId01;
		String title01;
		String authorName01;
		double price01;
		
		int bookId02;
		String title02;
		String authorName02;
		double price02;
		
		int bookId03;
		String title03;
		String authorName03;
		double price03;
		
		Book obj1 = new Book();
		Book obj2 = new Book();
		Book obj3 = new Book();
		
		
		System.out.println(" Enter Book ID 01 : ");
		bookId01=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Book Title 01 : ");
		title01=sc.nextLine();
		
		System.out.println("Enter Author Name 01:");
		authorName01=sc.nextLine();
		
		System.out.println("Enter Price 01:");
		price01=sc.nextDouble();
		
		
		
		System.out.println(" Enter Book ID 02 : ");
		bookId02=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Book Title 02 : ");
		title02=sc.nextLine();
		
		System.out.println("Enter Author Name 02:");
		authorName02=sc.nextLine();
		
		System.out.println("Enter Price 02:");
		price02=sc.nextDouble();
		
		
		
		System.out.println(" Enter Book ID 03 : ");
		bookId03=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Book Title 03 : ");
		title03=sc.nextLine();
		
		System.out.println("Enter Author Name 03:");
		authorName03=sc.nextLine();
		
		System.out.println("Enter Price 03:");
		price03=sc.nextDouble();
		
		obj1.insert1(bookId01, title01, authorName01, price01);	
		obj1.display1();
		
		obj2.insert2(bookId02, title02, authorName02, price02);	
		obj2.display2();
		
		obj3.insert2(bookId03, title03, authorName03, price03);	
		obj3.display3();
		
		
		System.out.println("Thank You ");
		
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
		
		
		}

}

	class Book
	
	{
		int bookId;
		String title;
		String authorName;
		double price;
		
		void insert1(int b1, String t1, String a1, double p1) {
			
			bookId = b1;  
	        title = t1;
	        authorName = a1;
	        price = p1;
			
	 }
		void insert2(int b2, String t2, String a2, double p2) 
		{
			
			bookId = b2;  
	        title = t2;
	        authorName = a2;
	        price = p2;
			
		}

	void insert3(int b3, String t3, String a3, double p3)
		{
	
			bookId = b3;  
		    title = t3;
		    authorName = a3;
		    price = p3;
	
		}
		
		void display1()
		{
			System.out.println("Book ID 01 : "+bookId);
			System.out.println("Book Title 01 : "+title);
			System.out.println("Author Name 01 :"+authorName);
			System.out.println("Price 01 :"+price);
			
			
		}
		
		void display2()
		{
			System.out.println("Book ID 02 : "+bookId);
			System.out.println("Book Title 02 : "+title);
			System.out.println("Author Name 02 :"+authorName);
			System.out.println("Price 02 :"+price);
			
			
		}
		
		void display3()
		{
			System.out.println("Book ID 03 : "+bookId);
			System.out.println("Book Title 03 : "+title);
			System.out.println("Author Name 03 :"+authorName);
			System.out.println("Price 03 :"+price);
			
			
		}
		
	}