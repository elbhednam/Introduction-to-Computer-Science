import java.util.Scanner;

public class RydbergEquation {
	public static void main(String[] args) {
		
		final int RC = 109678;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer for n1: ");
		int n1 = input.nextInt();
		System.out.print("Enter a positive integer for n2: ");
		int n2 = input.nextInt();
		
		double invwave = RC * ((1 / Math.pow(n1, 2)) - (1 / Math.pow(n2, 2)));
		double wavelength = 1 / invwave;
		
		System.out.println("The wavelength of the light emitted is " + convertInverseCm(wavelength) + " nm.");
		
		if (wavelength >= 400 && wavelength <= 650) {
			System.out.println("The light is within the visible spectrum");
		}
		else
			System.out.println("The light is not within the visible spectrum.");
	}//
	
	public static double convertInverseCm(double cm) {
		cm /= 100;
		double nm = cm / (1 * Math.pow(10, -9));
		return nm;
	}
}//
