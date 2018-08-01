package p1_p50.medium.p11ContainerWithMostWater;

public class Solution {
	public int maxArea(int[] height) {
		int max = 0, temp, h1 = 0, h2 = 0;
		for (int i = 0; i < height.length; i++) {
			if (h1 > height[i]) continue;
			h1 = height[i];
			h2 = 0;
			for (int j = height.length - 1; j > i; j--) {
				if (height[j] >= height[i]) {
					temp = height[i] * (j - i);
					if (temp > max) max = temp;
					break;
				}
				if (h2 > height[j]) continue;
				h2 = height[j];
				temp = height[j] * (j - i);
				if (temp > max) max = temp;
			}
		}
		return max;
	}
}
