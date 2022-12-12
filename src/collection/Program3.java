package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements - ");
		int next = scan.nextInt();
		
		for (int i = 0; i < next; i++) {
			list.add(scan.nextInt());
		}
		
		System.out.println("your inserted list is -"+list);
		
		/**
		 * Here we using Set for removing duplicate items as its a Set Property
		 */
		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		
		System.out.println("your Update list after removing duplicate element is -"+set);
		
		Collections.sort(list);
		
		System.out.println("Sorted list"+list);

	
	}
}
