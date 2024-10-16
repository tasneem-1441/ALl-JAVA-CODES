package skl_oop_java_B3;

/*
 * Aim : Create a simple Java application to manage a contact list using the
Vector class.
 * Name : Shaikh Tasneem Azharul
 * UIN : 231P043
 * Div : A.
 */

import java.util.Scanner;
import java.util.Vector;

public class ContactApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v=new Vector();
		Scanner sc = new Scanner(System.in);
		int ch;
	
		do {
		System.out.println("---MENU--- :");
		System.out.println("\n1.Add a Contact\n 2.Remove a Contact:\n 3.Display all Contacts\n 4.Search a Contact\n5.Exit\n");
		System.out.println("Enter a Choice :");
		ch = sc.nextInt();
		sc.nextLine();
		switch(ch) {
		case 1: String contact;
				System.out.println("Enter the contact which u want to add:");
				contact = sc.nextLine();
				v.add(contact);
				System.out.println("Contact added:"+contact);
				break;
				
		case 2: String removeContact;
				System.out.println("Enter the contact which u want to delete:");
				removeContact = sc.nextLine();
				if(v.remove(removeContact)) {
					System.out.println("Contact deleted:"+removeContact);
				}
				else {
					System.out.println("Contact not found!!");
				}
				break;
				
		case 3: System.out.println("Contacts present are:"+v);
				break;
				
		case 4: String search;
				System.out.println("Enter the contact which you want to search:");
				search = sc.nextLine();
				int index = v.indexOf(search);
				if(index!=-1) {
					System.out.println("Contact found at index:"+index);
				}
				else{
					System.out.println("Contact not found!!");
					}
				break;
				
		case 5:	System.out.println("Exiting....");
				break;
				
		default:System.out.println("Invalid Choice");
		}
			
	}while(ch!=6);
		System.out.println("Thank You ");
		 System.out.println("Name : Shaikh Tasneem Azharul");
		 System.out.println("UIN : 231P043");

}
}