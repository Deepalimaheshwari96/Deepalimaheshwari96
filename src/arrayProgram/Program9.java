package arrayProgram;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter");
        int limit = sc.nextInt();
        int[][] numbers = new int[limit][limit];
        int row = 0;
        int col = 0;
        System.out.println("Enter numbers of matrix");
        for (int j = 0; j < limit; j++) {
            for (int k = 0; k < limit; k++) {
            numbers[j][k] = sc.nextInt();
            }
        }
        
        System.out.println("First Row Elements : ");
        if(row == 0)
        {   
            for (int k = 0; k < limit; k++) {
                System.out.print(numbers[row][k]+" ");
            }
            row = limit-1;
        }
        
        System.out.println("\nLast Row Elements : ");
        if(row == limit-1)
        {   
            for (int k = 0; k < limit; k++) {
                System.out.print(numbers[row][k]+" ");
            }
            row = limit-1;
        }
        System.out.println("\nFirst Column Elements : ");
        if(col == 0)
        {   
            for (int k = 0; k < limit; k++) {
                System.out.print(numbers[k][col]+" ");
            }
            col = limit-1;
        }
        
        System.out.println("\nLast Column Elements : ");
        if(col == limit-1)
        {   
            for (int k = 0; k < limit; k++) {
                System.out.print(numbers[k][col]+" ");
            }
            row = limit-1;
        }
    }

}
