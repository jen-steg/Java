/*Name: Jennifer Stegina
 * Date: 25 January 2019
 * Description: Invoice
 */

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the part number: ");
		String partNumber = input.nextLine();
		
		System.out.print("Enter the part description: ");
		String partDescription = input.nextLine();
		
		System.out.print("Enter the price per item: ");
		double pricePerItem = input.nextDouble();
		
		System.out.print("Enter the quantity: ");
		int quantity = input.nextInt();
		
		Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
		System.out.printf("The total for invoice 1 is %.2f", invoice.getInvoiceAmount());
		
		input.close();
		  
	}
	
}
