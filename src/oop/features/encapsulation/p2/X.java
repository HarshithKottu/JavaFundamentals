package oop.features.encapsulation.p2;

import oop.features.encapsulation.p1.A;

public class X {
    public static void main(String[] args) {
        A a; // since the Class A is public can be accessed form other pckg
        a = new A();
        System.out.println(a.x);
        //System.out.println(a.y); cant access: private
        //System.out.println(a.z); cant access: default
        //System.out.println(a.value); cant access default
    }
}
