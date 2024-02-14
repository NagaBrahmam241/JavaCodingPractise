import java.io.*;

import java.util.*;

public class Anagram {
	public static void main(String[] args) throws IOException {
		/*String s = "nagaram";
		String t = "anagram";*/
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String t = in.readLine();
		boolean result = new Anagram().validAnagram(s, t);
		System.out.println("Given strings are Valid Anagrams : " + result);

	}

	public boolean validAnagram(String s, String t) {
		s = s.toLowerCase();
		t = t.toLowerCase();

		if (s.length() != t.length()) {
			return false;
		}

		char[] charArray1 = s.toCharArray();
		char[] charArray2 = t.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}

}
