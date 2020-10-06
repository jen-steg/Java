import java.util.Scanner;

/*
 * Name: Jennifer Stegina
 * Date: 19 February 2019
 * Description: Shape problem
 * 1) Shape, TwoDimensionalShape, ThreeDimensionalShape are all abstract classes.
 * 2) TwoDimensionalShape has an abstract method called double getArea()
 * 3) ThreeDimensionalShape has an abstract methods called 
 * 		double getArea() and double getVolume()
 * 4) Circle, Square, and Triangle should inherit from TwoDimensionalShape 
 * 		and override the getArea method and toString() methods
 * 5) Sphere, Cube, and Tetrahedron should inherit from ThreeDimensionalShape  
 * 		and override the getArea, getVolume, and toString() methods.
 * 6) In ShapeTest.java, create an Array of up to 20 Shape objects.  Ask the user 
 * 		what type of shape they are creating( Circle, Square, Triangle, Sphere, Cube, Tetrahredon) 
 * 		and get the appropriate information.  Instantiate the class and store in your array.  
 * 7) Once the user is done entering shapes, loop through your array, print out the toString()
 * 		 method for all the objects and if it's a 2D shape print the area. 
 * 		If it's a 3D shape, print the area and volume
 */
public class ShapeTest {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Shape shapes[] = new Shape[20];

		int shapeCounter = 0;
		int twoDShapeCounter = 0;
		int threeDShapeCounter = 0;
		int shapeType;
		double side, radius;
		double base, height;

		Scanner input = new Scanner(System.in);

		System.out.println("Menu option:");
		System.out.printf("1. Square%n2. Circle%n3. Triangle%n4. Cube%n5. Sphere%n6. Tetrahedron [or -1 to quit]:");
		shapeType = input.nextInt();
		
		while (shapeType <= -2 || shapeType > 6 || shapeType == 0) {//forced validation
			System.out.println("Error! Enter 1 to 6 [or -1 to quit].");	
			System.out.println("Menu option:");
			System.out.printf("1. Square%n2. Circle%n3. Triangle%n4. Cube%n5. Sphere%n6. Tetrahedron [or -1 to quit]:");
			shapeType = input.nextInt();
		}//end validation while loop
			
			while (shapeType != -1 && shapeCounter < 20) {
				
				try {
					
					switch(shapeType) {
					
					case 1://Square 
						System.out.println("Enter one of the sides: ");
						side = input.nextDouble();
						
						shapes[shapeCounter] = new Square(side);
						twoDShapeCounter++;
						break;
					
					case 2: //Circle
						System.out.println("Enter the radius: ");
						radius = input.nextDouble();
						
						shapes[shapeCounter] = new Circle(radius);
						twoDShapeCounter++;
						break;
					case 3: //Triangle
						System.out.println("Enter the base of the triangle: ");
						base = input.nextDouble();
						System.out.println("Enter the height of the triangle: ");
						height = input.nextDouble();
						
						shapes[shapeCounter] = new Triangle(base, height);
						twoDShapeCounter++;
						break;
						
					case 4: //Cube
						System.out.println("Enter one of the sides: ");
						side = input.nextDouble();
							
						shapes[shapeCounter] = new Cube(side);
						threeDShapeCounter++;
						break;
						
					case 5: //Sphere
						System.out.println("Enter the radius: ");
						radius = input.nextDouble();
							
						shapes[shapeCounter] = new Sphere(radius);
						threeDShapeCounter++;
						break;
							
					case 6: //Tetrahedron
						System.out.println("Enter one of the sides: ");
						side = input.nextDouble();
							
						shapes[shapeCounter] = new Tetrahedron(side);
						threeDShapeCounter++;
						break;
					
					default:
						System.out.println("Error! Enter 1 to 6 [or -1 to quit].");	
						break;
							
					}//end switch
					shapeCounter++;
				}//end try
				catch (IllegalArgumentException e) { //catch all exceptions here
					System.out.println(e.getMessage()); // print error message(s)
				}//end catch
				System.out.println("Menu option:");
				System.out.printf("1. Square%n2. Circle%n3. Triangle%n4. Cube%n5. Sphere%n6. Tetrahedron [or -1 to quit]:");
				shapeType = input.nextInt();
				
			}//end while
			for (Shape shape : shapes) {//loop through array
				if (shapes != null) {//if not empty - print
					if (shape instanceof TwoDimensionalShape) {
						//am I a 2d shape? downcast it
						Shape twoDShape = (TwoDimensionalShape) shape;
						System.out.printf("%s%n %s%n", "Two Dimensional Shape: ", twoDShape.toString());
					}//end if
					else if(shape instanceof ThreeDimensionalShape) {
						//am I a 3d shape? downcast it
						Shape threeDShape = (ThreeDimensionalShape) shape;
						System.out.printf("%s%n %s%n", "Three Dimensional Shape: ", threeDShape.toString());
					}//end elif
				}//end if
			}//end for
			System.out.printf("%d shape(s) entered.%n"
					+ "%d two dimensional shape(s) entered.%n"
					+ "%d three dimensional shape(s) entered.%n", 
					shapeCounter, twoDShapeCounter, threeDShapeCounter);
		input.close();//close scanner out to prevent memory leaks
	} // end main
} // end test