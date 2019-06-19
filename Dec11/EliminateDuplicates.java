import java.util.Scanner;

public class EliminateDuplicates {
	public static void main(String[] args) {
		
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int[] newArray = eliminateDuplicates(array);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println();
		
	}//
	
	public static int[] eliminateDuplicates(int[] list) {
		int count = 0;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] != list[j]) {
					count++;
				}
			}
		}
		int[] newList = new int[count];
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] != list[j]) {
					newList[i] = list[i];
				}
			}
		}
		return newList;
	}
}//
