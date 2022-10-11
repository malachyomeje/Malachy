package week3.interfaces;

import week3.person.Customer;
import week3.product.Cart;

public interface CustomerServiceInterface {

    String orderItem(Cart customerCart, Customer customer, String item, int quantity);
    String addCartToQueue(Cart customerCart);

}
