package Strings;

import java.util.*;

public class question2 {

	static void printSingle(String s) {
		int N = s.length();
		for (int i = 0; i < N; i++) {
			System.out.println(s.charAt(i));
		}
	}

	static void printMultiple(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				System.out.print(s.charAt(i));
				System.out.println(s.charAt(j));
			}
		}
	}

	static void printComplete(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSingle(str);
		printMultiple(str);
		printComplete(str);
	}
}
