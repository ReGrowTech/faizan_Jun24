package hashMapPro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class StudentMarks {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Huzaifa", 80);
		hm.put("Shahbaz", 85);
		hm.put("Taiba", 60);
		hm.put("Washi", 75);
		hm.put("Sahil", 90);
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int each:hm.values())
		{
			al.add(each);
		}
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int each: al)
		{
			for(String key:hm.keySet())
			{
				if(hm.get(key) == each) 
				{
					System.out.println(key + " ----  "+ hm.get(key));
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
//		for(String key:hm.keySet())
//		{
//			// to get Value:     hm.get(key)
//			// to get key:       key
//			System.out.println(key + " ----  "+ hm.get(key));
//		}
		
//		for(Entry<String, Integer> eachEntry: hm.entrySet())
//		{
//			System.out.println(eachEntry.getKey()+" ------ "+eachEntry.getValue());
//		}

	}

}
