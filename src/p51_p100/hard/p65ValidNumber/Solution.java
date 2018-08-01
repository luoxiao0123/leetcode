package p51_p100.hard.p65ValidNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public boolean isNumber(String s) {
        String regex = "^[ |\t]*[+-]?(\\d+(\\.\\d*)?|\\.\\d+)(e[+-]?\\d+)?[ |\t]*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
        return matcher.find();
	}
}
