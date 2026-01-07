package javaCode;

public class ReverseWordsInAStringWithoutUsingSplitMethod {

	public static void main(String[] args) {
		// Initialize the input string
		String Str = "Learn Automation online with Java";

		// Create an array to hold individual words (max 10 words assumed)
		String[] words = new String[10]; // Initially contains null values

		// Initialize each element to an empty string to avoid null issues
		for (int i = 0; i < 10; i++) {
			words[i] = ""; 
		}

		int j = 0; // Index to track current word being built

		// Loop through each character in the string to manually split words
		for (int i = 0; i < Str.length(); i++) {
			if (Str.charAt(i) != ' ') {
				// Append character to current word if it's not a space
				words[j] += Str.charAt(i);
			} else {
				// Move to next word when a space is encountered
				j++; 
			}
		}

		// Print the words in reverse order
		for (int i = j; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}

}
/* Question:
 * Program to Reverse Words in a String Without Using split()
 * or
 * Java Program to Reverse Words in a Sentence Manually
 * Input:
 * Learn Automation online with Java
 * Output:
 * Java with online Automation Learn
 */
