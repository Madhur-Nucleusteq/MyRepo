package Inheritance.Hybrid;

//gives error multiple inheritance doesn't supported in java
public class Child extends Parent1,Parent2 {    

    public Child() {
        super.property();
    }

    @Override
    public void property() {
        System.out.println("Child Property");
    }
}
