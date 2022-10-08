package week2.person;

public class Cashier {
    private Person cashier
            ;

    public Cashier(Person cashier) {this.cashier = cashier;}

    public Person getCashier() {return cashier;}

    public void setCashierr(Person cashier) {this.cashier = cashier;}

    @Override
    public String toString(){
        return ""+ cashier;
    }
}
