package lab6;


import java.util.*;

public class Lab6Ex3 {
	public void getSquares() {
		int arr[] = {8, 6, 8, 20, 47, 3};
		System.out.println("Given Array is: ");
		for(int e : arr) {
			System.out.print(e + " ");
		}
		Map<Integer, Integer> squareMap = new HashMap<>();
		for (int i = 0; i<arr.length; i++) {
			squareMap.put(arr[i], arr[i] * arr[i]);
		}
//		for(Map.Entry<Integer, Integer> m: squareMap.entrySet()) {
//			System.out.println(m.getKey()+ " " + m.getValue());
//		}
		System.out.println();
		System.out.println("pair of numbers and  square");
		System.out.println(squareMap);
		
	}
	public static void main(String[] args) {
		Lab6Ex3 obj = new Lab6Ex3();
		obj.getSquares();
		
				
	}

}
