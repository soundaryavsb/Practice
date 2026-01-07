package javaCode;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		// Step 1: Initialize the input string
		String Str = "Learn Automation online with Java";

		// Step 2: Split the string into words using space (" ") as delimiter
		// Example: ["Learn", "Automation", "online", "with", "Java"]
		String[] word = Str.split(" ");

		// Step 3: Loop through each word in the array
		for (int i = 0; i < word.length; i++) {

			// Step 4: Loop through each character of the current word in reverse order
			// word[i].length()-1 gives the last character index of the word
			for (int j = word[i].length() - 1; j >= 0; j--) {
				// Print characters in reverse order
				System.out.print(word[i].charAt(j));
			}

			// Step 5: Print a space after each reversed word to separate them
			System.out.print(" ");
		}

	}

}
/* Reverse Each Word in a String
 * Input:
 * Learn Automation online with Java
 * Output:
 * nraeL noitamotuA enilno htiw avaJ
 */