package exceptionhandling.program9;

import java.util.Scanner;

public class Collar {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter collar sizes");
		int count = 0;
		float k = 34;
		float[] standardSize = new float[8];
		for (int i = 0; i < 8; i++) {
			 k = k+2;
             standardSize[i] = (k*102)/100;
		}
		float[] sizes = new float[8];
		int j = 0;

		while (j < 8) {
			sizes[j] = sc.nextFloat();
			j++;
		}
		for (int i = 0; i < 8; i++) {
				
				if((Math.abs((sizes[i]-standardSize[i]))) > 1) {
					count++;				
				}		
		}		
		if(count > 4)
		{
			try {
				sc.close();
				throw new CollarStandardDeviateException("Standard collars are not sufficient.");
			} catch (CollarStandardDeviateException e) {
				System.out.println(e);
			}
		}
		sc.close();
	}

}

