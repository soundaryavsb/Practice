package javaCode;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		// Step 1: Initialize the input string
		// This is the sentence whose words will be reversed
		String Str = "Learn Automation online with Java";

		// Step 2: Split the string into words using space (" ") as delimiter
		// The split() method breaks the sentence into an array of words
		// Example result: ["Learn", "Automation", "online", "with", "Java"]
		String[] word = Str.split(" ");

		// Step 3: Loop through each word in the array
		for (int i = 0; i < word.length; i++) {
			// Step 4: Create a StringBuilder object for the current word
			// StringBuilder has a built-in reverse() method
			StringBuilder S = new StringBuilder(word[i]);

			// Step 5: Reverse the characters of the current word and print it
			System.out.print(S.reverse());

			// Step 6: Print a space after each reversed word to separate them
			System.out.print(" ");
		}
	}
}
/* Reverse Each Word in a String Using StringBuilder or String Buffer
 * Input:
 * Learn Automation online with Java
 * Output:
 * nraeL noitamotuA enilno htiw avaJ
 */