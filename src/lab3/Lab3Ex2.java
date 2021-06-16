package lab3;

import java.util.Scanner;

public class Lab3Ex2 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to be mirrored");
		String str = sc.next();
		Lab3Ex2 obj =new Lab3Ex2();
		obj.getImage(str);
		sc.close();
	}
	
	private void getImage(String str) {
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse(); // to reverse the string
		System.out.println(str +"|" +str1);
	}

	
	


}
