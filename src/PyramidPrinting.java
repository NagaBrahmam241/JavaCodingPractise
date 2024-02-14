
public class PyramidPrinting {
	public static void main(String[] args) {
		int inputNumber = 5;
		String[] pattern = pyramidPrinting(inputNumber);

	    for (int i = 0; i < inputNumber; i++) {
	    	System.out.println(pattern[i]);
	    }
	}
    
    public static String[] pyramidPrinting(int inputNumber){
        String[] result =  new String[inputNumber];

        for(int i=0;i<inputNumber;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<=i;j++){
                sb.append("* ");
            }
            result[i] = sb.toString();
        }
        return result;
    }
}
