package p1_p50.easy.p38CountAndSay;

public class Solution {
	public String countAndSay(int n) {
		String s = new String("1");
		for(int i = 1; i < n; i++) {
			s = once(s);
		}
		return s;
	}
	
	public String once(String s) {
		StringBuffer strbuf = new StringBuffer("");
		int count = 1, i;
		for(i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1)) {
				count++;
			}else {
				strbuf.append(count).append(s.charAt(i - 1));
				count = 1;
			}
		}
		strbuf.append(count).append(s.charAt(i - 1));
		return strbuf.toString();
	}
}
