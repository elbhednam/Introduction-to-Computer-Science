import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int l = input.nextInt();
		int[] array = new int[l];
		System.out.print("Enter " + l + " integers: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println("The smallest element is " + smallestElement(array) + " at index " + indexOfSmallestElement(array));
	}//
	
	public static int smallestElement(int[] array) {
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int indexOfSmallestElement(int[] array) {
		int minIndex = 0;
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}//
