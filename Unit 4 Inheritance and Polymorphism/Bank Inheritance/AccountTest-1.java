import java.util.Scanner;

/*
 * Name: Jennifer Stegina
 * Date: 15 February 2019
 * Description: Account Guided Practice
 */
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// polymorphism->all can be set as accounts
		Account accounts[] = new Account[5];
		int accountCounter = 0;
		int accountType = 0;
		double fee, interestRate, balance;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 1 for checking, " + "2 for savings, 3 for general account [-1 to quit]");

		accountType = input.nextInt();

		while (accountType != -1 && accountCounter < 5) {// not quit and less than six accounts
			System.out.println("Enter balance ");
			balance = input.nextDouble();

			try {
				switch (accountType) {
				case 1: // Checking
					System.out.println("Enter fee ");
					fee = input.nextDouble();
					accounts[accountCounter] = new CheckingAccount(balance, fee);
					break;
				case 2: // Savings
					System.out.println("Enter interest rate ");
					interestRate = input.nextDouble();
					accounts[accountCounter] = new SavingsAccount(balance, interestRate);
					break;
				case 3: // general account
					accounts[accountCounter] = new Account(balance);
					break;
				}// end switch
				accountCounter++;
				if (accountCounter != 5) {
					System.out.println("Enter 1 for checking, " + "2 for savings, 3 for general account [-1 to quit]");
					accountType = input.nextInt();
				} // end if

			} // end try
			catch (IllegalArgumentException e) {// e is variable for exceptions
				System.out.println(e.getMessage());// print exception error message
			} // end catch
		} // end while
			// Loop through accounts and figure out which is which
		for (Account account : accounts) {// array _ variable
			if (account != null) {

				if (account instanceof SavingsAccount) {// in java check type via instanceof
					// Am I savings?
					// Downcast it
					SavingsAccount savingsAct = (SavingsAccount) account;
					double yearlyInterest = savingsAct.getInterestRate();

					savingsAct.setBalance(savingsAct.getBalance() + yearlyInterest);
					// or do
					// savingsAct.credit(yearlyInterest);
				} // end if
					// polymorphism allows for the correct one to be called
				System.out.printf("%s", account.toString());
			} // end if
		} // end for
		input.close();
	}// end main

}// end class
