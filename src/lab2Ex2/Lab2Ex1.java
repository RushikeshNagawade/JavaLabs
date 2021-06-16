package lab2Ex2;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Elements in Array");
		int n = sc.nextInt();
		int arr [] = new int [n];
		
		System.out.println("Enter all the elements");
		for ( int i = 0; i <n ; i++) {
			arr [i] = sc.nextInt();
		}
		sc.close();
//		System.out.println("Input Array is");
//		for(int elements : arr) {
//			System.out.print(elements+ "  ");
//		}
		
		Arrays.sort(arr);
//		System.out.printf("Modified arr[] : %s",
//                Arrays.toString(arr));
		
		System.out.println("Second smallest number in the array is");
		System.out.println(arr[1]);
		System.out.println("End");
		}
	}