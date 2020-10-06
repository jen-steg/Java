/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 1) Shape, TwoDimensionalShape, 
 * 		ThreeDimensionalShape are all abstract classes.
 * 3) ThreeDimensionalShape has an abstract methods called double getArea() and double getVolume()
 */
public class Sphere extends ThreeDimensionalShape {
	
	private double radius;
	
	public Sphere(double radius) {
		// TODO Auto-generated constructor stub
		if (radius < 0.0 ) {//validate
			throw new IllegalArgumentException(
		            "Radius must be greater than 0.0");
		}//end if
		else {
			this.setRadius(radius);
		}//end else
	}// end constructor

	public void setRadius(double radius) {
		if (radius < 0.0 ) {//validate
			throw new IllegalArgumentException(
		            "Radius must be greater than 0.0");
		}//end if
		else {
			this.radius = radius;
		}//end else
	}

	public double getRadius() {
		return radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((4 * Math.PI) * Math.pow(radius, 2));// formula surface area = 4*PI*r^2
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (4 * Math.PI * Math.pow(radius, 3))/3;//formula volume = 4/3 * PI * r^3
	}
	@Override
	public String toString() {
		return String.format("%s %s %n%s %,.2f", "Sphere", 
				super.toString(), "Radius is", getRadius());
	}
}//end class Sphere
