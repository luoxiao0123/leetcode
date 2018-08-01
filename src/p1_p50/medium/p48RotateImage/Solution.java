package p1_p50.medium.p48RotateImage;

public class Solution {
	public void rotate(int[][] matrix) {
		int l = matrix.length;
		int temp;
		for(int i = 0; i < l; i++) {
			for(int j = i; j < l - i - 1; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[l - j - 1][i];
				matrix[l - j - 1][i] = matrix[l - i - 1][l - j - 1];
				matrix[l - i - 1][l - j - 1] = matrix[j][l - i - 1];
				matrix[j][l - i - 1] = temp;
			}
		}
	}
}
