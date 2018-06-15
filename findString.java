package Strings;

import java.util.Scanner;

public class findString {
	
	static String searchString(String str, String find) {
		String temp="";
		int flag=0;
		int l = find.length();
		for(int i=0; i <(str.length());i++)
		{
			if(str.charAt(i)==find.charAt(0))
			{
				temp = str.substring(i, i+l);
				if (temp.equals(find))
				{
					flag=1;
					break;
				}
				else
				{
					temp = "";
				}
				
			}
		}
		if(flag==0)
		{
			return "No";
		}
		else
		{
			return "Yes";
		}
	}

	
	public static void main(String[] args) {
	String a,b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter statement in which you have to find: ");
	a = s.nextLine();
	System.out.println("Enter string you want to find: ");
	b = s.nextLine();
	String answer = searchString(a, b);
	System.out.println("Presence: " + answer);

	}

}
