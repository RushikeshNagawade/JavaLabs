package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with space between them");
		String num = sc.nextLine();
		sc.close();
		
		int sum = 0;
		int n = 0;
		StringTokenizer st = new StringTokenizer(num);
		while(st.hasMoreTokens()) {
			
			n = Integer.parseInt(st.nextToken());
			System.out.println("Number is:" +n);
			sum += n;
		
		}
		System.out.println("Sum of all integers is: " +sum);
	}
}
