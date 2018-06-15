package Strings;

import java.util.*;

public class pattern {

	static void makePattern(int x)
	{
		char ch = 'a';
		for(int i = 0; i<x; i++)
		{
			for(int j = 0; j <= i ;j++)
			{
				System.out.print((char) (97+j));
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Till how many alphabets do you want to go? : ");
		int n = s.nextInt();
		makePattern(n);

	}

}
