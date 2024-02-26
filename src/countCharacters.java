import java.util.*;

public class countCharacters {
	
	public static void main(String[] args) {
		String input = "Hello";
		countCharacters(input);
	}

	public static void countCharacters(String input) {
		input = input.toLowerCase();
		
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		for(char ch:input.toCharArray()) {
			if(Character.isLetter(ch)) {
				charCountMap.put(ch,charCountMap.getOrDefault(ch, 0) + 1);
			}
		}
		
		for(char c:charCountMap.keySet()) {
			System.out.println(c + " --> " + charCountMap.get(c));
		}
		
	}
	

}
