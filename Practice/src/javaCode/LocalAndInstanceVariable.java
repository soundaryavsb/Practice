package javaCode;

public class LocalAndInstanceVariable {
	//'static' key used for use this variable at 'main' method and
	//when using static then no need to use the 'this' key word
	static int c=5; 
	int d=7;
	void fun1(int a, int b)
	{
		int c=10;
		System.out.println("Addition: "+(a+b+c));
		System.out.println("Instance variable in normal method - with static: "+c);
		System.out.println("Instance variable in normal method - without static with this key: "+this.d);
	}
	public static void main(String[] args) {
	LocalAndInstanceVariable variable=new LocalAndInstanceVariable();
	variable.fun1(5, 4);
	System.out.println("Instance variable in main method - with static: "+c);
	}
}
