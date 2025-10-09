package javaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseSentenceWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ReversedName = "";
		String name=scan.nextLine();
		String[] words=name.split(" ");
		for(int j=0;j<words.length;j++)
		{
			System.out.println("Words: "+words[j]);
		for(int i=words[j].length()-1;i>=0;i--)
		{
			ReversedName+=words[j].charAt(i);
		}
		if(j<words.length-1)
		{
		ReversedName+=" ";
		}
		}
		System.out.println(ReversedName);

	}

}
