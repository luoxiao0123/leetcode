package p1_p50.hard.p45JumpGameII;

public class Solution {
	public int jump(int[] nums) {
		int returnvalue = 0, needle = 0;
		while (true) {
			if (nums.length - needle == 1) return returnvalue;
			if (nums[needle] >= nums.length - needle - 1) return returnvalue + 1;
			int temp = 1, count = 0;
			for (int i = 1; i <= nums[needle]; i++) {
				if (nums[needle + i] > 0 && i + nums[needle + i] > count) {
					count = i + nums[needle + i];
					temp = needle + i;
				}
			}
			needle = temp;
			returnvalue++;
		}
	}
}
