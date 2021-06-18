package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab6Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records you need to store: ");
		int num = sc.nextInt();

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter name(String)");
			String name = sc.next();
			System.out.println("Enter age(Integer)");
			int age = sc.nextInt();
			hmap.put(name, age);
			sc.close();
		}
		System.out.println("");
		for (Map.Entry<String, Integer> mp : hmap.entrySet()) {
			System.out.print("\n" + mp.getKey() + " " + mp.getValue());
		}
		System.out.println("\nArray after sorting");
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(hmap);
		for (Map.Entry<String, Integer> mp : tm.entrySet()) {
			System.out.print("\n" + mp.getKey() + " " + mp.getValue());
		}
		ArrayList<String> keyList = new ArrayList<String>(tm.keySet());
		ArrayList<Integer> valueList = new ArrayList<Integer>(tm.values());
		
		System.out.println("\nnames are: " + keyList );
		System.out.println("\nage are: " + valueList);
	}

}
