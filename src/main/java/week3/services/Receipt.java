package week3.services;

import week3.product.Product;

public class Receipt {
    private Product productDetails;
    private int totalPrice;
    private String customername;

    public String getCustomername() {return customername;}

    public void setCustomername(String customername) {this.customername = customername;}

    public int getTotalPrice() {return totalPrice;}
    public void setTotalPrice(int totalPrice) {this.totalPrice = totalPrice;}

    public Product getProductDetails() {return productDetails;}

    public void setProductDetails(Product productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public String toString() {
        return "\nHere is your Receipt:\n" +
                "**********************\n"+
                productDetails +""+
                "Total Price: "+totalPrice+"\n";
    }
}
