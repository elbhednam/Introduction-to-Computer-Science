import java.util.Scanner;
public class TestQuadraticEquation {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter values for a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation abc = new QuadraticEquation(a, b, c);
		double discriminant = abc.getDiscriminant(a, b, c);
		
		if (discriminant == 0) {
			System.out.println("The equation has one real root at x = " + abc.getRoot1());
		}
		
		if (discriminant > 0) {
			System.out.println("The equation has two real roots at x = " + abc.getRoot1() + " and x = " + abc.getRoot2());
		}
		
		if (discriminant < 0) {
			System.out.println("The equation has no real roots");
		}
		
	}
}
