package collections;

import java.util.HashMap;

// Key value pair
public class MapImpl {
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

        HashMap<Integer, Customer> customerMap = new HashMap<>();
        customerMap.put(001, customer1);
        customerMap.put(002, customer2);
        customerMap.put(003, customer3);
        customerMap.put(004, customer4);
        System.out.println(customerMap);
        System.out.println(customerMap.get(001));
    }
}
