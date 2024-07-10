package arrayPrograms;

public class EvenNumberInArray {

	public static void main(String[] args) {
		
		int num[] = {45,23,22,66,2,4,5,1};
		
		for(int i =0; i<num.length;i++)
		{
			//if num[i] is even or not
			if(num[i]%2 == 0)
			{
				System.out.println(num[i]);
			}
		}

	}

}
