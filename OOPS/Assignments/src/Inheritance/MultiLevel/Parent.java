package Inheritance.MultiLevel;

import Inheritance.Hirarchichal.Child3;

public class Parent extends Child3 {

    public Parent() {
        super.property();
    }

    public void property() {
        System.out.println("Fathers Property");
    }
}
