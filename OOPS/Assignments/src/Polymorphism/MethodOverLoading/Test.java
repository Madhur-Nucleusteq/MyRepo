package Polymorphism.MethodOverLoading;

public class Test {

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(12, 32));
        System.out.println(addition.add(12, 34, 32));
        System.out.println(addition.add(12.53, 32.45, 35.25));
        System.out.println(addition.add(12, 43, 32.43));
    }

}
