package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program4 {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Deepali","Surbhai","Deepali","Deepeshi","Ritika","Rupal","Priyanka","Subham");
		
		//Set
		Set<String>set = new HashSet<String>();
		set.addAll(asList);
		
		System.out.println("List after removing Duplicate elements"+set);
		
		 TreeSet<Object> treeSet = new TreeSet<Object>();
		
		for(Object tree:set)
			treeSet.add(tree);
		  TreeSet<Object> res = (TreeSet<Object>)treeSet.descendingSet();
	      System.out.println("TreeSet after sorting in descending order\n" + res);
	}
}
