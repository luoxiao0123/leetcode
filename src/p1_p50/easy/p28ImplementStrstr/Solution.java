package p1_p50.easy.p28ImplementStrstr;

public class Solution {
	public int strStr(String haystack, String needle) {
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (needle.equals(haystack.substring(i, i + needle.length())))
				return i;
		}
		return -1;
	}
	
	
	
//	public int strStr(String haystack, String needle) {
//		for(int i = 0; i <= haystack.length() - needle.length(); i++) {
//			if(isPrefix(needle, haystack.substring(i))) return i;
//		}
//		return -1;
//	}
//	
//	public boolean isPrefix(String needle, String str) {
//		return needle.equals(str.substring(0, needle.length()));
//	}
}
