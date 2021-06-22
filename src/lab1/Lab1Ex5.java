package lab1;

import java.util.Scanner;

public class Lab1Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Lab1Ex5 obj = new Lab1Ex5();
		obj.calculateSum(num);
		sc.close();
	}
	public void calculateSum(int num) {
		int sum = 0;
		int count = 0;
		int i = 1;
		
//		for(int i = 1;i<=num; i++) {
//			if ( i % 3  == 0) {
//				sum += i; 
//			} 
//			else if (i % 5 == 0) {
//				sum += i;
//				
//			}
//		}
		
		while(count<num) {
			if ( i % 3 == 0 || i % 5 ==0) {
				sum +=i;
				count++;
				System.out.println(i);
			} 
			i++;
			
		}
		System.out.println("Addition is " + sum);
		
	}

}
