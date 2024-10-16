package skl_oop_java_B3;

import java.util.*;

public class VectorPostLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		Scanner sc = new Scanner(System.in);
		int ch;
		
	
		do {
		System.out.println("---MENU--- :");
		System.out.println("\n1.Add a Students' name\n 2.Remove a Students' name:\n 3.Display\n4..Exit\n");
		System.out.println("Enter a Choice :");
		ch = sc.nextInt();
		sc.nextLine();
		switch(ch) {
		
		case 1: String name;
				System.out.println("Enter the student's name which u want to add:");
				name = sc.nextLine();
				v.add(name);
				System.out.println("Contact added:"+name);
				break;
		
		case 2: String removeName;
				System.out.println("Enter the student's name which u want to delete:");
				removeName = sc.nextLine();
				if(v.remove(removeName)) {
					System.out.println("Name deleted:"+removeName);
				}
				else {
					System.out.println("Name not found!!");
				}
				break;		
				
		case 3: System.out.println("Display:");
				Enumeration<String> en1 = v.elements();
				if (!en1.hasMoreElements()) {
					System.out.println("No students to display.");
				}
				else {
					while (en1.hasMoreElements()) {
						System.out.println(en1.nextElement());
					}
				}
				break;
				
				
		default: System.out.println("Invalid Choice");	
				 System.out.println("Thank You ");
				 System.out.println("Name : Shaikh Tasneem Azharul");
				 System.out.println("UIN : 231P043");
				
		}
		}while(ch!=5);
		
	}

}
