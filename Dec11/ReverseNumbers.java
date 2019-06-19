import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int l = input.nextInt();
		int[] array = new int[l];
		System.out.print("Enter " + l + " integers: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int[] array2 = reverseArray(array);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
	}//
	
	public static int[] reverseArray(int[] list) {
		int[] newList = new int[list.length];
		
		for (int i = 0, j = newList.length - 1; i < list.length; i++, j--) {
			newList[j] = list[i];
		}
		return newList;
	}
}//
