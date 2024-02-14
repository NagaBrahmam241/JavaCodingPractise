
public class ReverseString{
    public static void main (String[] args) {
        String inputString = "Hello Naga!";
        String reversedString = reverseString(inputString);
        
        System.out.println("Original String : " + inputString);
        System.out.println("Reversed String : " + reversedString);
    }
    
    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        
        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}