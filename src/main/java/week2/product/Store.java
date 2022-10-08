package week2.product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Store{
    private  ArrayList<Product> myProductList = new ArrayList<>();
    public ArrayList<Product> getMyproductList() {return myProductList;}
    private static String filePath = "src/main/java/week2/StoreCsvFile.csv";

    public  void addItemsToStore() {
        String line;
        try {
            BufferedReader read = new BufferedReader(new FileReader(filePath));
            while ((line = read.readLine()) != null) {
                String[]  productItem = line.split(",");
                Product newItem = new Product(productItem[0], Integer.parseInt(productItem[1]), productItem[2],
                        Integer.parseInt(productItem[3]), parseInt(productItem[4]));
                myProductList.add(newItem);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}