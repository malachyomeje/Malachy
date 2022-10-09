package week3.product;

import week3.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Customer customer;
    private List<Product> cartList = new ArrayList<Product>();

    public Cart(Customer customer, List<Product> cartList) {
        this.customer = customer;
        this.cartList = cartList;
    }

    public Customer getCustomer() {return customer;}

    public void setCustomer(Customer customer) {this.customer = customer;}

    public List<Product> getCartList() {return cartList;}

    public void setCartList(List<Product> cartList) {this.cartList = cartList;}
}
