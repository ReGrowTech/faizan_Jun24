package stringPrograms;

public class SplitSentence {

	public static void main(String[] args) {
		
		String str = "This-is-a sentence that-is half split";
		String words[] = str.split(";");
		
		for(String eachWord:words)
		{
			System.out.println(eachWord);
		}

	}

}
