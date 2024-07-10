package hashMapPro;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapIntro {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Huzaifa", 80);
		hm.put("Shahbaz", 85);
		hm.put("Taiba", 60);
		hm.put("Washi", 75);
		hm.put("Huzaifa", 90);
		
//		for(String key:hm.keySet())
//		{
//			// to get Value:     hm.get(key)
//			// to get key:       key
//			System.out.println(key + " ----  "+ hm.get(key));
//		}
		
		for(Entry<String, Integer> eachEntry: hm.entrySet())
		{
			System.out.println(eachEntry.getKey()+" ------ "+eachEntry.getValue());
		}

	}

}
