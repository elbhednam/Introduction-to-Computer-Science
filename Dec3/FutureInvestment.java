import java.util.Scanner;

public class FutureInvestment {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: " );
		double investment = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double interest = input.nextDouble();
		interest = interest / 12;
		
		System.out.println("Years    Future Value");
		double investmentValue;
		for (int i = 1; i <= 30; i++) {
			investmentValue = FutureInvestmentValue(investment, interest, i);
			System.out.printf("%3d%17f\n", i, investmentValue);
		}
		
	}//
	
	public static double FutureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		double FutureInvestmentValue = investmentAmount * Math.pow((1 + (monthlyInterestRate / 100)), (years * 12));
		return FutureInvestmentValue;
	}
}//
