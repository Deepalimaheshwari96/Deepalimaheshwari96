package arrayProgram;

public class Program2 {

	public static void main(String[] args) {
		int [] arr = {8,3,5,2,6,8,4,3,2,5};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					System.out.println("Duplicate Numbers are: "+arr[i]);
				}
				
			}
		}
		System.out.println("count of Duplicate Numbers is: "+ count);
	
	}

}
