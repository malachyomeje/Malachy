package week2.services;

import week2.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
     private List<Product> customerCheckout = new ArrayList<>();

    public List<Product> getCustomerCheckout() {
        return customerCheckout;
    }
}
