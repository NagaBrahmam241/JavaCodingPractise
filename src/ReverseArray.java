
public class ReverseArray {
	public static void reverseArray(int n,int arr[]){
        int start =0;
        int end = arr.length - 1;

        while(start<end){
            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }
    }
	
	public static void main(String[] args) {
		int n = 4;
		int[] arr = {6,20,4,47};
		reverseArray(n,arr);
		for(int val:arr) {
			System.out.println(val+ " ");
		}
		
		
	}
}
