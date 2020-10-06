/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 1) Shape, TwoDimensionalShape, 
 * 		ThreeDimensionalShape are all abstract classes.
 * 3) ThreeDimensionalShape has an abstract methods called double getArea() and double getVolume()
 */
public class Tetrahedron extends ThreeDimensionalShape {

	private double side;
	
	public Tetrahedron(double side) {
		// TODO Auto-generated constructor stub
		if (side < 0.0 ) {//validate
			throw new IllegalArgumentException(
		            "Side must be greater than 0.0");
		}//end if
		else {
			this.setSide(side);
		}//end else
	}// end constructor

	public void setSide(double side) {
		if (side < 0.0 ) {//validate
			throw new IllegalArgumentException(
		            "Side must be greater than 0.0");
		}//end if
		else {
			this.side = side;
		}//end else
	}
	
	public double getSide() {
		return side;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(3 * Math.pow(side, 2));//formula surface area = SQRT(3 * side^2)
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return Math.pow(side, 3) / (6 * Math.sqrt(2));//formula volume = side^3 / 6 * (SQRT 2)
	}
	@Override
	public String toString() {
		return String.format("%s %s %n%s %,.2f", "Tetrahedron", 
				super.toString(), "Side is", getSide());
	}

	
}//end class Tetrahedron
