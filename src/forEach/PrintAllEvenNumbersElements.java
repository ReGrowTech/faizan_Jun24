package forEach;

import functions.PrintingEvenNumberOnly;

public class PrintAllEvenNumbersElements {

	public static void main(String[] args) {
		
		int arr[] = {10,2,5,7,9,12};
		
		for(int eachEle : arr)
		{
			PrintingEvenNumberOnly.printEvenNumber(eachEle);
		}

	}

}
