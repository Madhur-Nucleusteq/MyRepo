package FinalKeyword.FinalMethod;

public class Iphone13 extends Iphone12 {

    @Override
    public void camera() {
        System.out.println("\n48MP");
    }

    @Override
    public void battery() {
        System.out.println("5000MAh");
    }

    @Override
    public void ram() {
        System.out.println("8GB");
    }

    //cannot inherit final method
    @Override
    public final void operatingSystem() {
        System.out.println("IOS");
    }
}
