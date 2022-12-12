package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {

	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);
		arr.add(30);
		arr.add(35);
		int binarySearch = Collections.binarySearch(arr, 10);
		System.out.println(binarySearch);
		
	}
}
