package skl_oop_java_B3;

/*
 /*
 * Aim : Write a Java program to create a Product class that includes a constructor to initialize product details and methods to display and manipulate the data. 
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */


import java.util.Scanner;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantity;
		String name;
		double price;
		
		
		
		Product obj1 = new Product();
		
		System.out.println(" Enter Produt Quantity 01 : ");
		quantity=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Product Name 01 : ");
		name=sc.nextLine();
		
		System.out.println("Enter Product Price 01:");
		price=sc.nextDouble();
		
		obj1.insert(quantity, name, price);	
		obj1.display1();
		obj1.calcValue();
		
		System.out.println("Enter new price for Product 01:");
        double newPrice = sc.nextDouble();
        obj1.updatePrice(newPrice);
        
        
        System.out.println("Enter new quantity for Product 01:");
        int newQuantity = sc.nextInt();
        obj1.updateQuantity(newQuantity);

      
        obj1.display2();
		
        System.out.println("Thank You ");
		
		System.out.println("Name : Shaikh Tasneem Azharul");
		System.out.println("UIN : 231P043");
	}

}


class Product{
	
	int quantity;
	String name;
	double price;
	
	void insert(int q, String n, double p) {
		
		quantity = q;  
        name = n;
        price = p;
		
 }
   
   double calcValue() {
	   return price*quantity;
   }
	
   void updatePrice(double newPrice) {
	   price=newPrice;
   }
   
   void updateQuantity(int newQuantity) {
	   quantity=newQuantity;
   }
	void display1()
	{
		System.out.println("Product Quanity : "+quantity);
		System.out.println("Product Name : "+name);
		System.out.println("Product Price :"+price);
		 System.out.println("Total Stock Value: " + calcValue());
	}
	
	void display2()
	{
		System.out.println("New Product Quanity : "+quantity);
		System.out.println("Product Name : "+name);
		System.out.println("New Product Price :"+price);
		 System.out.println("New Total Stock Value : " + calcValue());
	}
	
	
}