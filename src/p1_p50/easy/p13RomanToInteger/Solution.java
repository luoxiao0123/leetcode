package p1_p50.easy.p13RomanToInteger;

public class Solution {
	public int romanToInt(String s) {
		int num = 0;
		char[] str = s.toCharArray();
		for(int i = 0; i < str.length; i++) {
			switch(str[i]) {
			case 'M': num += 1000; break;
			case 'D': num += 500; break;
			case 'C':
				if(i != str.length - 1 && (str[i + 1] == 'D' || str[i + 1] == 'M')) {
					num -= 100; break;
				}else num += 100; break;
			case 'L': num += 50; break;
			case 'X':
				if(i != str.length - 1 && (str[i + 1] == 'L' || str[i + 1] == 'C')) {
					num -= 10; break;
				}else num += 10; break;
			case 'V': num += 5; break;
			case 'I': 
				if(i != str.length - 1 && (str[i + 1] == 'V' || str[i + 1] == 'X')) {
					num -= 1; break;
				}else num += 1; break;
			default: return num;
			}
		}
		return num;
	}
}
