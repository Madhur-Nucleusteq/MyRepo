class Q4 {
	public static void main(String args[]) {
		int number = 153;
		int originalNumber = number;
		int numberOfDigits = String.valueOf(number).length();
		int sum = 0;

		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numberOfDigits);
			number /= 10;
		}

		System.out.println(sum == originalNumber);
	}
}
