package oop.features.abstraction;

public abstract class Repository {
    abstract void connectToDb();
    abstract void addCustomerToDb(Customer customer);
    // Difference between Interface and abstract Class
    // In interface we can write both abstract and Non-abstract methods
    // But in Abstract methods we can only write abstract methods.
}
