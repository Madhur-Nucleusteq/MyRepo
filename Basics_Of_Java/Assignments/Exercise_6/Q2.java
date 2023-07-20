class Q2 {
	public static void main(String args[]) {

		int arr[] = { 2, 2, 4, 4, 6, 7 };
		double sum = 0;
		double average = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
		}

		average = sum / arr.length;

		System.out.println(average);
	}
}
