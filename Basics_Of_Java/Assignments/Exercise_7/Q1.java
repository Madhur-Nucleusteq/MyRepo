class Q1 {
	public static void main(String args[]) {
		String s = "Madhur";

		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.concat("Naveen"));

		int position = 3;
		System.out.println(s.charAt(position));

		String startsWith = "Mas";
		System.out.println(s.startsWith(startsWith));

		char c = 'd';
		System.out.println(s.indexOf(c));

		char ch = 'h';
		System.out.println(s.replace(ch, c));
	}
}
