package week3;

import week3.enums.Qualifications;
import week3.enums.UserRole;
import week3.person.Applicant;
import week3.person.Person;
import week3.product.Cartrrrrr;
import week3.product.Product;
import week3.product.Store;
import week3.services.CustomerService;
import week3.services.ManagerService;
import week3.services.Receipt;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person(
                "Peter",
                "Ezema",
                Qualifications.MSC,
                UserRole.CASHIER,
                "Ohen Street Benin City");

        Applicant applicant1 = new Applicant(peter);
        ManagerService service =  new ManagerService();
        String hireApplicant = service.hireEmployee(applicant1,UserRole.CASHIER);
        System.out.println(hireApplicant);

        //Store newStore = new Store();
       // Store.addItemsToStore();

        CustomerService customer1 = new CustomerService();
        CustomerService customer2 = new CustomerService();
        CustomerService customer3 = new CustomerService();
        CustomerService customer4 = new CustomerService();


       String one  =  customer1.orderItem(Store.getMyproductList(),"tecno",876547,11);
       String two  =  customer2.orderItem(Store.getMyproductList(),"Samsung",876547,37);
       String three  = customer3.orderItem(Store.getMyproductList(),"macbook",876547,9);
       String four =   customer4.orderItem(Store.getMyproductList(),"lenovo",876547,16);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        //Cart.getCart().add()

        Product sellProduct = Cartrrrrr.getCart().poll();
        Receipt receipt = new Receipt();
        receipt.setProductDetails(sellProduct);
        assert sellProduct != null;
        receipt.setTotalPrice(sellProduct.getProductPrice()*sellProduct.getProductQuantity());
        System.out.println(receipt.toString());
        System.out.println(Cartrrrrr.getCart().peek());
        //System.out.println(newStore.getMyproductList());
    }
}