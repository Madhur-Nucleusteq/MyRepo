import java.util.Arrays;

class Q4 {
	public static void main(String args[]) {

		int arr1[][] = { { 1, 2 }, { 3, 4 } };
		int arr2[][] = { { 1, 2 }, { 3, 4 } };
		int sumArr[][] = new int[2][2];

		for (int i = 0; i < arr1[0].length; i++) {
			for (int j = 0; j < arr1[1].length; j++) {
				sumArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		System.out.println(Arrays.toString(sumArr[0]));
		System.out.println(Arrays.toString(sumArr[1]));

	}
}
