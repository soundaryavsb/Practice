package javaCode;

public class ReverseWordinTheSentence {

	public static void main(String[] args) {
		   String Str="Learn Automation online with Java";
	        String[] words=Str.split(" ");
	        for(int i=words.length-1;i>=0;i--)
	        {
	            System.out.print(words[i]+" ");
	        }

	}

}
/* Reverse words in the sentence
 * Input: Learn Automation online with Java
 * Output: Java with online Automation Learn 
 */
