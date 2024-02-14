
public class NthFibonacciNumber {
	public static int nthFibonacciNumber( int n){
        if(n<=1){
            return n;
        }

        int prev = 0;
        int current = 1;

        for(int i = 2;i<=n;i++){
            int next =  prev + current;
            prev = current;
            current = next;
        }
        return current;
    }
	
	public static void main(String[] args) {
		int inputNumber = 10;
		int nthFibonacci = nthFibonacciNumber(inputNumber);
        System.out.println("The " + inputNumber + "th Fibonacci number is: " + nthFibonacci);
	}

	
}
