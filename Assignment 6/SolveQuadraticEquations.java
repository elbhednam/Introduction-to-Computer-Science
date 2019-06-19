/* Amanda Bakalarczyk
 * COSC 1406
 * Exercise 7.25
 */
import java.util.Scanner;

public class SolveQuadraticEquations {
	public static void main(String[] args) {
		
		double[] eqn = new double[3];
		double[] roots = new double[2];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter values for a, b, and c: ");
		
		for (int i = 0; i < eqn.length; i++) {
			eqn[i] = input.nextDouble();
		}
		
		input.close();
		
		switch (solveQuadratic(eqn, roots)) {
		case 0: System.out.println("The equation has two real roots at x = " + roots[0] + " and x = " + roots[1]);
		break;
		case 1: System.out.println("The equation has only imaginary roots");
		break;
		case 2: System.out.println("The equation has one root at x = " + roots[0]);
		break;
		}
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		double dis = Math.pow(b, 2) - (4 * a * c);
		
		roots[0] = (-b + Math.sqrt(dis)) / (2 * a);
		roots[1] = (-b - Math.sqrt(dis)) / (2 * a);
		
		if (dis > 0) {
			return 0;
		}
		else if (dis < 0) {
			return 1;
		}
		else {
			return 2;
		}
		
	}
}
