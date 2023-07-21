class Q3 {
	public static void main(String args[]) {
		String s1 = "Madhur";
		String s2 = "Madhur";
		String s3 = "MADHUR";
		String s4 = new String("Madhur");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
	}
}
