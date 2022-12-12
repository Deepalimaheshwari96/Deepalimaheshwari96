package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program1 {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("z","v","a","b","d");
		Collections.sort(asList);
		System.out.println("Sorted list in Ascending order is "+asList);
		Collections.sort(asList, Collections.reverseOrder());
		System.out.println("Sorted list in Descending order is "+asList);

	}

}
