package oop.features;

import java.util.List;

public class PremiumCustomer extends Customer {
    String membership;

    public PremiumCustomer() {
        System.out.println("PremiumCustomer() is called...");
    }

    public PremiumCustomer(int id, String name, String email, String contactNo, int salary, int age, String membership) {
        super(id, name, email, contactNo, salary, age);
        this.membership = membership;
    }

    // Method Overiding Example: The implementation is different from actual one
    void displayCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("Membership is : " + membership);
    }

    /*// MethodOverloading Example below:
    List<Customer> getCustomers() {
        return null;
    }

    List<Customer> getCustomer(String locations) {
        return null;
    }*/


}
