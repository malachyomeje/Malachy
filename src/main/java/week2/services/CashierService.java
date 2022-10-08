package week2.services;

import week2.exceptions.CartException;
import week2.product.Product;
import java.util.List;

public class CashierService {
    public String sellItem(List<Product> myNewProductList, String item, int price, int quantity) {
        try {
            if (quantity <= 0)
                throw new CartException("Quantity must be greater than zero");

        for (Product product: myNewProductList) {
            if ((item.equalsIgnoreCase(product.getProductName())))

                if (price >= product.getProductPrice() * quantity) {

                    if (quantity <= product.getProductQuantity()) {

                        Receipt salesReceipt = new Receipt();
                        product.setProductQuantity(quantity);
                        salesReceipt.setProductDetails(product);
                        salesReceipt.setTotalPrice(quantity* product.getProductPrice());

                        return salesReceipt.toString();
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