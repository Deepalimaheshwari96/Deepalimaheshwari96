package arrayProgram;

import java.util.Arrays;

public class Program6 {

		static void printOrder(int[] arr, int n)
		{
		    Arrays.sort(arr);
		   
		    for (int i = 0; i < n / 2; i++)
		        System.out.print(arr[i]+" ");
		 
		    
		    for (int j = n - 1; j >= n / 2; j--)
		    System.out.print(arr[j]+" ");
		     
		}
		 
		public static void main(String[] args)
		{
		    int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
		    int n = arr.length;
		    printOrder(arr, n);
	}

}
