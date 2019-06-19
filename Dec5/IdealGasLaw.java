import java.util.Scanner;

public class IdealGasLaw {
	public static void main(String[] args) {
		
		final double R = 0.082057;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Celcius: ");
		double t = input.nextDouble();
		System.out.print("Enter the pressure in torr: ");
		double p = input.nextDouble();
		System.out.print("Enter the moles of gas: ");
		double n = input.nextDouble();
		
		double v = (n * R * celciusToKelvin(t)) / torrToAtmospheres(p);
		
		System.out.println("The volume of the container is " + v);
	}//
	
	public static double celciusToKelvin(double celcius) {
		celcius += 273.15;
		return celcius;
	}
	
	public static double torrToAtmospheres(double torr) {
		torr /= 760;
		return torr;
	}
}//
