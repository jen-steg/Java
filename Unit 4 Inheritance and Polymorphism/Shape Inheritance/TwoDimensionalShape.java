/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 1) Shape, TwoDimensionalShape, 
 * 		ThreeDimensionalShape are all abstract classes.
 * 2) TwoDimensionalShape has an abstract method called double getArea()
 */
public abstract class TwoDimensionalShape extends Shape {

	public TwoDimensionalShape() {
		// TODO Auto-generated constructor stub
	}
	// abstract method must be overridden by concrete subclasses
	@Override
	public abstract double getArea();//no implementation here
	
	@Override
	public String toString() {
		return String.format("Area is %,.2f", getArea());
	}
}//end abstract class TwoDimensionalShape
