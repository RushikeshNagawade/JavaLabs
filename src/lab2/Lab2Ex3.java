package lab2;

import java.util.*;
import java.util.Scanner;

public class Lab2Ex3 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in array");
		int n = sc.nextInt();
		int arr [] = new int [n];
		
		System.out.println("Enter all the elements in the array");
			for( int i = 0; i< n ; i++) {
			arr [i] = sc.nextInt();
		}
			sc.close();
//			System.out.println("Input array is:");
//			for(int elements : arr) {
//				System.out.print(elements+"  ");
//			}
			
			String str = Arrays.toString(arr);
//			System.out.println("int Array as String in Java:" + str);
			
			String input = str;
			StringBuilder input1 = new StringBuilder();
			input1.append(input);
			input1.reverse();
			System.out.println(input1);
			System.out.println("End");
	
			
		}
	}


