package lab6;

import java.util.*;

public class Lab6Ex2 {
	public void countChars() {
		char[] arr = { 'a', '5', 'k', 'k', '5', 'b', 'B' };
//		for (char cha : arr) {
//			System.out.print(cha + " ");
//		}
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (int i = 0; i < arr.length ; i++) {
			if (charCountMap.containsKey(arr[i])) {
				charCountMap.put(arr[i], charCountMap.get(arr[i]) +1);
			}
			else {
				charCountMap.put(arr[i], 1);
			}
//			for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//				System.out.println(entry.getKey()+ "  " + entry.getValue());
//			}
			System.out.println(charCountMap);
		}
	}

	public static void main(String[] args) {
		Lab6Ex2 obj = new Lab6Ex2();
		obj.countChars();

	}

}
