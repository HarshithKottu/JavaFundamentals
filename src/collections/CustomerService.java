package collections;

public class CustomerService {
    void customerDisplay(Customer customer) {
        System.out.println("ID      : " + customer.getId());
        System.out.println("Name    : " + customer.getName());
        System.out.println("E-Mail  : " + customer.getEmail());
    }
}
