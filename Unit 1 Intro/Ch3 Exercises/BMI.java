/* 
 * Name: Jennifer Stegina
 * Date: 28 January 2019
 * Description: BMI program
 */
import java.util.Scanner; //must import to use scanner to read input

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a scanner to read input
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double weight;
        double height;
        double bmi;
		
        //ask the user for weight (lbs)
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextDouble();
        
        //ask the user for height (inches)
        System.out.print("Enter your height in inches: ");
        height =input.nextDouble();
        
        //print out chart given by gov't to show ranges for user eval
        System.out.println( "\nDepartment of Health and Human Services/National Institutes of Health states: ");
        System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");
        
        //calculate user's BMI
        bmi = (weight * 703) / (height * height);
        
        //print user's BMI
        System.out.printf ("Your Body Mass Index (BMI) is %3.1f.\n\n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("You're in the underweight range.");
        } 
        	else if (bmi < 25) {
        		System.out.println("You're in the normal range.");
        	} 
        			else if (bmi < 30) {
        				System.out.println("You're in the overweight range.");
        			} 
        				else {
        					System.out.println("You're in the obese range.");
        				}
        input.close();
    }
}