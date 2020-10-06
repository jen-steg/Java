
/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 1) Shape, TwoDimensionalShape, 
 * 		ThreeDimensionalShape are all abstract classes.
 * 3) ThreeDimensionalShape has an abstract methods called double getArea() and double getVolume()
 */
public abstract class ThreeDimensionalShape extends Shape {

	public ThreeDimensionalShape() {
		// TODO Auto-generated constructor stub
	}
	// abstract method must be overridden by concrete subclasses
	@Override
	public abstract double getArea();//no implementation here
	
	// abstract method must be overridden by concrete subclasses
	public abstract double getVolume();//no implementation here
	
	@Override
	public String toString() {
		return String.format("%s %,.2f %n%s %,.2f", "Area is", 
				getArea(), "Volume is", getVolume());
	}
}//end abstract class ThreeDimensionalSShape
