
/*
 * Name: Jennifer Stegina
 * Date: 5 February 2019
 * Description: Salary Calculator program
*/

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalEmployees;
		int overtimeEmployees = 0;
		
		double grossPay = 0;
		double hourlyRate;
		double hoursWorked;
		double overtimeRate;
		double overtimeHours;
		double overtimePay;
		double totalGrossPay = 0;
		double regularWorkWeek = 40; //set the 'constant' for regular work week hours
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter total number of employees: ");
		totalEmployees = input.nextInt();
		
		//starting at one because there is no employee zero
		int i = 1; 
		while (i <= totalEmployees) { //only loop for number of entered employees
	
			System.out.printf("Enter the number of hours worked for employee %d:", i);
			hoursWorked = input.nextInt();

			System.out.printf("Enter the hourly rate for employee %d:", i);
			hourlyRate = input.nextInt();

			if (hoursWorked > regularWorkWeek) { //overtime calculations
				overtimeRate = hourlyRate * 1.5;
				overtimeHours = hoursWorked - regularWorkWeek;
				overtimePay = overtimeRate * overtimeHours;
				grossPay = (regularWorkWeek * hourlyRate) + overtimePay;
				overtimeEmployees++;
			} 
			
			else { //regular pay
				grossPay = hoursWorked * hourlyRate;
			}
			totalGrossPay += grossPay; //increase accumulator for total pay values
			System.out.printf("Gross pay for employee %d is $%.2f.\n", i, grossPay);
			i++;//increase the employee counter
		}
		System.out.printf("The total gross of all employees is $%.2f.\n", totalGrossPay);

		System.out.printf("The number of employees that worked overtime is %d.", overtimeEmployees);

		input.close();
	}

}
