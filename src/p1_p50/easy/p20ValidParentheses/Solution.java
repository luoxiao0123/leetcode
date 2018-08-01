package p1_p50.easy.p20ValidParentheses;

public class Solution {
    public boolean isValid(String s) {
        char[] strchar = new char[s.length()];
        int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(temp == '(' || temp == '[' || temp == '{') {
				strchar[count] = temp;
				count++;
			}else {
				if(count == 0) return false;
				if(temp == ')' && strchar[count - 1] != '(') return false;
				if(temp == ']' && strchar[count - 1] != '[') return false;
				if(temp == '}' && strchar[count - 1] != '{') return false;
				count--;
			}
		}
		if(count == 0) return true;
		return false;
    }
}
