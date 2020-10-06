/*
 * Name: Jennifer Stegina
 * Date: 5 February 2019
 * Description: Sales Problem
 */

import java.util.Scanner;

public class Sales {
	
	static double [] sales = {2.98, 4.50, 9.98, 4.49, 6.87};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int productNumber;   
		int quantitySold;  
		double totalSales = 0;  
    
		System.out.printf("%s%14s%n", "Product Number", "Price");
    
		//print out array with product number/value headers in table format
		for (int i = 0; i < sales.length; i++) { //loop to print
			System.out.printf("%5d%23.2f%n", i + 1, sales[i]);
    	
		}
    Scanner input = new Scanner (System.in);
    System.out.print("Enter a product number between 1-5 (or 0 to quit): ");  
    productNumber=input.nextInt();
    
    while (productNumber != 0) { //if not sentinel value for quit   	
    	
    		switch (productNumber) {  

        		case 1:
        			System.out.print("Enter number of products sold: ");  
        			quantitySold = input.nextInt();
        			while (quantitySold <= 0) {
        				System.out.print("Error. Number of products sold must be greater than zero.\n");
        				System.out.print("Enter number of products sold: ");  
        		    	quantitySold = input.nextInt();
        			}
        			totalSales+=(2.98*(double)quantitySold);
        			break;  

            	case 2: 
            		System.out.print("Enter number of products sold: ");  
            		quantitySold = input.nextInt();
            		while (quantitySold <= 0) {
            			System.out.print("Error. Number of products sold must be greater than zero.\n");
        				System.out.print("Enter number of products sold: ");  
        		    	quantitySold = input.nextInt();
        			}
            		totalSales+=(4.50*(double)quantitySold);
            		break;  

            	case 3: 
            		System.out.print("Enter number of products sold: ");  
            		quantitySold = input.nextInt();
            		while (quantitySold <= 0) {
            			System.out.print("Error. Number of products sold must be greater than zero.\n");
        				System.out.print("Enter number of products sold: ");  
        		    	quantitySold = input.nextInt();
        			}
            		totalSales+=(9.98*(double)quantitySold);
            		break;  

            	case 4:
            		System.out.print("Enter number of products sold: ");  
            		quantitySold = input.nextInt();
            		while (quantitySold <= 0) {
            			System.out.print("Error. Number of products sold must be greater than zero.\n");
        				System.out.print("Enter number of products sold: ");  
        		    	quantitySold = input.nextInt();
        			}
            		totalSales+=(4.49*(double)quantitySold); 
            		break;  

            	case 5:
            		System.out.print("Enter number of products sold: ");  
            		quantitySold = input.nextInt();
            		while (quantitySold <= 0) {
            			System.out.print("Error. Number of products sold must be greater than zero.\n");
        				System.out.print("Enter number of products sold: ");  
        		    	quantitySold = input.nextInt();
        			}
            		totalSales+=(6.87*(double)quantitySold);
            		break;  

                	default: //catch all the mistaken entries
                		System.out.print("Error. Product number must be between 1 - 5.\n");	
                		
    		}
    		System.out.print("Enter a product number between 1-5 (or 0 to quit): ");  
    		productNumber=input.nextInt();

    }    
               
    input.close();
    
    System.out.printf("The total retail value of all products sold is $%.2f", totalSales);
    
	}
}

	

	