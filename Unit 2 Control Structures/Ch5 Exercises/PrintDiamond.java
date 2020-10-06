/*
 * Name: Jennifer Stegina
 * Date: 5 February 2019
 * Description: Print Diamond program
*/
import java.util.Scanner;

public class PrintDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int i;
		int j;
		int k;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows (odd number 1 - 19): ");
		number = input.nextInt();
		
		//number validation accept only odd numbers between 1-19	
		while (number < 1 || number > 19 || number % 2 == 0) {
		        // Get a number from the user.
		        System.out.println("Error. Invalid number.");
		        System.out.print("Enter a number between 1 - 20: ");
		        number = input.nextInt();
		 }
		
		 for (i = 1; i <=number; i=i+2) {
			 
			 for (j = number-i; j >=1; j--) {
				 System.out.print(" ");
			 }
			 
			 for (k = 1; k <=i; k++) {
				 System.out.print("* ");  
			 }
			 
			 System.out.println(""); 
		 } 
		 
		 for (i = 1; i <=number-2; i=i+2) {
			 
			 for (j = 1; j <=i; j++) {
				 System.out.print(" ");
			 }
			 
			 for (k = i; k <=number-2; k++) {
				 System.out.print(" *");
			 }
			 
			 System.out.println("");
		 }
		 
		 input.close();
	}	
}
