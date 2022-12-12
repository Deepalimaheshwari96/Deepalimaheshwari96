package exceptionhandling.program10;

import java.util.ArrayList;

public class program10 {}
	class parent  {
		 ArrayList<Integer> calculateMaxNo(ArrayList<Integer> list)  throws NullPointerException, ArrayIndexOutOfBoundsException{
			 
			return list;
			
		}
		
		
	}
	class child extends parent {
		
		@Override
		ArrayList<Integer> calculateMaxNo(ArrayList<Integer> list) throws NumberFormatException,  NullPointerException {
			AverageNo(list);
			return list;
		}
		
		Integer AverageNo(ArrayList< Integer> list) {
			int no= 0;
			return no;
			
		}
		
		
	}
	
	


