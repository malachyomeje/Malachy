package week3.person;

public class Customer {
    private String name;
    private String address;
    private long accountBalance;

    public Customer(String name, String address,long accountBalance) {
        this.name = name;
        this.address = address;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }
}
