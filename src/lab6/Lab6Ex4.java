package lab6;

import java.util.HashMap;
import java.util.Set;

public class Lab6Ex4 {
	public static void main(String[] args) {
		HashMap<String, Integer> studMarks = new HashMap<>();
		studMarks.put("101", 91);
		studMarks.put("102", 85);
		studMarks.put("103", 71);
		studMarks.put("104", 75);
		studMarks.put("105", 95);
		studMarks.put("106", 88);
//		System.out.println(studMarks);
		
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = studMarks.keySet();
		System.out.println(set);
//		System.out.println(medal);
		for (String s: set) {
			Integer marks = studMarks.get(s);
			if (marks >= 90) {
				medal.put(s, "Gold");	
			}
			else if (marks >= 80 ) {
				medal.put(s, "Silver");
			}
			else if (marks >= 70) {
				medal.put(s, "Bronze");
			}
		}
//		System.out.println(medal);
	}

}
