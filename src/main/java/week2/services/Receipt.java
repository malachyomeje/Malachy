package week2.services;

import week2.product.Product;

public class Receipt {
    private Product productDetails;
    private int totalPrice;

    public int getTotalPrice() {return totalPrice;}
    public void setTotalPrice(int totalPrice) {this.totalPrice = totalPrice;}

    public Product getProductDetails() {return productDetails;}

    public void setProductDetails(Product productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public String toString() {
        return "Here is your Receipt:\n" +
                "**********************\n"+
                productDetails +"\n"+
                "Total Price: "+totalPrice;
    }
}
