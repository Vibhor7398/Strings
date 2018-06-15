package Strings;

import java.util.*;

public class totalWords {
	
	static int numberOfWords(String x) {
		int words=0;
		x=x+" ";
		for(int i=1;i<x.length();i++)
		{
			if(x.charAt(i)==' '&& x.charAt(i-1)!=' ') {
				words++;
			}
		}
		return words;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Total number of words are: " + numberOfWords(str));
	}

}
