import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		
		int[] myList = new int[10];
		int count = 0;
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int)(Math.random() * 100);
		}
		
		selectionSort(myList);
		
		for (int j = 0; j < myList.length; j++) {
			count++;
			if (count % 5 == 0) {
				System.out.println(" ");
			}
			else {
				System.out.print(myList[j] + " ");
			}
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter a number to search for: ");
		int search = input.nextInt();
		System.out.println();
		System.out.println("The number is located at index " + binarySearch(myList, search));
		
	}//
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) 
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else 
				low = mid + 1;
		}
		return -low - 1;
	}
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}//
