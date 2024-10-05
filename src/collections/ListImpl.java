package collections;

import java.util.ArrayList;

public class ListImpl {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
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

        // ArrayList maintains insertion order
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        System.out.println(customerList.size());
        System.out.println(customerList);

        CustomerService customerService = new CustomerService();
        for (Customer customer : customerList) {
            //System.out.println(customer);
            customerService.customerDisplay(customer);
        }
    }
}
