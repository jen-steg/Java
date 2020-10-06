/*
 * Name: Jennifer Stegina
 * Date: 18 February 2019
 * Description: Employee PieceWorker Problem
 * 
 * Instructions: In your main class (EmployeeTest.java), do the following:
 * 1) Create an Array of 10 Employee Objects
 * 2) Ask the user in a loop, which type of employee they are creating 
 * 		(Hourly, Salary, Commission, or PieceWorker).  Depending on the type of employee, 
 * 		ask the user for additional information as necessary. Then Instantiate your class and store in your array.
 * 3) Ensure that the loop can handle any exceptions thrown and will allow the user 
 * 		to enter up to 10 different types of employees.
 * 4) Once the user finishes entering data, loop through your array and print 
 * 		out the toString method of everything stored in the array.
 * 5) Also, print out the total earnings for all the employees entered and the number of each type of employee entered.
 */
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//polymorphism -> all except employee can be set as employees
		Employee employees[] = new Employee[10];
		int employeeCounter = 0;//array counter
		int employeeType = 0;
		int hourlyEmployeeCounter = 0;
		int commissionEmployeeCounter = 0;
		int salariedEmployeeCounter = 0;
		int pieceWorkerCounter = 0;
		String firstName;//from the super abstract class Employee
		String lastName;
		String socialSecurityNumber;
		double totalEarnings = 0;
		double wage; //for HourlyEmployee instances
		double hours;
		double grossSales; //for CommissionEmployee instances
		double commissionRate;
		double weeklySalary; // for SalariedEmployee instances
		double wagePerPiece; //for PieceWorker instances
		double quantity;
		
		Scanner input = new Scanner(System.in);	
		
		System.out.printf("Menu Options: %nEnter 1 for hourly employees%n"
				+ "2 for commission employees%n3 for salaried employees%n"
				+ "4 for piece worker employees" + " or [enter -1 to quit]: ");
		
		employeeType = Integer.parseInt(input.nextLine()); //parsing the integer to not skip the nextLine input following
		
		while (employeeType != -1 && employeeCounter < 10) {
			System.out.println("Enter the first name of the employee: ");
			firstName = input.nextLine();
			System.out.println("Enter the last name of the employee: ");
			lastName = input.nextLine();
			System.out.println("Enter the social security number of the employee: ");
			socialSecurityNumber = input.nextLine();
			try {
				
				switch (employeeType) {
				
					case 1: //Hourly Employee
						System.out.println("Enter wage: ");
						wage = Double.parseDouble(input.nextLine());
						System.out.println("Enter hours worked: ");
						hours = Double.parseDouble(input.nextLine());
						
						employees[employeeCounter] = new HourlyEmployee(firstName, lastName, socialSecurityNumber, wage, hours);
						hourlyEmployeeCounter++;
						break;
					
					case 2: //Commission Employee
						System.out.println("Enter gross sales: ");
						grossSales = Double.parseDouble(input.nextLine());
						System.out.println("Enter commission rate: ");
						commissionRate = Double.parseDouble(input.nextLine());
						
						employees[employeeCounter] = new CommissionEmployee(firstName, lastName, socialSecurityNumber, 
								grossSales, commissionRate);
						commissionEmployeeCounter++;
						break;
					
					case 3://Salaried Employee
						System.out.println("Enter weekly salary: ");
						weeklySalary = Double.parseDouble(input.nextLine());
						
						employees[employeeCounter] = new SalariedEmployee(firstName, lastName, socialSecurityNumber, 
								weeklySalary);
						salariedEmployeeCounter++;
						break;
					
					case 4://Piece Worker
						
						System.out.println("Enter wage per piece: ");
						wagePerPiece = Double.parseDouble(input.nextLine());
						System.out.println("Enter quantity completed: ");
						quantity = Double.parseDouble(input.nextLine());
						
						employees[employeeCounter] = new PieceWorker(firstName, lastName, socialSecurityNumber, 
								wagePerPiece, quantity);
						pieceWorkerCounter++;
						break;
					default:
						System.out.println("Error! Choose a type of employee from 1 to 4 [or -1 to quit]");
						break;
					
				}//end the switch
				employeeCounter++;
			
				System.out.printf("Menu Options:%nEnter 1 for hourly employees%n"
						+ "2 for commission employees%n3 for salaried employees%n"
						+ "4 for piece worker employees" + "or [enter -1 to quit]: ");
				
				employeeType = Integer.parseInt(input.nextLine()); //parsing the integer to not skip the nextLine input following
				
			}//end the try
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}//end the catch
		}//end the while
		for (Employee employee : employees) {
			if (employee != null) {
			
				if (employee instanceof HourlyEmployee) {	
					//am I an hourly employee? downcast it
					HourlyEmployee hourlyEmp = (HourlyEmployee) employee;
					totalEarnings += hourlyEmp.earnings();
				}//end if
				else if (employee instanceof CommissionEmployee) {
					//am I a commission employee? downcast it
					CommissionEmployee commissionEmp = (CommissionEmployee) employee;
					totalEarnings += commissionEmp.earnings();
				}//end else if
				else if(employee instanceof SalariedEmployee) {
					//am I a salaried employee? downcast it
					SalariedEmployee salariedEmp = (SalariedEmployee) employee;
					totalEarnings += salariedEmp.earnings();
				}//end else if
				else if(employee instanceof PieceWorker) {
					//am I a piece worker? downcast it
					PieceWorker pieceWork = (PieceWorker) employee;
					totalEarnings += pieceWork.earnings();
				}//end else if
				System.out.printf("%s%n", employee.toString());
				
			}//end if
		}//end for
		System.out.println("There are: ");
		System.out.printf("%d hourly employee(s).%n"
				+ "%d commission employee(s).%n"
				+ "%d salaried employee(s).%n"
				+ "%d piece worker employee(s).%n"
				+ "The total earnings paid out are $%,.2f.", 
				hourlyEmployeeCounter, commissionEmployeeCounter, salariedEmployeeCounter, 
				pieceWorkerCounter, totalEarnings );
		input.close();
	}//end main

}//end class
