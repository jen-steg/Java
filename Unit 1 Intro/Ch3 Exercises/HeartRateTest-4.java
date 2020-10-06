/*
 * Name: Jennifer Stegina
 * Date: 28 January 2019
 * Description: Heart Rate Problem
 */
import java.util.*;

public class HeartRateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeartRate heartRate1 = new HeartRate("firstName", "lastName", 0, 0, 0);
			
		// create a Scanner to obtain input from the command window
	    Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter your first name: ");
			String firstName = input.nextLine();
			heartRate1.setFirstName(firstName);
			heartRate1.getFirstName();
			
		System.out.print("Enter your last name: ");
			String lastName = input.nextLine();
			heartRate1.setLastName(lastName);
			heartRate1.getLastName();
			
		System.out.print("Enter the day of your birth (in DD format): ");
			int birthDay = input.nextInt();
			heartRate1.setBirthDay(birthDay);
			heartRate1.getBirthDay();
			
		System.out.print("Enter the month of your birth (in MM format): ");
			int birthMonth = input.nextInt();
			heartRate1.setBirthMonth(birthMonth);
			heartRate1.getBirthMonth();
			
		System.out.print("Enter the year of your birth (in YYYY format): ");
			int birthYear = input.nextInt();
			heartRate1.setBirthYear(birthYear);
			heartRate1.getBirthYear();
		
		System.out.println();
			heartRate1.printInformation();
		
		input.close();
	}

}
