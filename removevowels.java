package Strings;

import java.util.*;

public class removevowels {

	static String removeVowels(String str) {
		String result = "", temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

			} else {
				temp += str.charAt(i);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		System.out.println(removeVowels(str));

	}

}
