package p1_p50.hard.p41FirstMissingPositive;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		int l = nums.length, temp;
		for(int i = 0; i < l; i++) {
			while(nums[i] > 0 && nums[i] <= l) {
				temp = nums[i];
				if(temp == nums[temp - 1]) break;
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			}
		}
		for(int j = 0; j < l; j++) {
			if(nums[j] != j + 1) return j + 1;
		}
		return l + 1;
	}
}
