package lab2;

import java.util.Arrays;

import java.util.Scanner;

// Accept array of string, divide in half, left half in uppercase, right half in lowercase, return the resulting array.

public class Lab2Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in the array");
		int num = sc.nextInt();
		int arraySize;
		String[] stringArray = new String[num];
		
		for (int i = 0; i < stringArray.length; i++) {
//			System.out.println(i);
			System.out.println("Enter elements in the array");
			stringArray[i] = sc.next(); 
		}
		sc.close();
		System.out.println("Initial Array: "+Arrays.toString(stringArray));
		System.out.println();
//		for (String str : stringArray) {
//			System.out.println(str);
//		}
		
		Arrays.sort(stringArray);
		System.out.println("Sorted Array: " +Arrays.toString(stringArray));
		System.out.println();
		
//		for(int j = 0; j<stringArray.length/2; j++) {
//			
//		}if(stringArray.length % 2 == 0) {
//			System.out.println();
//			
//		}
//		List<String> list = Arrays.asList(stringArray);
//		System.out.println(list);
		System.out.println("Updated array is:");
		if (num % 2 != 0) {
			arraySize = stringArray.length +1;
		} else {
			arraySize = stringArray.length;
			}
		for (int k = 0; k<arraySize/2; k++) {
			System.out.print(stringArray[k].toUpperCase() + " ");
		}
		for (int l = arraySize/2; l < stringArray.length; l++) {// keep l less than string array length else index out of bound exception
			System.out.print(stringArray[l].toLowerCase() + " ");
		}
		
	}

}
