package collections;

import java.util.HashSet;

public class SetImpl {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(123);
        customer.setName("Harsha");
        customer.setEmail("harshasemail@gmail.com");
        System.out.println(customer);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Harsha");
        hashSet.add("Bhimavaram");
        hashSet.add("School");
        hashSet.add("School");
        /*hashSet.add(87346578); // It is accepting int value directly. Wrapping: converting primitives to wrapper object
        hashSet.add("Harsha");*/ // This cant be added because it is a duplicate.
        System.out.println(hashSet.size());
        System.out.println(hashSet); // No order
        // To retrieve data from this set:
        for (String str : hashSet) {
            System.out.println(str);
        }
    }
}
