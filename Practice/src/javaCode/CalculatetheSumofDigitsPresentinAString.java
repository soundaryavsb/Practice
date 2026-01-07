package javaCode;

public class CalculatetheSumofDigitsPresentinAString {

	public static void main(String[] args) {
        // Step 1: Initialize the input string
        // The string contains both letters and digits
        String Str = "L4earn Automat5ion on2line with Ja8va";   

        // Step 2: Variable to store the sum of digits
        int Sum = 0;

        // Step 3: Create a character array to hold characters of the string
        // Size 100 is arbitrary but large enough for this example
        char[] ch = new char[100];

        // Step 4: Loop through each character of the string
        for (int i = 0; i < Str.length(); i++) {
            // Copy each character into the array
            ch[i] = Str.charAt(i);

            // Step 5: Check if the current character is a digit (0–9)
            if (Character.isDigit(ch[i])) {
                // Step 6: Convert the digit character into its integer value
                int a = Character.getNumericValue(ch[i]);

                // Step 7: Add the digit value to the running sum
                Sum = Sum + a;
            }
        }
        // Step 8: Print the final sum of all digits found in the string
        System.out.print(Sum);
	}
}
/* Java Program to Calculate the Sum of Digits Present in a String
 * Input:
 * L4earn Automat5ion on2line with Ja8va
 * Output:
 * 19
 */
