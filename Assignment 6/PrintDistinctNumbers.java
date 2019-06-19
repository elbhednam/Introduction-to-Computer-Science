/* Amanda Bakalarczyk
 * COSC 1406
 * Exercise 7.5
 */
import java.util.Scanner;
public class PrintDistinctNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		int[] numbers = new int [10];
		int count = 0;
	
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		
		}

		boolean distinct = true;
		
		for (int j = 0; j < numbers.length; j++) {
			for (int k = 0; k < j; k++) {
				if (numbers[j] == numbers[k]) {
					distinct = false;
				}
			}
			if (distinct) {
				count++;
				System.out.print(numbers[j] + " ");
			}
			if (numbers.length == 10) {
				distinct = true;
			}
		}
		System.out.println("The number of distinct numbers are " + count);
	}//
}//