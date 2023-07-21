package Inheritance.MultiLevel;

import Inheritance.Hirarchichal.Child1;

public class SuperChild extends Child1 {

    public SuperChild() {
        super.property();
    }

    @Override
    public void property() {
        System.out.println("Super Child Property");
    }
}
