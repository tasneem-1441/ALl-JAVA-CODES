package skl_oop_java_B3;
import java.util.Scanner;
public class ArrayExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  
		int matrix[][]=new int[3][3];
		int i,j;
		
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<3;i++) 
        {
        	for(j=0;j<3;j++)
        	{
        		matrix[i][j]= sc.nextInt();
        	}
        }
        
        System.out.println("The elements of the matrix");
        for(i=0;i<3;i++) 
        {
        	for(j=0;j<3;j++)
        	{
                System.out.print(matrix[i][j]+" ");
        	}
            System.out.println();
        }
        
        System.out.println("The transpose of the matrix");
        for(i=0;i<3;i++) 
        {
        	for(j=0;j<3;j++)
        	{
                System.out.print(matrix[j][i]+" ");
        	}
            System.out.println();
        }
        

	}

		
		
	}


