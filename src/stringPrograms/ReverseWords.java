package stringPrograms;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str = "This is a sentence";
		String words[] = str.split(" ");
		String st1 = "";
		
		//words = ["This", "is", "a", "sentence"]
		
		for(int i=0; i<words.length/2; i++)
		{
			String temp = words[i];
			words[i] = words[words.length-1-i];
			words[words.length-1-i] = temp;
		}
		
		for(String eachWord:words)
		{
			System.out.println(eachWord);
		}

		// o/p:    words = ["sentence", "a", "is", "This"]

	}

}
