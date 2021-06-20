package lab6;

import java.util.HashMap;
import java.util.Set;


public class Lab6Ex4Retry {
	public static void main(String[] args) {

	HashMap<String, Integer> studMarks = new HashMap<>();
	studMarks.put("101", 91);
	studMarks.put("102", 85);
	studMarks.put("103", 71);
	studMarks.put("104", 75);
	studMarks.put("105", 95);
	studMarks.put("106", 88);
	System.out.println(studMarks);
	
	HashMap<String, String> medal = new HashMap<>();
	Set<String> set = studMarks.keySet();
	for(String e: set) {
		Integer marks = studMarks.get(e);
		if ( marks >= 90) {
			medal.put(e, "Gold");
		} else if ( marks >= 80) {
			medal.put(e, "Silver");
		} else if ( marks >= 70) {
			medal.put(e, "Bronze");
		}
		}
		System.out.println(medal);
	}
}
