/*
 * Name: Jennifer Stegina
 * Date: 5 February 2019
 * Description: Print Asterisks program
*/
import java.util.Scanner;

public class PrintAsterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int i;
		int j;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1-20: ");
	    number = input.nextInt();
	    
	    //if and only if number is validated
	    while (number < 1 || number > 20) {
	        // Get a number from the user.
	        System.out.println("Error. Invalid number.");
	        System.out.print("Enter a number between 1 - 20: ");
	        number = input.nextInt();
	    }

	    for (i = 1; i <= number; i++) 
	    { 
	        for (j = 1; j <= number; j++) 
	        { 
	          if (i==1 || i==number || j==1 || j==number)             
	               System.out.printf("*");             
	            else
	                System.out.printf(" ");             
	        } 
	        System.out.printf("\n"); 
	    } 
		
		input.close();
	}
	
}
