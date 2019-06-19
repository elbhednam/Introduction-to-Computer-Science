import java.util.Scanner;

public class Combinations {
	public static void main(String[] args) {
		
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten integers: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				System.out.print( "(" + array[i] + "," + array[j] + ") ");
			}
			System.out.println();
		}
	}//
}//
