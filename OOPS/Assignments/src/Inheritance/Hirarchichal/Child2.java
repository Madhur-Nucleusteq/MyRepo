package Inheritance.Hirarchichal;

public class Child2 extends Parent {

    public Child2() {
        super.property();
    }

    @Override
    public void property() {
        System.out.println("Child 2 Property");
    }
}
