public class ExtractWord {
    public static void main(String[] args) {
        String input = "N@a&ga$";
        String result = extractWord(input);
        
        System.out.println("Input String is : " + input);
        System.out.println("Extracted word from the given String is : " + result);
    }

    public static String extractWord(String input) {
        
        StringBuilder resultBuilder = new StringBuilder();

        
        for (char ch : input.toCharArray()) {
            
            if (Character.isLetter(ch)) {
                
                resultBuilder.append(ch);
            }
        }

     
        return resultBuilder.toString();
    }
}