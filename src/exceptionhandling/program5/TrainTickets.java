package exceptionhandling.program5;

import java.time.LocalTime;
import java.util.Scanner;

public class TrainTickets {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		int hour = lt.getHour();

		Scanner sc = new Scanner(System.in);
		TravelerDetails[] tatkaal = new TravelerDetails[5];
		tatkaal[0] = new TravelerDetails();
		tatkaal[1] = new TravelerDetails();
		tatkaal[2] = new TravelerDetails();
		tatkaal[3] = new TravelerDetails();
		tatkaal[4] = new TravelerDetails();

		TravelerDetails[] normal = new TravelerDetails[7];
		normal[0] = new TravelerDetails();
		normal[1] = new TravelerDetails();
		normal[2] = new TravelerDetails();
		normal[3] = new TravelerDetails();
		normal[4] = new TravelerDetails();
		normal[5] = new TravelerDetails();
		normal[6] = new TravelerDetails();

		System.out.println("Welcome! Which ticket you want to book");
		System.out.println("T for Tatkaal and N for Normal");
		String choice = sc.next();
		String c = "No";

		int j = 0;
		int k = 0;
		do {
			if ((choice.equals("T") && (hour >= 10 && hour <= 12))) {
				if (j <= 3) {
					System.out.println("Enter your details");
					System.out.println("Your name");
					tatkaal[j].setName(sc.next());
					System.out.println("Your age");
					tatkaal[j].setAge(sc.nextInt());
					if((tatkaal[j].getAge() < 5) && (tatkaal[j].getAge() > -1)){
						try {
							throw new BookingLimitExceed("Age should be greater than 5");
						} catch (BookingLimitExceed e) {
							System.out.println(e.getMessage());
							break;
						}
					}
					System.out.println("Gender");
					tatkaal[j].setGender(sc.next());
					j++;
					System.out.println("Enter Y for continue");
					c = sc.next();
					System.out.println("T for Tatkaal and N for Normal");
					choice = sc.next();
				} else {
					try {
						throw new BookingLimitExceed("You can only book max 4 tickets in tatkaal");
					} catch (BookingLimitExceed e) {
						System.out.println(e.getMessage());
						break;
					}
				}
			} else {
				if ((choice.equals("N") && (hour <= 11 || hour >= 13))) {
					if (k <= 5) {
						System.out.println("Enter your details");
						System.out.println("Your name");
						tatkaal[j].setName(sc.next());
						System.out.println("Your age");
						tatkaal[j].setAge(sc.nextInt());
						if((tatkaal[j].getAge() < 5) && (tatkaal[j].getAge() > -1)){
							try {
								throw new BookingLimitExceed("Age should be greater than 5");
							} catch (BookingLimitExceed e) {
								System.out.println(e.getMessage());
								break;
							}
						}
						System.out.println("Gender");
						tatkaal[j].setGender(sc.next());
						k++;
						System.out.println("Enter Y for continue");
						c = sc.next();
						System.out.println("T for Tatkaal and N for Normal");
						choice = sc.next();
					} else {
						try {
							throw new BookingLimitExceed("You can only book max 6 tickets in normal");
						} catch (BookingLimitExceed e) {
							System.out.println(e.getMessage());
							break;
						}
					}
				} else {
					if ((j == 4) || (j == 0)) {
						System.out.println("Time-out fot tatkaal ticket");
					} else {
						try {
							throw new BookingLimitExceed("Please book after some time");
						} catch (BookingLimitExceed e) {
							System.out.println(e.getMessage());
							break;
						}
					}
				}

			}

		} while (c.equals("Y"));

	}
}
