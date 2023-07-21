package Polymorphism.MethodOverLoading;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public int add(int a, int b, double c) {
        return a + b + (int) c;
    }
}
