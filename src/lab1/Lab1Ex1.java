package lab1;

import java.util.Scanner;
public class Lab1Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Integer");
		int num = sc.nextInt(); 
		int output = 0;
		sc.close();
		while (num>0) {
			
			int rem = num % 10;
			output += rem * rem * rem;
			num = num/10;
			
		}
		System.out.println(output);
	}	
}