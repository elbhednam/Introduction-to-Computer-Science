import java.util.Scanner;

public class PercentComposition {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double c = Math.random() * 0.7 + 0.1;
		double h = Math.random() * 0.7 + 0.1;
		double o = Math.random() * 0.7 + 0.1;
	
		System.out.println("A sample of an organic compound was tested and found to have " + c + " g of C, " + h + " g of H, and " + o + " g of O.");
		System.out.println("The percent composition of  C is " + percentComp(c, h, o) + "%");
		System.out.println("The percent composition of H is " + percentComp(h, c, o) + "%");
		System.out.println("The percent composition of O is " + percentComp(o, h, c) + "%");
	}//
	
	public static double total(double a, double b, double c) {
		double total = a + b + c;
		return total;
	}
	
	public static double percentComp(double a, double b, double c) {
		double pc = a / total(a, b, c) * 100;
		return pc;
	}
}//
