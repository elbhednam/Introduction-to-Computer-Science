import java.util.Scanner;

public class AverageArray {
	public static void main(String[] args) {
		
		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten double values: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		input.close();
		
		System.out.println("The average is " + average(array));
		
	}//
	
	public static int average(int[] array) {
		
		int average = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum / array.length;
		return average;
	}
	
	public static double average(double[] array) {
		
		double average = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum / array.length;
		return average;
	}
}//
