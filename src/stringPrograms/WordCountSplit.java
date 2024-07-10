package stringPrograms;

public class WordCountSplit {

	public static void main(String[] args) {
		String str = "  This is an example of    counting word using split ";
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		String words[] = str.split(" ");
		System.out.println(words.length);

	}

}
