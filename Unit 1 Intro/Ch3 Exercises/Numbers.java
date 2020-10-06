/* Name: Jennifer Stegina
 * Date : 28 January 2019
 * Description: Number program for sum, product, average, and smallest number/largest number
 */

import java.util.Scanner; //must import to use scanner for input

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a scanner to read input
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int number1; 
		int number2;
		int number3;
		int sum; 
        double average;
        int product;
        int smallestNumber;
        int largestNumber;
		
		System.out.print("Enter the first integer: ");
		number1 = input.nextInt(); //read first number entered
		
		System.out.print("Enter the second integer: ");
		number2 = input.nextInt(); //read the second number entered
		
		System.out.print("Enter the third integer: ");
		number3 = input.nextInt();  //read the third number entered
		
		sum = number1 + number2 + number3;
        average = (number1 + number2 + number3)/3;
        product = number1 * number2 * number3;
         
        //make the default smallest number as the first entered
        smallestNumber = number1; 
        if (number2 < smallestNumber){
            smallestNumber = number2;
        }
        if (number3 < smallestNumber){
            smallestNumber = number3;
        }
            
        //also make the default largest number as the first entered
        largestNumber = number1; 
        if (number2 > largestNumber){
            largestNumber = number2;
        }
        if (number3 > largestNumber){
            largestNumber = number3;
        }
         
        System.out.printf ("\nSum = %d\nAverage = %d\nProduct = %d"
        		+ "\nSmallest number = %d\n" + "Largest number = %d\n", 
        		sum, average, product, smallestNumber, largestNumber);
    
	input.close();
	}
}
