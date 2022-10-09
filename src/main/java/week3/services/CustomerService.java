package week3.services;
import week3.exceptions.CartException;
import week3.product.Cartrrrrr;
import week3.product.Product;

import java.util.List;

public class CustomerService{
    //Cart customerCart = new Cart();
    public String orderItem(List<Product> myNewProductList, String item, int price, int quantity) {
        try {
            if (quantity <= 0)
                throw new CartException("Quantity must be greater than zero");

            for (Product product: myNewProductList) {
                if ((item.equalsIgnoreCase(product.getProductName())))

                    if (price >= product.getProductPrice() * quantity) {

                        if (quantity <= product.getProductQuantity()) {
                            product.setProductQuantity(quantity);
                            Cartrrrrr.getCart().add(product);
                            return "Added item to cart";
                        } else {
                            return "Product is out of stock or less than your required quantity";
                        }
                    } else {
                        return "Insufficient funds";
                    }
            }
        } catch (CartException e) {
            System.out.println(e.getMessage());
        }
        return "product not found";

    }


}
