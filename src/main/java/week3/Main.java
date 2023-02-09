package week3;

import week3.enums.Qualifications;
import week3.enums.UserRole;
import week3.interfaces.CashierServiceInterface;
import week3.interfaces.CustomerServiceInterface;
import week3.person.Applicant;
import week3.person.Customer;
import week3.person.Person;
import week3.product.*;
import week3.services.CashierService;
import week3.services.CustomerService;
import week3.services.ManagerService;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CashierServiceInterface cashierService = new CashierService();
        CustomerServiceInterface customerService = new CustomerService();
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

       StoreService newStore = new StoreService();
       newStore.addItemsToStore();

        Customer ekene = new Customer("Ekene","Benin",99920_000);
        Customer uche = new Customer("Uche","Lagos",50_000);
        Customer abimbola = new Customer("Abimbola","Akure",45_000);
        Customer ugochi = new Customer("Ugochi","Nnewi",1_000_000);

        Cart ekeneCart = new Cart();
        customerService.orderItem(ekeneCart,ekene,"tecno", 11);
        customerService.addCartToQueue(ekeneCart);

        Cart ucheCart = new Cart();
        customerService.orderItem(ucheCart,ekene,"macbook", 1);
        customerService.orderItem(ucheCart,ekene,"Samsung", 7);
        customerService.addCartToQueue(ucheCart);

        //System.out.println(customerService.addCartToQueue(ucheCart));

        Cart abimbolaCart = new Cart();
        customerService.orderItem(abimbolaCart,abimbola,"Washing Machine", 24);
        customerService.orderItem(abimbolaCart,abimbola,"Lenovo", 92);
        customerService.orderItem(abimbolaCart,abimbola,"television", 42);

        customerService.addCartToQueue(abimbolaCart);

            //CHECK NUMBER OF CARTS ON QUEUE
        System.out.println(CashierService.getCheckOutPriorityQueue().size());

            //CALL CASHIER TO MAKE A SALE
        while(CashierService.getCheckOutPriorityQueue().size()>0) {
            System.out.println(cashierService.checkOut());
            System.out.println("**********************************");
            CashierService.getCheckOutPriorityQueue().poll();
        }


    }
}