package Polymorphism.MethodOverriding;

public class IPhone13 extends IPhone12 {

    public IPhone13() {
        super.camera();
        super.ram();
        super.rom();
        super.battery();
    }

    @Override
    public void camera() {
        System.out.println("\n50MP");
    }

    @Override
    public void ram() {
        System.out.println("8GB");
    }

    @Override
    public void rom() {
        System.out.println("512GB");
    }

    @Override
    public void battery() {
        System.out.println("5000MAh");
    }
}
