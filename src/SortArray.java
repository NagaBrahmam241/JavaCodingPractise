
public class SortArray {
	

	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 7};

	        System.out.println("Original array:");
	        printArray(arr);

	        bubbleSort(arr);

	        System.out.println("\nSorted array:");
	        printArray(arr);
	    }

	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
}
