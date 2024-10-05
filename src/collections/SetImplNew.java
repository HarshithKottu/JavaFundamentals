package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetImplNew {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(001);
        customer1.setName("Harsha");
        customer1.setEmail("harshasemail@gmail.com");
        System.out.println(customer1);

        Customer customer2 = new Customer();
        customer2.setId(002);
        customer2.setName("Sai");
        customer2.setEmail("Sai@gmail.com");
        System.out.println(customer2);

        Customer customer3 = new Customer();
        customer3.setId(003);
        customer3.setName("Kottu");
        customer3.setEmail("kottu@gmail.com");
        System.out.println(customer3);

        Customer customer4 = new Customer();
        customer4.setId(003);
        customer4.setName("Kottu");
        customer4.setEmail("kottu@gmail.com");
        System.out.println(customer4);

        // Generally the below Hashset with object doesnt have ability to filter duplicates so we added Equals and hashcode in
        HashSet<Customer> customers = new HashSet<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        System.out.println(customers);

        // We can now get the insertion order by using "LinkedHashSet"

        // We can sort the customers using TreeSet
        //
        TreeSet<Customer> customerList = new TreeSet<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        System.out.println(customerList);
    }
}
