/*
 * Name: Jennifer Stegina
 * Date: 8 February 2019
 * Description: 6.24 Perfect Number problem (between 2-1000)
 */
public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop to run through all numbers

		for (int i = 2; i <= 1000; i++) {

			// string result to have all factors show
			String result = isPerfect(i);

			if (result != null) {
				System.out.printf("%d is perfect.%n", i);
				System.out.printf("Factors are %s%n", result);
			}
		}
	}

	public static String isPerfect(int value) {
		int sum = 1;// sum starts at one bc the loop starts at 2
		String factors = "1 "; // one is a factor of everything - so start there

		for (int j = 2; j < value; j++) {// value is from i as it counts above it changes as value
			if (value % j == 0) {
				sum += j;// accumulate
				factors = factors + j + " ";// adds factors to the string
			}

		}
		if (sum == value) {// if sum equals values then yes perfect number
			return factors;// so return the string of factors
		} else {
			return null;
		}
	}

}