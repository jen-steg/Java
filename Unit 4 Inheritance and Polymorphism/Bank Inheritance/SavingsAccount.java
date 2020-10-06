/*
 * Name: Jennifer Stegina
 * Date: 15 February 2019
 * Description: Account Guided Practice
 */
public class SavingsAccount extends Account {

	private double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		super(balance); // step 1 call the parent constructor
		setInterestRate(interestRate);
	}

	public void setInterestRate(double interestRate) {
		if (interestRate < 0.0) {
			throw new IllegalArgumentException("Interest Rate must " + "be greater than zero.");
		}
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public double calculateInterest() {
		return getBalance() * interestRate;
	}

	@Override
	public String toString() {
		return String.format("%s%s:%.2f%%%n", // two percent signs in a row will
				super.toString(), // print actual percent symbol
				"Interest Rate", interestRate);
	}
}
