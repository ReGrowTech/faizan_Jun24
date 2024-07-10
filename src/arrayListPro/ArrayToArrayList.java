package arrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		
//		Integer arr[] = new Integer[5];
		Integer arr[] = {4,56,23,78,9};
		
//		List<Integer> al = Arrays.asList(arr);
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int each:arr)
		{
			al.add(each);
		}
		
		
		for(int each:al)
		{
			System.out.println(each);
		}
		
		

	}

}
