package week2.product;

public class Product{
    private String productCategory;
    private int productID;
    private String productName;
    private int productPrice;
    private int productQuantity;

    public Product(String productCategory, int productID, String productName, int productPrice, int productQuantity) {
        this.productCategory = productCategory;
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductCategory() {return productCategory;}

    public void setProductCategory(String productCategory) {this.productCategory = productCategory;}

    public int getProductID() {return productID;}

    public void setProductID(int productID) {this.productID = productID;}

    public String getProductName() {return productName;}

    public void setProductName(String productName) {this.productName = productName;}

    public int getProductPrice() {return productPrice;}

    public void setProductPrice(int productPrice) {this.productPrice = productPrice;}

    public int getProductQuantity() {return productQuantity;}

    public void setProductQuantity(int productQuantity) {this.productQuantity = productQuantity;}

    @Override
    public String toString(){
       return "Category: "+productCategory + " \n" +
               "ID: "+productID+ " \n"+
               "Item: "+productName + " \n"+
               "Unit Price: "+productPrice + " \n"+
               "Quantity: "+productQuantity;
    }
}
