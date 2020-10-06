/* Name: Jennifer Stegina
 * Date: 25 January 2019
 * Description: Even or Odd determination program
 */
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter number: "); // prompt 
	      number = input.nextInt(); //number from user
	      
	      if(number %2 == 0) {
	    	  //number is even
	    	  System.out.println("Number is even.");
	      }
	      else {
	    	  //number is odd
	    	  System.out.println("Number is odd.");
	      }
	      input.close();
	}

}
