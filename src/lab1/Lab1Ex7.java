package lab1;

import java.util.Scanner;

public class Lab1Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int input = sc.nextInt();
		Lab1Ex7 obj = new Lab1Ex7();
		obj.checkNumber(input);
		sc.close();
	}

	public void checkNumber(int input) {
		boolean flag = true;
		int digit1 = input % 10;
		input = input / 10;
		while (input > 0) {
			if (digit1 <= input % 10) {
				flag = false;
				break;
			}
			digit1 = input % 10;
			input = input / 10;

		}
		if (flag)
			System.out.println("Number is increasing number");
		else
			System.out.println("Number is not increasing number");

	}

}
// main
// int num = 12345;
// String str = Integer.toString(num);
// sysout(str);
//boolean isIncreasingNumber =false;
//for (int i =0;i < str.length()-1; i++) {
// if(str.charAt(i)< str.charAt(i+1)) {
//isIncreasingNumber = true;
// }else {
// isIncreasingNumber =false;
// break;
//}
//}
//if ( isIncrasingNumber) {
// sysout("This is increasing number");
// }else{ 
//sysout("This is not increasing number");
//}
//}