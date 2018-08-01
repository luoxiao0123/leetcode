package p1_p50.medium.p49GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> strLL = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		String sortStr;
		for(int i = 0; i < strs.length; i++) {
			sortStr = sort(strs[i]);
			if(map.containsKey(sortStr)) {
				List<String> temp = new ArrayList<String>();
				temp = map.get(sortStr);
				temp.add(strs[i]);
				temp.sort(null);
				map.put(sortStr, temp);
			}else {
				List<String> temp = new ArrayList<String>();
				temp.add(strs[i]);
				map.put(sortStr, temp);
			}
		}
		strLL.addAll(map.values());
		return strLL;
	}
	
	public String sort(String str) {
		char [] charstr = str.toCharArray();
		int temp, i, j;
		char swap;
		for(i = 0; i < charstr.length; i++) {
			temp = i;
			for(j = i; j < charstr.length; j++) {
				if(charstr[j] < charstr[temp]) temp = j;
			}
			swap = charstr[i];
			charstr[i] = charstr[temp];
			charstr[temp] = swap;
		}
		return String.valueOf(charstr);
	}
}
