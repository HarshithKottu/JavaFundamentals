package oop.features;

public class Customer {
    int id;
    public String name;
    String email;
    String contactNo;
    int salary;
    int age;

    // No Org Constructor
    public Customer() {
        System.out.println("Employee() is called...");
    }

    // Arg Constructor
    public Customer(int id, String name, String email, String contactNo, int salary, int age) {
        System.out.println("Employee(int, String, String, String, int, int) is called..");
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.salary = salary;
        this.age = age;
    }

    void displayCustomerDetails() {
        System.out.println("Id : " + id);
        System.out.println("name : " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Contact No : " + contactNo);
        System.out.println("Salary : " + salary);
        System.out.println("Age : " + age);
    }

}
