package javaCode;

import java.util.Scanner;

public class AlphabetNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	char Alphabet=scan.next().charAt(0);
	int value=Alphabet;
	int position = 0;
	System.out.println("Alphabet value: "+value);
	if(value>=65 & value<=90)
	{
		position=value-64;
	}
	else if(value>=97 & value<=122)
	{
		position=value-96;
	}
	System.out.println("Alphabet value: "+position);
	}

}
