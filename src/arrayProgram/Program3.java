package arrayProgram;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int n = 0;
		int []arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The Array is :"+arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number -");
		int nextInt = sc.nextInt();
		//assign user input to value
		n = nextInt;
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println("the new Array is "+arr[i]);
		}

	}

}
