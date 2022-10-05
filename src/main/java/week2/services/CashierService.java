package week2.services;

import week2.exceptions.CartException;
import week2.product.Product;

import java.util.ArrayList;
import java.util.List;

public class CashierService {
    Receipt productReceipt;
    public Cart customerCart = new Cart();
    public void sellItem(List<Product> myNewProductList, String item, int price, int quantity) {
        //String results;
        try {
            if (quantity <= 0)
                throw new CartException("Quantity must be greater than zero");

            for (Product product : myNewProductList) {
                if ((item.equalsIgnoreCase(product.getProductName())) &&
                        (price >= product.getProductPrice() * quantity) &&
                        (quantity <= product.getProductQuantity())
                ) {
                    customerCart.getCustomerCheckout().add(product);
                    System.out.println(product);
                    break;
                } else if ((item.equalsIgnoreCase(product.getProductName())) &&
                        (price < product.getProductPrice() * quantity)
                ) {
                    System.out.println("Insufficient funds");
                    break;
                } else if ((item.equalsIgnoreCase(product.getProductName())) &&
                        (quantity > product.getProductQuantity()) &&
                        product.getProductQuantity() != 0
                ) {
                    int available = product.getProductQuantity();
                    System.out.println("Only " + available + " Available");
                    break;
                } else if ((item.equalsIgnoreCase(product.getProductName())) &&
                        (quantity > product.getProductQuantity()) &&
                        product.getProductQuantity() == 0
                ) {
                    int available = product.getProductQuantity();
                    System.out.println("Product out of Stock");
                    break;
                } else if (!(item.equalsIgnoreCase(product.getProductName()))) {
                    System.out.println("Product not found");
                    break;
                }
            }

        } catch (CartException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(customerCart.getCustomerCheckout().size());
    }

}



