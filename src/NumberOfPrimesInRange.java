public class NumberOfPrimesInRange {

    public static void main(String[] args) {
        int result = numberOfPrimesInARange(5, 50);
        System.out.println("The count of prime numbers in the range is: " + result);
    }

    public static int numberOfPrimesInARange(int l, int r) {
        int count = 0;
        
        for (int i = l; i <= r; i++) {
            if (isPrime(i)) {
            	System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}
