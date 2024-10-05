package oop.features.encapsulation.p2;

// Requires this import of p1 pckg

import oop.features.encapsulation.p1.A;

public class Y extends A {
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        //System.out.println(a.y); cant access: private
        //System.out.println(a.z); cant access: default
        //System.out.println(a.value); cant access with parent object
        Y y = new Y();
        System.out.println(y.value); // can be access only through child obj
    }
}
