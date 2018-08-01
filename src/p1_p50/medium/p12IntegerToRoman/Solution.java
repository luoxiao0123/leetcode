package p1_p50.medium.p12IntegerToRoman;

public class Solution {
	public String intToRoman(int num) {
		StringBuffer s = new StringBuffer();
		int thousand = num / 1000;
		num = num % 1000;
		switch (thousand) {
		case 1: s.append("M"); break;
		case 2: s.append("MM"); break;
		case 3: s.append("MMM"); break;
		default: break;
		}
		int hundred = num / 100;
		num = num % 100;
		switch(hundred) {
		case 1: s.append("C"); break;
		case 2: s.append("CC"); break;
		case 3: s.append("CCC"); break;
		case 4: s.append("CD"); break;
		case 5: s.append("D"); break;
		case 6: s.append("DC"); break;
		case 7: s.append("DCC"); break;
		case 8: s.append("DCCC"); break;
		case 9: s.append("CM"); break;
		default: break;
		}
		int ten = num / 10;
		num = num % 10;
		switch(ten) {
		case 1: s.append("X"); break;
		case 2: s.append("XX"); break;
		case 3: s.append("XXX"); break;
		case 4: s.append("XL"); break;
		case 5: s.append("L"); break;
		case 6: s.append("LX"); break;
		case 7: s.append("LXX"); break;
		case 8: s.append("LXXX"); break;
		case 9: s.append("XC"); break;
		default: break;
		}
		switch(num) {
		case 1: s.append("I"); break;
		case 2: s.append("II"); break;
		case 3: s.append("III"); break;
		case 4: s.append("IV"); break;
		case 5: s.append("V"); break;
		case 6: s.append("VI"); break;
		case 7: s.append("VII"); break;
		case 8: s.append("VIII"); break;
		case 9: s.append("IX"); break;
		default: break;
		}
		return s.toString();
	}

}
