
public class GeneratePasscode {
	public static String passCode(String A,String B){
        int len1 = A.length();
        int len2 = B.length();

        int minLength = Math.min(len1,len2);

        StringBuilder result = new StringBuilder();

        int i=0;
        while(i < minLength){
            result.append(A.charAt(i));
            result.append(B.charAt(i));
            i++;

        }

        while(i < len1){
            result.append(A.charAt(i));
            i++;
        }

        while(i < len2){
            result.append(B.charAt(i));
            i++;
        }
        return result.toString();
        
    }
	
	public static void main(String args[]){
		String input1 = "Naga";
		String input2 = "Naga123";
		System.out.println("Merged String of the two given Strings is : " + passCode(input1,input2));
	}

}
