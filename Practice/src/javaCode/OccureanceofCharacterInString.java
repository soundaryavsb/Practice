package javaCode;

public class OccureanceofCharacterInString {

	public static void main(String[] args) {
		String sentence="Hi, I Am soundarya";
		char find='A';
		String sentenceLower=sentence.toLowerCase();
		char findLower=Character.toLowerCase(find);

		char[] sentenceCharacters=sentenceLower.toCharArray();
		int count =0;
		for (char c : sentenceCharacters) {
			if(c==findLower)
			{
				System.out.println(c);
				count++;
			}
		}
		System.out.println(find+" is occured "+count+" time(s)");
	}

}
