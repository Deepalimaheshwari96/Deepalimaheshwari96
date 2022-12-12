package exceptionhandling.program4;

import java.util.Scanner;

public class Test {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			Item[] items = new Item[5];

			int no_of_items;
			int j = 0;
			int id, quant;

			System.out.println("Enter items details");

			while (j < 5) {
				System.out.println("Item id");
				items[j].setItemid(sc.nextInt());
				System.out.println("Item Name");
				items[j].setItem_name(sc.next());
				System.out.println("Item Price");
				items[j].setPrice(sc.nextInt());
				System.out.println("Limit of purchase");
				items[j].setMaximum_no_of_item(sc.nextInt());
				j++;
			}

			System.out.println("Enter how many items you have purchased");
			no_of_items = sc.nextInt();
			System.out.println("Enter item id");
			id = sc.nextInt();
			System.out.println("Number of quantity you purchased");
			quant = sc.nextInt();
		}
}
