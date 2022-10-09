package week3.services;

import org.junit.jupiter.api.Test;
import week3.product.Store;

import static org.junit.jupiter.api.Assertions.*;

class CashierServiceTest {

   private  CustomerService buy = new CustomerService();
   private Store store = new Store();
   private Receipt receipt = new Receipt();

   @Test
    void returnsReceiptWhenPurchaseIsSuccessful(){
        store.addItemsToStore();
        assertEquals("Here is your Receipt:\n" +
                        "**********************\n" +
                        "Category: Phones \n" +
                        "ID: 1 \n" +
                        "Item: Samsung \n" +
                        "Unit Price: 200 \n" +
                        "Quantity: 6\n" +
                        "Total Price: 1200",

                buy.buyProduct(store.getMyproductList(),"samsung",979785773,6),
                "Product out of Store or Insufficient funds");
    }
    }
