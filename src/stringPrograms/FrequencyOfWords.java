package stringPrograms;

public class FrequencyOfWords {

	public static void main(String[] args) {
		
		String sent = "Today this is Faizan and Faizan is teaching string today";
		sent = sent.trim();
		sent = sent.replaceAll("\\s+", " ");
		String arr[] = sent.split(" ");
		
		for(int i =0; i< arr.length;i++)
		{

			if(!arr[i].equals("vxtq@"))
			{
				int cnt = 1;
				for(int j =i+1; j<arr.length;j++)
				{
					if(arr[i].equalsIgnoreCase(arr[j]))
					{
						cnt++;
						arr[j] = "vxtq@";
					}
				}

				System.out.println(arr[i] +" ---> "+cnt);
			}
		}
		

	}

}
