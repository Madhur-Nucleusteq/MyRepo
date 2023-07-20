class Q1 {
	int a = 0;
	int b = 0;

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtaction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static int modulus(int a, int b) {
		return a % b;
	}

	public static void main(String args[]) {
		System.out.println(addition(12, 24));
		System.out.println(subtaction(42, 12));
		System.out.println(multiplication(12, 2));
		System.out.println(division(12, 4));
		System.out.println(modulus(13, 4));
	}
}