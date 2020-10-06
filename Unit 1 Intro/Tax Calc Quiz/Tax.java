/*
 * Name: Jennifer Stegina
 * Date: 2/1/2019
 * Description: Quiz 1
 */

public class Tax {
	// Declarations
	private String name;
	private double income;

	// Tax Constructor
	public Tax(String name, double income) {
		setName(name);
		setIncome(income);
	}

	// set and get methods for name
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// set and get methods for income
	public void setIncome(double income) {
		if (income <= 0) {
			this.income = 0;
		} else {
			this.income = income;
		}
	}

	public double getIncome() {
		return income;
	}

	/*
	 * Return tax based on income: Tax Rate Income 10% $1-$9,525 12%
	 * $9,526-$38,700 22% $38,701-$82,500 24% > $82,500
	 */

	public double calcIncomeTax() {
		double incomeTax = 0;
		if (income <= 9525) {
			incomeTax = income * .1;
		} else if (income <= 38700) {
			incomeTax = (9525 * .1) + ((income - 9525) * .12);
		} else if (income <= 82500) {
			incomeTax = (9525 * .1) + (29175 * .12) + ((income - 38700) * .22);
		} else {
			incomeTax = (9525 * .1) + (29175 * .12) + (43800 * .22) + ((income - 82500) * .24);
		}

		return incomeTax;
	}

	// return a fixed 14.5% flat tax on income
	public double flatRateTax() {
		return income * .145;
	}
}
