import java.util.Scanner;

public class MeanAndStandardDeviation {
	public static void main(String[] args) {
		
		double[] array = new double[10];
		double sum = 0;
		double squareSum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
			sum += array[i];
			squareSum += Math.pow(array[i], 2);
		}
		
		input.close();
		
		double stanDev = Math.sqrt(((squareSum - Math.pow(sum, 2) / 10))/9);
		double mean = sum / array.length;
		
		 System.out.println("The mean is " + mean);
		 System.out.println("The standard deviation is " + stanDev);
	}
}
