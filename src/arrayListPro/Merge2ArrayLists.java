package arrayListPro;

import java.util.ArrayList;
import java.util.Collections;

public class Merge2ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(78);
		al.add(91);
		al.add(19);
		al.add(9);
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(94);
		al1.add(782);
		al1.add(916);
		al1.add(197);
		al1.add(23);
		
		al.addAll(al1);
		System.out.println(al);
		
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
	}
	
	//.add()
	//.get()
	//.size()
	//.remove()
	//.clear()
	//Collections.sort()
	//Collections.sort(al,Collections.reverseOrder())
	//iterator
	
	

}
