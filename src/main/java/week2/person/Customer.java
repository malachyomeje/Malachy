package week2.person;

public class Customer {
    private PersonImpl customer;

    public Customer(PersonImpl customer) {
        this.customer = customer;
    }

    public PersonImpl getCustomer() {
        return customer;
    }

    public void setCustomer(PersonImpl customer) {
        this.customer = customer;
    }
}
