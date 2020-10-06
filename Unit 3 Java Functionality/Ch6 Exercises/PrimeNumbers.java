/*
 * Name: Jennifer Stegina
 * Date: 11 February 2019
 * Description: Prime Number Program - calculate all prime numbers between 1 and 10000
 * print all prime numbers and sum up all the prime numbers
*/
public class PrimeNumbers {


	private static boolean isPrime(int value) //function that calculates if a number is prime or not
    {
        for (int i = 2; i <= Math.sqrt(value); i++)//loop through 
        {
            if (value%i != 0) {
                continue;//skip it
            }
            return false;//not prime
        }
        return true;//yes prime
    }
    
	public static void main(String[] args) {//main
		// TODO Auto-generated method stub

	    int primeCounter = 0;//count
	    int sum = 0;//sum accumulator
	    int number;
	    
	    for ( number = 2; number < 10000; number++ ) {//loop through   
	    	
	    	 if ( isPrime(number)) {//call function - if yes prime
	    		 primeCounter++;//increase count of primes
	             sum += number;//increase sum
	             System.out.printf("%,d ", number);//print the prime number
	             if (primeCounter % 10 == 0) {//when counter is divisible by 10
	            	 System.out.println();//skip to a new line
	             }
	             if (primeCounter == 1229) {//when counter gets to max
	            	 System.out.println();//skip two lines for easier readability
	            	 System.out.println();
	             }
	    	 }
	    	 else if (isPrime(number)==true){
	   
	    }
}
    System.out.printf("%,d is the total number "
    		+ "of prime numbers between 1 and 10,000.%n", primeCounter);//total prime number count
    System.out.printf("%,d is the sum of all "
    		+ "the prime numbers between 1 and 10,000.", sum);//total prime number sum
	}


   

}