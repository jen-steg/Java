/*
 * Name: Jennifer Stegina
 * Date: 15 February 2019
 * Description: Account Guided Practice
 */
public class CheckingAccount extends Account {
	private double fee;

	public CheckingAccount(double balance, double fee) {
		super(balance);
		setFee(fee);
	}

	public void setFee(double fee) {
		if (fee < 0.0) {
			throw new IllegalArgumentException("Fee must be greater that zero.");
		}
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	@Override
	public boolean credit(double amount) {
		boolean success;

		success = super.credit(amount);
		if (success) {
			super.debit(fee);// calling super class debit function to debit our fee
		}
		return success;
	}

	@Override
	public boolean debit(double amount) {
		boolean success;

		if (getBalance() < (fee + amount)) {
			System.out.println("You don't have that much to withdraw.");
			success = false;
		} else {
			success = super.debit(amount + fee);// will grab true from parent class
		}
		return success;
	}

	@Override
	public String toString() {
		return String.format("%s%s:$%.2f%n", super.toString(), "Fee", fee);
	}
}
