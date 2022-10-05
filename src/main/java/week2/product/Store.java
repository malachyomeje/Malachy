package week2.product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.Integer.parseInt;

public  class Store{

    private Product newItem;
    private  static final ArrayList<Product> myproductList = new ArrayList<>();
    static String filePath = "/Users/deca/Documents/Completed WeeklyTask/Week two/ConvenienceStoreW2/src/main/java/week2/StoreCsvFile.csv";

    public Product getProduct() {return newItem;}
    public ArrayList<Product> getMyproductList() {return myproductList;}
    public void addItemsToStore() {
        String line;
        try {
            BufferedReader read = new BufferedReader(new FileReader(filePath));
            while ((line = read.readLine()) != null) {
               String[]  productItem = line.split(",");

             newItem = new Product(productItem[0], Integer.parseInt(productItem[1]), productItem[2],
                        Integer.parseInt(productItem[3]), parseInt(productItem[4]));
                myproductList.add(newItem);
                }
        } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}




