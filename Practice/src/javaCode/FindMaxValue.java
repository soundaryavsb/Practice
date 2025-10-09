package javaCode;

import java.util.Scanner;

public class FindMaxValue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number count: ");
		int count=scan.nextInt();
		int max=Integer.MIN_VALUE;
		System.out.println("Enter the numbers:");
		int[] num= new int[count];
		for(int i=0;i<count;i++)
		{
			num[i]=scan.nextInt();
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		
		System.out.println("Maximum value in the list: "+max);
	}

}
