package lab1;

import java.util.Scanner;

public class Lab1Ex2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Light Colour");
	String input = sc.nextLine();
	sc.close();
	
	if (input.equals("Red")) {
		System.out.println("Stop");
	}
	else if (input.equals("Yellow")) {
		System.out.println("Ready");
	}
	else if (input.equals("Green")) {
		System.out.println("Go");
	}
	else {
		System.out.println("Invalid Input");
	}

	}
}