public class ExtractWord {
    public static void main(String[] args) {
        String input = "N@a&ga$";
        String result = extractWord(input);
        
        System.out.println("Input String is : " + input);
        System.out.println("Extracted word from the given String is : " + result);
    }

    public static String extractWord(String input) {
        // Create a StringBuilder to store the result
        StringBuilder resultBuilder = new StringBuilder();

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            // Check if the character is an alphabet
            if (Character.isLetter(ch)) {
                // Append the alphabet to the result
                resultBuilder.append(ch);
            }
        }

        // Convert the StringBuilder to a String
        return resultBuilder.toString();
    }
}