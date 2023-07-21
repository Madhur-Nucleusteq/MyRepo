package Inheritance.Hirarchichal;

public class Child1 extends Parent {

    public Child1() {
        super.property();
    }

    @Override
    public void property() {
        System.out.println("Child 1 Property");
    }
}
