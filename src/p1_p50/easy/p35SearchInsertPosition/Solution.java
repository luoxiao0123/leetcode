package p1_p50.easy.p35SearchInsertPosition;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int start = 0, end = nums.length, temp;
		while (start != end) {
			temp = nums[(start + end) / 2];
			if(temp == target) return (start + end) / 2;
			else if(temp > target) end = (start + end) / 2;
			else start = (start + end) / 2 + 1;
		}
		return start;
	}
}
