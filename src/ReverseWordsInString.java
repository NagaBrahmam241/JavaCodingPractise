
public class ReverseWordsInString {
	
	public static void main(String[] args) {
		String inputString = "This is Naga";
		String reversedOutput = revrerseString(inputString);
		
		System.out.println("Given Input String : " + inputString);
		System.out.println("Reversed String : " + reversedOutput);
		
	}

	private static String revrerseString(String inputString) {
		String[] words = inputString.split(" ");
		
		StringBuilder st = new StringBuilder();
		for(int i = words.length-1;i>=0;i--) {
			st.append(words[i]).append(" ");
			
			
		}
		return st.toString().trim();
	}

}
