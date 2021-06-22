package lab6;

import java.util.ArrayList;
import java.util.Scanner;
public class Lab6Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Lab6Ex6 obj = new Lab6Ex6();
		obj.makeArrayList(n);
	}
		public void makeArrayList (int n) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<>(n);
		for(int i =0; i<n; i++) {
			arrayList.add(0);
		}
		System.out.println(arrayList);
		arrayList.clear();
		arrayList.add(45);
		arrayList.add(20);
		System.out.println(arrayList);
		
		
	}

}
