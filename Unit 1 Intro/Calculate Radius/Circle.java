import java.util.Scanner;

/*Name: Jennifer Stegina
* Date: 25 January 2019
* Description: Radius Program
*/

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, area, circumference, diameter;
		
		Scanner input = new Scanner( System.in);
		
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		
		if( radius <= 0) {
			System.out.println("Error! Radius must be greater than 0");
		}
		else {
			diameter = 2 * radius;
			circumference = 2 * radius * Math.PI;
			area = Math.PI * radius * Math.pow( radius, 2);
			
			System.out.printf("Diameter is %.2f%n", diameter);
			System.out.printf("Circumference is %.2f%n", circumference);
			System.out.printf("Area is %.2f%n", area);
		}
		input.close();
	}

}
