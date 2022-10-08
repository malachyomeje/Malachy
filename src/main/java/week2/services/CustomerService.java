package week2.services;
import week2.product.Product;

import java.util.List;

public class CustomerService{
    public String buyProduct(List<Product> myNewProductList, String item, int price, int quantity){
        CashierService serve = new CashierService();
      String buy =   serve.sellItem(myNewProductList, item, price, quantity);
      return buy;
    }
}
