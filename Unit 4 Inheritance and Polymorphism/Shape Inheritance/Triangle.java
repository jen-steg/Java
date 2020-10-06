/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 4) Circle, Square, and Triangle should inherit from TwoDimensionalShape 
 * and override the getArea method and toString() methods.
 */
public class Triangle extends TwoDimensionalShape {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		// TODO Auto-generated constructor stub
		if (base < 0.0 || height < 0.0) {//validate
			throw new IllegalArgumentException(
		            "Sides must be greater than 0.0");
		}//end if
		else {
			this.setBase(base);
			this.setHeight(height);
		}//end else
	}

	private void setBase(double base) {
		// TODO Auto-generated method stub
		if (base < 0.0 ) {//validate
			throw new IllegalArgumentException(
		            "Base must be greater than 0.0");
		}//end if
		else {
			this.base = base;
		}
	}
	public double getBase() {
		return base;
	}
	private void setHeight(double height) {
		// TODO Auto-generated method stub
		if (height < 0.0 ) {//validate
			throw new IllegalArgumentException(
		            "Height must be greater than 0.0");
		}//end if
		else {
			this.height = height;
		}
	}
	public double getHeight() {
		return height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return .5 * getBase() * getHeight(); //formula for area of a triangle
	}
	// return String representation of Square Object
	@Override
	public String toString() {
		return String.format("%s %s %n%s %,.2f, %n%s %,.2f", "Triangle", 
				super.toString(), "Base is", getBase(), "Height is", getHeight());
	}
}//end class Triangle
