/*
 * Name: Jennifer Stegina
 * Date: 10 February 2019
 * Description: Dice Rolling Problem
 */

// Fig. 7.7: RollDie.java
// Die-rolling program using arrays instead of switch.
import java.security.SecureRandom;

public class RollDie {
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[13]; // array of frequency counters
		int largest = 0;
		int smallest = 0;
		
		
		// roll dice 36,000 times; use dice value as frequency index
		for (int roll = 2; roll <= 36000000; roll++) {
			int die1 = randomNumbers.nextInt(6) + 1;//make separate variables for each die
			int die2 = randomNumbers.nextInt(6) + 1;
			++frequency[die1 + die2];//frequency of each roll determined by summing up both dice
		}	

		System.out.printf("%s%10s%n", "Face", "Frequency");

		// output each array element's value
		for (int face = 2; face < frequency.length; face++) {
			System.out.printf("%4d%10d%n", face, frequency[face]);

			// Find max
			if (face == 2) {
				largest = frequency[face];
			} else {
				if (frequency[face] > largest) {
					largest = frequency[face];
				}
			}
			// Find min
			if (face == 2) {
				smallest = frequency[face];
			} else {
				if (frequency[face] < smallest) {
					smallest = frequency[face];
				}
			}

		}
		for (int face = 2; face < frequency.length; face++) {
			if (frequency[face] == largest) {
				System.out.printf("%d was rolled the most times with %d times.\n", face, largest);
			}
		}
		for (int face = 2; face < frequency.length; face++) {
			if (frequency[face] == smallest) {
				System.out.printf("%d was rolled the least times with %d times.", face, smallest);
			}
		}
	}
	
} 