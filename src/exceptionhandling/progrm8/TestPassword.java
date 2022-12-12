package exceptionhandling.progrm8;

import java.util.Scanner;

public class TestPassword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Suthfgf2@#!
		System.out.println("Enter password");
		String password = sc.next();

		int digit = 0;
		int lower = 0;
		int upper = 0;
		int special;

		int len = password.length();

		if ((len < 8) || (len > 14)) {
			try {
				throw new PasswordFormatException(
						"Password must be of 8 to 14 characters long and " + "not exceeded the limit of 14 characters");
			} catch (PasswordFormatException e) {
				System.out.println(e);
			}
		}

		if ((len >= 8) && (len <= 14)) {

			for (int i = 0; i < len; i++) {

				char ch = password.charAt(i);

				if (Character.isDigit(ch)) {
					digit++;
				}
				if (Character.isLowerCase(ch)) {
					lower++;
				}
				if (Character.isUpperCase(ch)) {
					upper++;
				}
			}
		}

		special = len - (digit + upper + lower);

		if (digit >= 2) {
			if (lower >= 2) {

				if (upper >= 2) {

					if (special >= 2) {
						System.out.println("You entered an strong password");
					}else {
						try {
							throw new PasswordFormatException("Your entered password is not strong");
						} catch (PasswordFormatException e) {
							System.out.println(e);
						}
					}

				}else {
					try {
						throw new PasswordFormatException("Your entered password is not strong");
					} catch (PasswordFormatException e) {
						System.out.println(e);
					}
				}

			}else {
				try {
					throw new PasswordFormatException("Your entered password is not strong");
				} catch (PasswordFormatException e) {
					System.out.println(e);
				}
			}
		} else {
			try {
				throw new PasswordFormatException("Your entered password is not strong");
			} catch (PasswordFormatException e) {
				System.out.println(e);
			}
		}
	}

}

