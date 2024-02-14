
public class ArranageZerosAndOnes {
	
	public static void main(String[] args) {
		String inputString = "010100010";
		String rearrangeInput = arranageZeroAndOnes(inputString);
		
		System.out.println("Input String is : " + inputString);
		System.out.println("Rearranged String : " + rearrangeInput);
	}

	public static String arranageZeroAndOnes(String inputString) {
		if(inputString == null || inputString.isEmpty()) {
			return inputString;
		}
		int zerosConut = 0;
		StringBuilder result = new StringBuilder();
		
		for(char ch:inputString.toCharArray()) {
			if(ch == '0') {
				zerosConut++;
				result.append('0');
			}
		}
		for(int i=0;i<inputString.length()-zerosConut;i++) {
			result.append('1');
		}
		return result.toString();
	}
	
	

}
