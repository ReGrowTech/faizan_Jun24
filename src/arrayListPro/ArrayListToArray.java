package arrayListPro;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(78);
		al.add(91);
		al.add(19);
		al.add(9);
		
		int arr[] = new int[al.size()];
		
		int i = 0;
		for(int each:al)
		{
			arr[i] = each;
			i++;
		}
		
		for(int each: arr)
		{
			System.out.println(each);
		}

	}

}
