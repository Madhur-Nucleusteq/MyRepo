class Q6 {
	public static void main(String args[]) {
		int num = 125321;
		int originalNumber = num;
		int numberOfDigits = String.valueOf(num).length();
		int reverseNumber = 0;

		for (int i = 0; i < numberOfDigits; i++) {
			int lastDigit = num % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			num = num / 10;
		}
		System.out.println(reverseNumber == originalNumber);
	}
}
