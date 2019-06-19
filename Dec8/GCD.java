import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i1 = input.nextInt();
		System.out.print("Enter another integer: ");
		int i2 = input.nextInt();
		
		int gcd = 1;
		int k = 2;
		while (k <= i1 && k <= i2) {
			if (i1 % k == 0 && i2 % k == 0) {
				gcd = k;
				k++;
			}
		}
		System.out.println("The greatest common divisor for "+ i1 + " and " + i2 + " is " + gcd);
	}
}
