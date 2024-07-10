package hashSetPro;

import java.util.*;

public class HashSetBasic {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(7);
		hs.add(90);
		hs.add(65);
		hs.add(21);
		hs.add(33);
		hs.add(90);
		hs.add(22);
		
		for(int each:hs)
		{
			System.out.println(each);
		}
		
		
		//does not contain duplicate values
		//is non-indexable
		// unordered

	}

}
