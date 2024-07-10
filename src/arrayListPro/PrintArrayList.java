package arrayListPro;

import java.util.*;


public class PrintArrayList {

	public static void main(String[] args) {
		
		//is indexable
		//can have duplicate value
		// is ordered
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(78);
		al.add(91);
		al.add(19);
		al.add(9);
		
		//i
		//forEach
		//iterator
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
//		
////		al.remove(3);
//		
////		Collections.sort(al);
//		
//		Collections.sort(al,Collections.reverseOrder());
//		
//		//i 
////		for(int i = 0; i<al.size();i++)
////		{
////			System.out.println(al.get(i));
////		}
//		int sum = 0;
//		//foreach
//		for(int each: al)
//		{
//			sum = sum+each;
//			
//		}
//		System.out.println(sum);
		
		

		
		
		

	}

}
