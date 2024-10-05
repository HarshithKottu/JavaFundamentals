package oop.features.abstraction;

public class CustomerServiceImpl extends CustomerService {

    // I added this after overriding below method
    Repository repository;

    public CustomerServiceImpl(Repository repository) {
        this.repository = repository;
    }

    // if we do not implement below implementation it gives error as we extended this class with Employee service.
    // Now we override the class by adding impl. Where polymorphism involved here
    @Override
    void addCustomerToDb(Customer customer) {
        repository.connectToDb();
        repository.addCustomerToDb(customer);
    }
}
