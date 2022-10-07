package week2;

import week2.enums.Qualifications;
import week2.enums.UserRole;
import week2.person.Applicant;
import week2.person.PersonImpl;
import week2.product.Receipt;
import week2.services.CashierService;
import week2.product.Store;
import week2.services.ManagerService;

public class Main {
    public static void main(String[] args) {
        PersonImpl peter = new PersonImpl(
                "Peter",
                "Ezema",
                Qualifications.WAEC,
                UserRole.MANAGER,
                "Ohen Street Benin City");

        Applicant applicant1 = new Applicant(peter);
        week2.interfaces.ManagerService service =  new ManagerService();
           String r = service.hireEmployee(applicant1,UserRole.CASHIER);

        System.out.println(r);

        Store newStore = new Store();
        newStore.addItemsToStore();
        Receipt a = new Receipt();


      CashierService cart = new CashierService();
      String ae = cart.sellItem( newStore.getMyproductList(),"tecno",99990,12);
        System.out.println(ae);
    }
}