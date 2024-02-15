import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(palindromeNumber(x)?"true":"false");
    }

    public static boolean palindromeNumber(int x){
        int originalNumber = x;
        int reversedNumber = 0;

        while(x!=0){
            int digit = x%10;
            reversedNumber = reversedNumber *10 + digit;
            x = x / 10;


        }
        return originalNumber == Math.abs(reversedNumber);
    }

}
