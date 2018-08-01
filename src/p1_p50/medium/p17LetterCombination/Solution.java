package p1_p50.medium.p17LetterCombination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if(digits.length() == 0) return result;
		if(digits.length() == 1) {
			if(digits.equals("2")) {
				result.add("a");
				result.add("b");
				result.add("c");
			}
			else if(digits.equals("3")) {
				result.add("d");
				result.add("e");
				result.add("f");
			}
			else if(digits.equals("4")) {
				result.add("g");
				result.add("h");
				result.add("i");
			}
			else if(digits.equals("5")) {
				result.add("j");
				result.add("k");
				result.add("l");
			}
			else if(digits.equals("6")) {
				result.add("m");
				result.add("n");
				result.add("o");
			}
			else if(digits.equals("7")) {
				result.add("p");
				result.add("q");
				result.add("r");
				result.add("s");
			}
			else if(digits.equals("8")) {
				result.add("t");
				result.add("u");
				result.add("v");
			}
			else if(digits.equals("9")) {
				result.add("w");
				result.add("x");
				result.add("y");
				result.add("z");
			}
			return result;
		}
		List<String> prefix = letterCombinations(digits.substring(0, digits.length() - 1));
		Iterator<String> it = prefix.iterator();
		String temp;
		while(it.hasNext()) {
			temp = it.next();
			if(digits.charAt(digits.length() - 1) == '2') {
				result.add(temp.concat("a"));
				result.add(temp.concat("b"));
				result.add(temp.concat("c"));
			}
			else if(digits.charAt(digits.length() - 1) == '3') {
				result.add(temp.concat("d"));
				result.add(temp.concat("e"));
				result.add(temp.concat("f"));
			}
			else if(digits.charAt(digits.length() - 1) == '4') {
				result.add(temp.concat("g"));
				result.add(temp.concat("h"));
				result.add(temp.concat("i"));
			}
			else if(digits.charAt(digits.length() - 1) == '5') {
				result.add(temp.concat("j"));
				result.add(temp.concat("k"));
				result.add(temp.concat("l"));
			}
			else if(digits.charAt(digits.length() - 1) == '6') {
				result.add(temp.concat("m"));
				result.add(temp.concat("n"));
				result.add(temp.concat("o"));
			}
			else if(digits.charAt(digits.length() - 1) == '7') {
				result.add(temp.concat("p"));
				result.add(temp.concat("q"));
				result.add(temp.concat("r"));
				result.add(temp.concat("s"));
			}
			else if(digits.charAt(digits.length() - 1) == '8') {
				result.add(temp.concat("t"));
				result.add(temp.concat("u"));
				result.add(temp.concat("v"));
			}
			else if(digits.charAt(digits.length() - 1) == '9') {
				result.add(temp.concat("w"));
				result.add(temp.concat("x"));
				result.add(temp.concat("y"));
				result.add(temp.concat("z"));
			}
		}
		return result;
	}
}
