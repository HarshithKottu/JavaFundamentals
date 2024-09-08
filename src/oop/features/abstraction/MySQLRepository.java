package oop.features.abstraction;

public class MySQLRepository extends Repository{
    @Override
    void connectToDb() {
        System.out.println("connection to MySQL is successful");
    }

    @Override
    void addCustomerToDb(Customer customer) {
        System.out.println("Customer Data is added to MySQL database successfully");
    }

}
