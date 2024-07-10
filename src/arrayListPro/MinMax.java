package arrayListPro;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(78);
		al.add(91);
		al.add(19);
		al.add(9);
		al.add(78);
		
		
		ArrayList<Integer> noDuplicate = new ArrayList<>();
		//9,78,91,19
		
		for(int each:al)
		{
			if(!noDuplicate.contains(each))
			{
				noDuplicate.add(each);
			}
			
		}
		
		Collections.sort(noDuplicate);
		System.out.println(noDuplicate.get(1));
		
		

	}

}
