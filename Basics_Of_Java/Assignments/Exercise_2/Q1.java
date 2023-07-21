public class Q1 {

	// declare variable
	private int i;
	private double d;

	// initialize variable
	public void initializeValue(int a, double b) {
		i = a;
		d = b;
		System.out.println("\nValue : " + i);
		System.out.println("Value : " + d);
	}

	// Modify variable
	public void changeValue(int a, double b) {
		i = a;
		d = b;
		System.out.println("\nValue : " + i);
		System.out.println("Value : " + d);
	}

	public static void main(String args[]) {
		Q1 q1 = new Q1();
		q1.initializeValue(2,43.54);
		q1.changeValue(34,42.6543443423);
	}
}
