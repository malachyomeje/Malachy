package week2.person;

public class Customer {
    private Person customer;

    public Customer(Person customer) {
        this.customer = customer;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }


}
