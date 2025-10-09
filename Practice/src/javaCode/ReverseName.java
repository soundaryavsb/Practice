package javaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ReversedName = "";
		String name=scan.nextLine();

		List<String> namelist=new ArrayList<String>();

		for(int i=0;i<name.length();i++)
		{
			namelist.add(String.valueOf(name.charAt(i)));
		}


		Collections.reverse(namelist);
		System.out.println(namelist);
		for(int i=0;i<name.length();i++)
		{
			ReversedName+=namelist.get(i);
		}
		System.out.println(ReversedName);

	}

}
