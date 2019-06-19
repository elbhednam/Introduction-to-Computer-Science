/* Amanda Bakalarczyk
 * COSC 1406
 * Ex. 7.15
 */
import java.util.Scanner;

public class EliminateDuplicates {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		int[] numbers = new int [10];
		
		for (int i = 0; i < numbers.length; i++) { // initialize array with input values
			numbers[i] = input.nextInt();
		}	
		int[] newArray = eliminateDuplicates(numbers); // create a new array from the first one by calling a method
		System.out.println("The distinct numbers are: ");
		for (int j = 0; j < newArray.length; j++) { // display the new array
			System.out.print(newArray[j] + " ");
		}
	}//
	/** method that identifies duplicates and then creates a new array without the duplicates 
	 * or at least that's what it was supposed to do.
	 */
	public static int[] eliminateDuplicates(int[] list) {
		int count = 0;
		for (int j = 0; j < list.length; j++) {
			for (int k = 0; k < j; k++) {
				if (list[j] != list[k]) {	
					count++;
				}
			}
		}
		
		  int[] list2 = new int[count]; 
	        for (int i = 0; i < list.length; i++) {
	        	for (int h = 0; h < i; h++) {
	        		if (list[i] != list[h]) {
	        			list2[i] = list[i];
	        		}
	        	}
	        }
	        
	        return list2;
	}
}//
