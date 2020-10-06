import java.util.Scanner;

/* 
 * Name: Jennifer Stegina
 * Date: 1 February 2019
 * Description: Gas Mileage Problem
 */
public class GasMileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int milesDriven, gallonsUsed;
		int totalMilesDriven = 0, totalGallonsUsed = 0;
		double milesPerGallon;

		Scanner input = new Scanner(System.in);
		System.out.print("Enters miles driven (-1 to quit): ");
		milesDriven = input.nextInt();
		// loop to ensure that milesDriven > -1
		while (milesDriven < -1) {
			System.out.println("Error. Miles driven must be positive or -1 to quit.");
			System.out.print("Enters miles driven (-1 to quit): ");
			milesDriven = input.nextInt();
		}
		// I have a valid milesDriven or -1 to quit
		while (milesDriven != -1) {
			System.out.print("Enter gallons of gas used: ");
			gallonsUsed = input.nextInt();

			while (gallonsUsed <= 0) {
				System.out.println("Error. Gallons entered must be positive.");
				System.out.print("Enter gallons of gas used: ");
				gallonsUsed = input.nextInt();
			}
			milesPerGallon = (double) milesDriven / gallonsUsed;
			totalMilesDriven += milesDriven;
			totalGallonsUsed += gallonsUsed;

			System.out.printf("MPG this tankful:, %.2f%n", milesPerGallon);

			System.out.print("Enters miles driven (-1 to quit): ");
			milesDriven = input.nextInt();
			// loop to ensure that milesDriven > -1
			while (milesDriven < -1) {
				System.out.println("Error. Miles driven must be positive or -1 to quit.");
				System.out.println("Enters miles driven (-1 to quit): ");
				milesDriven = input.nextInt();
			}
		}

		if (totalGallonsUsed != 0) {
			System.out.printf("Total MPG: %.2f%n", (double) totalMilesDriven / totalGallonsUsed);
		}
		input.close();
	}

}
