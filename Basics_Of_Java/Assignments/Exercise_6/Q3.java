import java.util.Arrays;

class Q3 {
	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num = 5;

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < num; i++) {
			int temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
