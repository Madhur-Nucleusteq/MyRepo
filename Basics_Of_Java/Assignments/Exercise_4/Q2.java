class Q2 {
	private static double height;
	private static double base;

	public static double area(double height, double base) {
		return (base * height) / 2;
	}

	public static void main(String args[]) {
		System.out.println(area(12, 5));
	}
}