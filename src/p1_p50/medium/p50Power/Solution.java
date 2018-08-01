package p1_p50.medium.p50Power;

public class Solution {
	public double myPow(double x, int n) {
        if(x == 1) return 1;
        if(n == 0) return 1;
		double pow = 1;
		double powtemp;
		if(n > 0) powtemp = x;
		else powtemp = 1 / x;
		while(n != 0) {
			if(n % 2 != 0) pow *= powtemp;
			powtemp = powtemp * powtemp;
			n /= 2;
		}
		return pow;
	}
}
