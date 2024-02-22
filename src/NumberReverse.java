
public class NumberReverse {
	
	public static void main(String[] args) {
		int inputNumber = 456;
		int reverse = reversedNumber(inputNumber);
		System.out.println("Reversed Number is : " + reverse);
		
	}

	private static int reversedNumber(int inputNumber) {
		int reverse = 0;
		
		while(inputNumber!=0) {
			int digit = inputNumber%10;
			reverse = reverse * 10 + digit;
			inputNumber = inputNumber /10;
		}
		return reverse;
	}
	
	

}
