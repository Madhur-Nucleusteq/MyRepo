package Inheritance.MultiLevel;

import Inheritance.Hirarchichal.Parent;

public class Child extends Parent {

    public Child() {
        super.property();
    }

    @Override
    public void property() {
        System.out.println("Child Property");
    }
}
