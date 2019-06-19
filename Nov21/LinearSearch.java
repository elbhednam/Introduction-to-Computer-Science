import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] myList = new int[10];
		int count = 0;
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int)(Math.random() * 100);
		}
		
		for (int j = 0; j < myList.length; j++) {
			count++;
			if (count % 5 == 0) {
				System.out.println(" ");
			}
			else
			System.out.print(myList[j] + " ");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("check for a number in the array: ");
		int check = input.nextInt();
		
		System.out.println(linearSearch(myList, check));
	}//
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
}//
