package oop.features;

public class RegularCustomer extends Customer {
    int cashbackPoints;
    public RegularCustomer(){
        System.out.println("RegularCustomer() is called..");
    }

    public RegularCustomer(int id, String name, String email, String contactNo, int salary, int age, int cashbackPoints) {
        super(id, name, email, contactNo, salary, age);
        this.cashbackPoints = cashbackPoints;
    }

    void displayCustomerDetails() {
        // invoking parent class properties
        super.displayCustomerDetails();
        System.out.println("cashback points is : " + cashbackPoints);
    }

}
