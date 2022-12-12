package stringPrograms;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				System.out.println("Enter  first string");
				String originalString = sc.next();
				System.out.println("Enter that string you want to insert");
				java.lang.String stringToBeInserted = sc.next();
				System.out.println("Enter index where you want to insert");
				int index = sc.nextInt();
				String newString = new String();

				for (int i = 0; i < originalString.length(); i++) {

					newString += originalString.charAt(i);

					if (i == index) {

						newString += stringToBeInserted;
					}
				}
				System.out.println(newString);
			}


}
