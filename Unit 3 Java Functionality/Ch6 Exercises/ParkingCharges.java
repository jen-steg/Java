import java.util.Scanner;

/*
 * Name: Jennifer Stegina
 * Date: 2/13/2019
 * Description: Parking charges
 */
public class ParkingCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarations
		double hours, totalReceipts = 0, currentCharge = 0;
		int custCount = 0;

		// create scanner
		Scanner input = new Scanner(System.in);

		// validate hours
		hours = getInput(input);

		// calculate and print charges
		while (hours != -1) {
			// update variables
			currentCharge = calculateCharges(hours);
			totalReceipts += currentCharge;
			custCount++;

			// print current totals
			System.out.printf("Current charge: $%,.2f, Total receipts: $%,.2f%n", currentCharge, totalReceipts);

			// validate hours
			hours = getInput(input);
		}

		// print summary
		System.out.printf("%nThere were %d customers entered, with an average charge of $%.2f", custCount,
				(custCount == 0 ? 0 : totalReceipts / custCount));

		// close scanner
		input.close();

	}

	public static double getInput(Scanner input) {
		double hours;

		// prompt user for hours parked
		System.out.print("Enter number of hours [0-24](-1 to quit): ");
		hours = input.nextDouble();

		while (hours < -1 || hours > 24) {
			System.out.println("Hours must be between 0 and 24");
			System.out.print("Enter number of hours [0-24](-1 to quit): ");
			hours = input.nextDouble();
		}
		return hours;
	}

	public static double calculateCharges(double hours) {

		// A parking garage charges a $2.00 minimum fee
		double charge = 2.00;

		// charge additional $0.50 per hour for each hour or part thereof in
		// excess of
		// three hours.
		if (hours > 3) {
			charge += (Math.ceil(hours) - 3) * .5;
		}

		// The maximum charge for any given 24-hour period is $10.00.
		if (charge > 10) {
			charge = 10.00;
		}

		return charge;
	}

}
