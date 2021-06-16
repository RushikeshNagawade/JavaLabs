package lab2;
import java.util.*;
import java.util.HashMap;
public class Lab2Ex4 {
	
	public void removeDups(int[] a, int n) {
		HashMap<Integer, Boolean> mp = new HashMap<>();
		for(int i=0; i<n; i++) {
			if (mp.get(a[i]) == null) {
				System.out.println(a[i] + " ");
				mp.put(a[i], true);
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of element in the array");
		int n = sc.nextInt();
		int arr [] = new int [n];
		
		System.out.println("Enter elements of the array");
		for(int i = 0 ; i < n ; i++) {
			arr [i] = sc.nextInt();
		}
	
		
				
	}

}