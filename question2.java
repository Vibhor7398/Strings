package Strings;

public class question2 {

	static String s = "xyz",sub;
	static void printSub()
	{
		int N = s.length();
		for(int size=0,temp=0;size<s.length();size++)
		{
			if(size==0)
			{
			for( ; temp<s.length();temp++)
			{
			System.out.println(s.charAt(temp));
			}
			}
			else
			for(;temp<s.length()-(s.length()-temp);temp++)
			{
				//for()
			}
		}
	
	}
	public static void main(String[] args) {
		printSub();
	}

}
