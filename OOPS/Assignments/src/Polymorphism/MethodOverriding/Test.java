package Polymorphism.MethodOverriding;

public class Test {

    public static void main(String[] args) {
        IPhone13 iphone13 = new IPhone13();
        iphone13.camera();
        iphone13.ram();
        iphone13.rom();
        iphone13.battery();
    }
}
