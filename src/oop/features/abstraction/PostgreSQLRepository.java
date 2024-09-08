package oop.features.abstraction;

// This is another Database connection. If the client want to change the Database to old one to PostgreSQL or any other DB, we have do the similar steps in connection.
public class PostgreSQLRepository extends Repository{
    @Override
    void connectToDb() {
        System.out.println("Connected to PostgresSQL");
    }

    @Override
    void addCustomerToDb(Customer customer) {
        System.out.println("Customer Data is added to PostGreSQL database successfully");
    }
}
