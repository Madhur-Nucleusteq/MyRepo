class Q1 {
	public static void main(String args[]) {

		int arr[] = { 1114, 6, 121, 9, 24, 88 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}
}
