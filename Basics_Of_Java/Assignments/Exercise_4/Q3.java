import java.util.Scanner;

class Q3 {

	public static double discriminant(int a, int b, int c) {
		int D = (b * b) - 4 * a * c;
		return D;
	}

	public static void main(String args[]) {
		double x1;
		double x2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a = ");
		int a = sc.nextInt();
		System.out.print("Enter value of b = ");
		int b = sc.nextInt();
		System.out.print("Enter value of c = ");
		int c = sc.nextInt();

		// Calculate the discriminant using the provided values of a, b, and c
		double D = discriminant(a, b, c);

		// Check if the discriminant is non-negative to have real roots
		if (D >= 0) {
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);1
			

			System.out.print("Roots are = " + x1 + " and " + x2);
		} else {
			System.out.print("No real roots exist.");
		}
	}
}
