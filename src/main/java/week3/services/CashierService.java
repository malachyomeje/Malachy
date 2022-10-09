package week3.services;

import week3.product.Product;
import java.util.List;

    public class CashierService {
     CustomerService customerService = new CustomerService();
    public String buyProduct(List<Product> myNewProductList, String item, int price, int quantity){
        return customerService.orderItem(myNewProductList, item, price, quantity);
    }
}