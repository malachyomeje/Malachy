package week3.services;

import org.junit.jupiter.api.Test;
import week3.person.Customer;
import week3.product.Cart;
import week3.product.StoreService;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerServiceTest {
    Customer james  = new Customer("James","Benin City", 290000);
    Cart jamesCart = new Cart();
    CustomerService customerService = new CustomerService();
    CashierService cashierService = new CashierService();
    StoreService storeService = new StoreService();

    @Test
    void shouldReturnItemAddedToCArt() {
        storeService.addItemsToStore();
        assertEquals("Added  Macbook to Cart",customerService.orderItem(
                        jamesCart, james, "macbook",15),
                "The product is either unavailable or insufficient funds");
    }

    @Test
    void shouldReturnItemSoldSuccessfully() {
        storeService.addItemsToStore();
        customerService.orderItem(jamesCart,james,"macbook",15);
        customerService.addCartToQueue(jamesCart);
        assertEquals("Items Sold successfully",cashierService.checkOut(),"The queue is empty");
    }
}