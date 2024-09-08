package arrays;

import oop.Customer;

public class ArrayReference {
    public static void main(String[] args) {
        Customer[] customers;
        customers = new Customer[3];
        //System.out.println(customers[1]);
        customers[0] = new Customer();
        customers[1] = new Customer(123, "Customer1", "custom1@gmail.com", "84736582", 43947, 23);
        customers[2] = new Customer(223, "Customer2", "custom2@gmail.com", "35834634", 55373, 56);
        // we can also initialise the customers in a single line as follows:
        Customer[] customers1 = {new Customer(),
                new Customer(123, "Customer1", "custom1@gmail.com", "84736582", 43947, 23),
                new Customer(223, "Customer2", "custom2@gmail.com", "35834634", 55373, 56)
        };
        System.out.println(customers1.length);
        for (Customer customer : customers1) {
            System.out.println(customer.name);
        }
    }
}
