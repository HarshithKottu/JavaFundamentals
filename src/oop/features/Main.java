package oop.features;

public class Main {
    public static void main(String[] args) {
        /*Employee customer = new Employee();
        customer.displayCustomerDetails();*/

        /*RegularCustomer regularCustomer = new RegularCustomer();
        regularCustomer.displayCustomerDetails();*/

        RegularCustomer regularCustomer = new RegularCustomer(123,"Customer1", "customer1@gmail.com", "+1978847623", 5638763, 45, 2500);
        regularCustomer.displayCustomerDetails();


    }
}
