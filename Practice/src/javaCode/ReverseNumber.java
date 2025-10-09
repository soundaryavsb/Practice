package javaCode;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int Number=scan.nextInt();
		
		int Reverse=0;
		int Mod;
		
		while(Number>0)
		{
			Mod=Number%10;
			Reverse=(Reverse*10)+Mod;
			Number/=10;
		}
		System.out.println("Reversed Number: "+Reverse);

	}

}
