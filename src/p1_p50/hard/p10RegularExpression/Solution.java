package p1_p50.hard.p10RegularExpression;

public class Solution {
	public boolean isMatch(String s, String p) {
		if (s.equals("")) {
			if(p.equals("")) return true;
			if(p.length() == 1) return false;
			if(p.charAt(1) == '*') return isMatch(s, p.substring(2));
			return false;
		}
		if(p.equals("")) return false;
		if(p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)) {
			if(p.length() == 1) return false;
			if(p.charAt(1) == '*') return isMatch(s, p.substring(2));
		}
		if(p.length() == 1) return isMatch(s.substring(1), p.substring(1));
		if(p.charAt(1) == '*') 
			return isMatch(s.substring(1), p) 
					|| isMatch(s, p.substring(2));
		return isMatch(s.substring(1), p.substring(1));
	}
}
