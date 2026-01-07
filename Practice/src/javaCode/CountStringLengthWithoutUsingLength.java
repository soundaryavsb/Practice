package javaCode;

import java.util.Scanner;

public class CountStringLengthWithoutUsingLength {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String name=scan.nextLine();
			int count=0;
			char[] nameCharacter=name.toCharArray();
			
			for (char c : nameCharacter) {
				count++;
			}
			System.out.println(name+" length is "+count);
		}

	}

}
