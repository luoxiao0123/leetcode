package p1_p50.medium.p15ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums.length < 3) return result;
		Arrays.sort(nums);
		int i = 0, numi = nums[i], temp;
		while(i < nums.length - 1 && numi <= 0) {
			if(i > 0 && numi == nums[i - 1]) {
				i++;
				numi = nums[i];
				continue;
			}
			int j = nums.length - 1, numj = nums[j];
			while(j > 0 && numj >= 0) {
				if(j < nums.length - 1 && numj == nums[j + 1]) {
					j--;
					numj = nums[j];
					continue;
				}
				temp = Arrays.binarySearch(nums, - numi - numj);
				if(temp > i && temp < j 
						|| temp == i && numi == nums[i + 1] && numi < 0
								|| temp == j && numj == nums[j - 1] && numj > 0
								|| temp == i && numi == 0 && j > i + 1
								|| temp == j && numj == 0 && j > i + 1) {
					List<Integer> l = new ArrayList<Integer>();
					l.add(numi);
					l.add(- numi - numj);
					l.add(numj);
					result.add(l);
				}
				j--;
				numj = nums[j];
			}
			i++;
			numi = nums[i];
		}
		return result;
	}
}
