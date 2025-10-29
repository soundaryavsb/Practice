package javaCode;

import java.util.HashSet;
import java.util.Set;

public class CheckRepetedlettersInString {

	public static void main(String[] args) {
		String src="edfredkfregdfr";
		Set<Character> letters=new HashSet<Character>();
		for(int i=0;i<src.length();i++)
		{
			letters.add(src.charAt(i));
		}
		System.out.print("Number of letters in the given String: "+letters.size());
		int Count=0;
		for(char c:letters)
		{
			for(int j=0;j<src.length();j++)
			{
				if(c==(src.charAt(j)))
				{
					Count++;
				}
			}
			if(Count==1)
			{
				System.out.print("\nLetter "+c+" is not repeated");  
			}
			Count=0;
		}
	}
}
