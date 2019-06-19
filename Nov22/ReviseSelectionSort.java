import java.util.Scanner;

public class ReviseSelectionSort {
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println("Sorted numbers: ");
		
		selectionSort(array);
		for (int j = 0; j < 10; j++) {
			System.out.print(array[j] + " ");
		}
	}//
	
	public static void selectionSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			
			int currentMin = array[i];
			int currentMinIndex = i;
			
			for (int j = 0; j < i; j++) {
				if (currentMin < array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMinIndex;			
			}
		}
	}
}//
