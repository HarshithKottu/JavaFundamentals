package oop.features.abstraction;


public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(123,"Customer1", "customer1@gmail.com", "+1978847623", 5638763, 45);
        /*CustomerService customerService = new CustomerService();
        customerService.addCustomerToDb(customer);*/
        MySQLRepository repository = new MySQLRepository();
        //if there is new DB, then we can create as below and pass the repository to impl
        PostgreSQLRepository repository1 = new PostgreSQLRepository();
        CustomerServiceImpl customerService = new CustomerServiceImpl(repository1);
        customerService.addCustomerToDb(customer);
    }
}
