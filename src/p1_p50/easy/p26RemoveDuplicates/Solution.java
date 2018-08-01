package p1_p50.easy.p26RemoveDuplicates;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[count]) {
				count++;
				nums[count] = nums[i];
			}
		}
		return ++count;
	}
}
