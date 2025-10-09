package javaCode;

public class OccuranceofCharacterWithoutForloop {

	public static void main(String[] args) {
		String sentence="Hi, I Am soundarya";
		char find='A';
		
		String sentenceLower=sentence.toLowerCase();
		char findLower=Character.toLowerCase(find);

		int SentenceLegth=sentenceLower.length();
		String ReplacedSentence=sentenceLower.replaceAll(String.valueOf(findLower), "");
		int withoutFindCharacterslength=ReplacedSentence.length();
		System.out.println(SentenceLegth-withoutFindCharacterslength);
		
	}

}
