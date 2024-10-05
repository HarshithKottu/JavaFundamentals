package oop.features.abstraction;

// This is the place where abstraction takes place (remember the example restaurant serving). we will hide the actual implementation and use separate class for the impl
public abstract class CustomerService {


    /*void addCustomerToDb(Employee customer) {
        System.out.println("Employee object is added to MySQL successfully");
        // code to connect mysql
        // if there is any change in DB and it is the only place where you make changes.
    }*/
    // Now we have to hide the above implementation

    // methods without a body are called Abstract methods
    abstract void addCustomerToDb(Customer customer);   //we should give abstract keyword if we define the class as abstract.
}
