package p1_p50.easy.p14LongestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		if(strs.length == 1) return strs[0];
		int count = 0;
		boolean flag = false;
		while(true) {
			for(int i = 0; i < strs.length; i++) {
				if(strs[i].length() <= count) {
					flag = true;
					break;
				}
				if(i > 0 && strs[i].charAt(count) != strs[i - 1].charAt(count)) {
					flag = true;
					break;
				}
			}
			if(flag) break;
			count++;
		}
		return strs[0].substring(0, count);
	}
}
