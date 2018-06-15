package Strings;

import java.util.Scanner;

public class question1 {

	static String reverse(String s) {
		String temp = "", rev = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				rev = temp + " " + rev;
				temp = "";
			} else {
				temp += s.charAt(i);
			}
		}
		rev = temp + " " + rev;
		return rev;
	}

	public static void main(String[] args) {
		String str, result;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		result = reverse(str);
		System.out.println(result);
		sc.close();

	}
}