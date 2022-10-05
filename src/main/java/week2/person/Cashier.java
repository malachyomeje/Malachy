package week2.person;

public class Cashier {
    private PersonImpl manager;

    public Cashier(PersonImpl cashier) {
        this.manager = cashier;
    }

    public PersonImpl getCashier() {
        return manager;
    }

    public void setCashierr(PersonImpl manager) {
        this.manager = manager;
    }
}
