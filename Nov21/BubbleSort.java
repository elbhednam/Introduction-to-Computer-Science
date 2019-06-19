
public class BubbleSort {
	public static void main(String[] args) {
		
		int[] array = new int[30];
		int count = 0;
		
		System.out.println("Before sorting: ");
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
			count ++;
			if (count % 10 == 0) {
				System.out.println(" ");
			}
			else {
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("After sorting: ");
		System.out.println();
		for (int j = 0; j < array.length; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] > array[k]) {
					int temp = array[k];
					array[k] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int l = 0; l < array.length; l++) {
			count++;
			if (count % 10 == 0) {
				System.out.println(" ");
			}
			else {
				System.out.print(array[l] + " ");
			}
		}
	}
}
