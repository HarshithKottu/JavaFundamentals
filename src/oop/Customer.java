package oop;

public class Customer {
    // state (data)
    //instance variables
    int id;
    public String name;
    String email;
    String contactNo;
    int salary;

    int age;


    //constructor
    //no-arg
    //No return types for this, starts with capital letter.
    //Used in the case when only one object is being constructed in the main class.
    public Customer(){
        System.out.println("Employee is called..");
        id = 1111;
        name = "Cust1";
        email = "Cust1@gmail.com";
        contactNo = "+919483568346";
        salary = 7543874;
        age = 54;
    }


    public Customer(int id, String name, String email, String contactNo, int salary, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.salary = salary;
        this.age = age;
    }
}
