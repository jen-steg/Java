/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 4) Circle, Square, and Triangle should inherit from TwoDimensionalShape 
 * and override the getArea method and toString() methods.
 */
public class Circle extends TwoDimensionalShape {

	private double radius;
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		if (radius < 0.0) {//validate
			throw new IllegalArgumentException(
		            "Radius must be greater than 0.0");
		}//end if
		else {
			this.setRadius(radius);
		}//end else
	}//end constructor

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0.0) {//validate
			throw new IllegalArgumentException(
		            "Radius must be greater than 0.0");
		}//end if
		else {
			this.radius = radius;
		}//end else
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);//formula area = PI*r^2
	}
	
	 // return String representation of Circle Object
	@Override
	public String toString() {
		return String.format("%s %s %n%s %,.2f", "Circle", 
				super.toString(), "Radius is", getRadius());
	}

}//end class Circle
