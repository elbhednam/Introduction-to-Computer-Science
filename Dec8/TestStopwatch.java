public class TestStopwatch {
	public static void main(String[] args) {
		
		Stopwatch testsort = new Stopwatch();
		
		int[] array = new int[100000];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		
		System.out.println("Selection sort...");
        testsort.start();
        selectionSort(array);
        testsort.stop();
        System.out.println();
        System.out.println("Time elapsed: " + testsort.getElapsedTime() + " milliseconds.");
        
        System.out.println();
        
        System.out.println("Bubble sort...");
        testsort.start();
        bubbleSort(array);
        testsort.stop();
        System.out.println();
        System.out.println("Time elapsed: " + testsort.getElapsedTime() + " milliseconds.");

	}//
	
	public static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}
	
	public static void bubbleSort(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
}//
