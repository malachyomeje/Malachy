package week3.services;

import org.junit.jupiter.api.Test;
import week3.person.Customer;
import week3.product.Cart;
import week3.product.Store;
import week3.product.StoreService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashierServiceTest {
    Customer james  = new Customer("James","Benin City", 150_000);
    Cart jamesCart = new Cart();
    CustomerService customerService = new CustomerService();
    CashierService cashierService = new CashierService();
    StoreService storeService = new StoreService();



    @Test
    void shouldReturnCartAddedToQueue() {
        storeService.addItemsToStore();
        customerService.orderItem(jamesCart,james,"macbook",15);
        assertEquals("Cart added to Queue",customerService.addCartToQueue(jamesCart),"You cannot add empty cart to queue");
    }
}
