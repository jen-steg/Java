/*
 * Name: Jennifer Stegina
 * Date: 15 February 2019
 * Description: Account Guided Practice
 */
public class Account {
	private double balance;

	public Account(double balance) { // constructor
		setBalance(balance);
	}

	public void setBalance(double balance) {

		if (balance < 0.0) {// validation
			throw new IllegalArgumentException(// exception class
					"Balance must be greater than 0.");
		}
		this.balance = balance;
	}

	public boolean credit(double amount) {
		boolean isValid = true;
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Amount must be greater than zero.");
			isValid = false;
		}
		return isValid;
	}

	public boolean debit(double amount) {

		boolean success = true;

		if (amount > balance) {
			System.out.println("You don't have that much to debit.");
			success = false;
		} else if (amount < 0) {
			System.out.println("Amount must be greater than zero");
			success = false;
		} else {
			balance -= amount;
		}
		return success;// only need one return
	}

	public double getBalance() {
		return balance;
	}

	@Override // not necessary, but get in the habit
	public String toString() {
		return String.format("%s: $%,.2f%n", "Balance", balance);
	}
}
