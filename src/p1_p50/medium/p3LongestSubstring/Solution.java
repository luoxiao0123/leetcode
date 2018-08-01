package p1_p50.medium.p3LongestSubstring;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int l = s.length();
		int[] a = new int[l];
		int length = 0;
		for(int i = 0; i < l; i++) {
			a[i] = 1;
			for(int j = i - 1; j >= 0; j--) {
				if(s.charAt(j) == s.charAt(i)) break;
				a[i]++;
			}
			if(a[i] > a[i - 1] + 1) a[i] = a[i - 1] + 1;
			if(a[i] > length) length = a[i];
		}
		return length;
	}
}
