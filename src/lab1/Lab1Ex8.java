package lab1;

import java.util.Scanner;

public class Lab1Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int input = sc.nextInt();
		Lab1Ex8 obj = new Lab1Ex8();
		sc.close();

		if (obj.checknumber(input)) {
			System.out.println(input + " is power of 2 ");
		} else {
			System.out.println(input + " is not power of 2 ");
		}
	}

	public boolean checknumber(int input) {
		if (input < 2) {
			return false;
		}
		while (input >= 2) {
			if (input % 2 != 0) {
				return false;
			}
			input = input / 2;
		}
		return true;

	}

}
