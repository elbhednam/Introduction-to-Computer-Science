import java.util.Scanner;

public class MyTriangle {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (isValid(side1, side2, side3)) {
			System.out.println("The area of the triangle is " + area(side1, side2, side3));
		}
		else
			System.out.println("the input is not valid.");
		
	}//
	
	public static boolean isValid(double side1, double side2, double side3) {
		
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
			return false;
		}
		return true;
	}
	
	public static double area(double side1, double side2, double side3) {
		
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
}//
