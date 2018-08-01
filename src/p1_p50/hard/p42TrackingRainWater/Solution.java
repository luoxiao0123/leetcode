package p1_p50.hard.p42TrackingRainWater;

public class Solution {
	public int trap(int[] height) {
		int l = height.length;
		int[] left = new int[l];
		int[] right = new int[l];
		for(int i = 0; i < l; i++) {
			if(i > 0 && left[i - 1] > height[i]) left[i] = left[i - 1];
			else left[i] = height[i];
		}
		for(int i = l - 1; i >= 0; i--) {
			if(i < l - 1 && right[i + 1] > height[i]) right[i] = right[i + 1];
			else right[i] = height[i];
		}
		int sum = 0;
		for(int i = 0; i < l; i++) {
			if(left[i] - height[i] > right[i] - height[i]) {
				sum += right[i] - height[i];
			}else {
				sum += left[i] - height[i];
			}
		}
		return sum;
	}
}
