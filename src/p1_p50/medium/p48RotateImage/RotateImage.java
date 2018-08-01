package p1_p50.medium.p48RotateImage;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] a1 = new int[]{1, 2, 3};
		int[] a2 = new int[]{4, 5, 6};
		int[] a3 = new int[]{7, 8, 9};
		int[][] a = new int[][] {a1, a2, a3};
		s.rotate(a);
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
