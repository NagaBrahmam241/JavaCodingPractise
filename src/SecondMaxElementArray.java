
public class SecondMaxElementArray {
	
	public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 4, 11, 10};

        int max = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE; 

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element in the array.");
        } else {
            System.out.println("The second maximum element is: " + secondMax);
        }
    }

}
