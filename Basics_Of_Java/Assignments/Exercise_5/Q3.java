class Q3 {
	public static void main(String args[]) {
		int num = 3;
		int factorial = 1;

		for (int i = num; i > 0; i--) {
			factorial = i * factorial;
		}

		System.out.println(factorial);
	}
}
