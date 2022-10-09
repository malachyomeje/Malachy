package week3.product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class StoreService {
    public  void addItemsToStore() {
        String line;
        try {
            String filePath = "src/main/java/week3/StoreCsvFile.csv";
            BufferedReader read = new BufferedReader(new FileReader(filePath));
            while ((line = read.readLine()) != null) {
                String[]  productItem = line.split(",");
                Product newItem = new Product(productItem[0], Integer.parseInt(productItem[1]), productItem[2],
                        Integer.parseInt(productItem[3]), parseInt(productItem[4]));

                //ADD  THE CREATED PRODUCT TO THE PRODUCTLIST THE STORE;
                Store.getMyproductList().add(newItem);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
