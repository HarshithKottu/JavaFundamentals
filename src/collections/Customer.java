package collections;

import java.util.Objects;

// Java Bean Class example || Model Class
public class Customer implements Comparable<Customer> {
    // The above implements is used to USe Tree set in the impl and it is overrides as in the below
    private int id;
    private String name;
    private String email;

    // No Arg Constructor only allowed in Java Beans Object
    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // This method is constructed to overide the return value of customer reference with actual values
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Method for equals and Hash code : Which is used to remove duplicates in objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    // for a impl of Tree Set we are factoring the sorting order based on an element here.
    @Override
    public int compareTo(Customer o) {
        // compare|sorting based on name here
        return this.name.compareTo(o.getName());
    }
}
