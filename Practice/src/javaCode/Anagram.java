package javaCode;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String S1="Listen";
		String S2="Silent";
		if(S1.length()==S2.length())
		{
			char[] C1=S1.toLowerCase().toCharArray();
			char[] C2=S2.toLowerCase().toCharArray();
			Arrays.sort(C1);
			Arrays.sort(C2);
			if(Arrays.equals(C1, C2)) 
			{
				System.out.println("Anagram");	
			}
			else
			{
				System.out.println("Not Anagram");	
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}