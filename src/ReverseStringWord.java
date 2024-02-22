
public class ReverseStringWord {
	
	public static void main(String[] args) {
		String inputString = "This is Naga";
		
		String output = reversed(inputString);
		
		System.out.println("Input String is : " + inputString);
		System.out.println("Reversed String is : " + output);
		
	}

	public static String reversed(String inputString) {
		String[] words = inputString.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = words.length-1;i>=0;i--) {
			sb.append(words[i]);
			sb.append(" ");
			
		}
		return sb.toString().trim();
		
	}
}
