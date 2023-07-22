package Static.NonStaticInStatic;

public class StaticMethodDemo {

    // Non-static variable
    int instanceVariable = 5;

    // Non-static method
    void instanceMethod() {
        System.out.println("Hyy this is Non Static method");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Hyy this is Static method");

        //gives error non static method or variable are not use in static method or block
//        System.out.println(instanceVariable);
//        instanceMethod();
    }

    public static void main(String[] args) {
        StaticMethodDemo staticMethodDemoObj = new StaticMethodDemo();

        StaticMethodDemo.staticMethod();

        staticMethodDemoObj.instanceMethod();
        System.out.println("Value of Non Static Variable = " + staticMethodDemoObj.instanceVariable);
    }
}
