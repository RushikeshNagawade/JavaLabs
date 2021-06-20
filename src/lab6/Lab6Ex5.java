package lab6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Lab6Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[]  = new int[n];
		System.out.println("Enter all elements in array");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
//		for( int a : arr) {
//			System.out.print(a +" ");
//		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int e : arr) {
			arrayList.add(e);
		}
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println("Array after sorting");
		System.out.println(arrayList);
		
		System.out.println("Second smallest number in the array is ");
		System.out.println(arrayList.get(1));
	
	}
}
