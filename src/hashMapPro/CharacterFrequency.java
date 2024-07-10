package hashMapPro;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String str = "regrowe tech";
		//r -- 2
		//e -- 2
		//g -- 1
		//o -- 1
		//w -- 1
		//t -- 1
		//c -- 1
		//h -- 1
		
		HashMap<Character,Integer> hm = new HashMap<>();
		//r  -- 2
		//e -- 2
		//g -- 1
		//o -- 1
		//w -- 1
		//  -- 1
		//t -- 1
		//c -- 1
		//h -- 1
		
		
		
		//regrow tech
		
		for(int i = 0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(!hm.containsKey(ch))
			{
				hm.put(ch, 1);   //r --- 1
			}
			else
			{
				int prev_val = hm.get(ch);
				hm.put(ch, prev_val+1);
			}
		}
		
		
		for(Entry<Character, Integer> eachEntry: hm.entrySet())
		{
			if(eachEntry.getValue() == 1)
			{
			 System.out.println(eachEntry.getKey()+" ------ "+eachEntry.getValue());
			}
		}
		
		

	}

}
