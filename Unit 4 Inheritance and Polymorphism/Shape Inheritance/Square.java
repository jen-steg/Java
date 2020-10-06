/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 4) Circle, Square, and Triangle should inherit from TwoDimensionalShape 
 * and override the getArea method and toString() methods.
 */
public class Square extends TwoDimensionalShape {
	
	private double side;

	public Square(double side) {
		// TODO Auto-generated constructor stub
		if (side < 0.0) {//validate
			throw new IllegalArgumentException(
		            "Side must be greater than 0.0");
		}//end if
		else {
			this.setSide(side);
		}//end else
	}//end constructor
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(side, 2);//formula area = side^2
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (side < 0.0) {//validate
			throw new IllegalArgumentException(
		            "Radius must be greater than 0.0");
		}//end if
		else {
			this.side = side;
		}//end else
	}
	// return String representation of Square Object
	@Override
	public String toString() {
		return String.format("%s %s %n%s %.2f", "Square", 
				super.toString(), "Sides are", getSide());
	}

}//end class Square
