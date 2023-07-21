package FinalKeyword.FinalVariable;

public final class Test {

    public static void main(String[] args) {
        String name = "Madhur";
        final int age = 21;

        System.out.println(name);
        System.out.println(age);

        name = "Naveen";
        //dont change value of final keyword
        age = 22;

        System.out.println(name);
        System.out.println(age);
    }
}
