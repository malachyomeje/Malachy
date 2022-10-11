package week3.services;
import week3.exceptions.CartException;
import week3.interfaces.CustomerServiceInterface;
import week3.person.Customer;
import week3.product.Cart;
import week3.product.Product;
import week3.product.Store;

import java.util.List;
import java.util.PriorityQueue;

public class CustomerService implements CustomerServiceInterface {
    //private Cart customerCart = new Cart();
    CashierService cashierService = new CashierService();
    private List<Product> myNewProductList = Store.getMyproductList();
    //public Cart getCustomerCart() {return customerCart;}

    public String orderItem(Cart customerCart, Customer customer, String item, int quantity) {
        try {
            if (quantity <= 0)
                throw new CartException("Quantity must be greater than zero");

            for (Product product : myNewProductList) {
                if ((item.equalsIgnoreCase(product.getProductName()))) {

                    if (customer.getAccountBalance() >= (long) product.getProductPrice() * quantity) {

                        if (quantity <= product.getProductQuantity()) {
                            Product newProduct = new Product(
                                    product.getProductCategory(),
                                    product.getProductID(),
                                    product.getProductName(),
                                    product.getProductPrice(),
                                    quantity
                            );
                            //ADD PRODUCT TO CUSTOMERS CART
                            customerCart.getCartList().add(newProduct);

                            //System.out.println("Added  " + product.getProductName() + " to Cart");
                            return "Added  " + product.getProductName() + " to Cart";
                        } else {
                            //System.out.println("product out of stock or less than the quantity entered");
                            return "Product is out of stock or less than your required quantity";
                        }
                    } else {
                        //System.out.println("Insufficient funds");
                        return "Insufficient funds";
                    }
                }
            }
            System.out.println("Item Not found in store");

        } catch (CartException e) {
            System.out.println(e.getMessage());
        }
        return "product not found";
    }
        //METHOD TO ADD CART TO QUEUE
    public String addCartToQueue(Cart customerCart) {
        if (customerCart.getCartList().size() > 0) {
            CashierService.getCheckOutPriorityQueue().add(customerCart);
            return "Cart added to Queue";
        }
        return "Cart is empty";
    }
}
