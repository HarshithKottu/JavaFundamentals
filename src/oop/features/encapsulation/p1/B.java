package oop.features.encapsulation.p1;

public class B {
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        //System.out.println(a.y); cant access: private
        System.out.println(a.z);
        System.out.println(a.value);
    }
}
