/*
 * Name: Jennifer Stegina
 * Date: 13 February 2019
 * Description: Dupes problem - user enters numbers, array size of five, duplicates validated, numbers only from 10-100, print out as you get them
 */

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // declare variables
        int[] numbers = new int[5];
        int inputNumber;
        int rangeErrorCounter = 0;
        int dupeCounter = 0;
        int counter = 0;


        // While the last entry in the array is zero, ie default value
        while (numbers[4] == 0) {
            // variable to check dupes
            boolean dupe = false;

            System.out.print("Please enter a number [10 to 100]: ");
            inputNumber = input.nextInt();

            // validation and out of range counter increment
            while (inputNumber < 10 || inputNumber > 100) {
                System.out.print("Error! Number must be between 10 and 100.");
                rangeErrorCounter++;
                System.out.printf("%nPlease enter a number [10 to 100]: ");
                inputNumber = input.nextInt();
            } 
            // Loop to check for dupes
            for (int number : numbers) {
                if (number == inputNumber) {
                    dupe = true;
                }
            }
            if (dupe) {
                System.out.printf("Error! This has already been entered.%n");
                dupeCounter++;
            } else {
                numbers[counter] = inputNumber;
                counter++;
            }

            // Print everything not 0
            for (int number : numbers) {
                if (number != 0) {
                    System.out.printf("%d ", number);
                }
            } 
            System.out.println("");
        } 

        input.close(); // Close scanner

        System.out.printf("%nYou entered %d duplicate number(s).%n", dupeCounter);
        System.out.printf("%d Number(s) entered outside of the range of 10 to 100.", rangeErrorCounter);
    } 
} 