package Polymorphism.MethodOverriding;

public class IPhone12 extends Mobile {

    @Override
    public void camera() {
        System.out.println("12MP");
    }

    @Override
    public void ram() {
        System.out.println("6GB");
    }

    @Override
    public void rom() {
        System.out.println("256GB");
    }

    @Override
    public void battery() {
        System.out.println("4000MAh");
    }
}
