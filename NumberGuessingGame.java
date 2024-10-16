package skl_oop_java_B3;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int rightNo = 50;
		int guess;
		int i = 0;
    	System.out.println("Enter the your guess from 1 to 100 numbers:");


    
    while (i<10) {
    	guess = sc.nextInt();
    	i++;
    		if (guess==rightNo)
    		{
    	    	System.out.println("Yess correct guess you have won the game");
    	    	break;
    		}
    		else if(guess<rightNo) 
    		{
    	    	System.out.println("Your guess is too low, try again");
    		}
    		else 
    		{
    			System.out.println("Your guess is too high, try again");
    		}
    		
    			}
    
    	System.out.println("You have used up all your 10 guesses, the right number is:"+rightNo);
    
    }
   
    }
    



