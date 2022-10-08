package week2;

import week2.enums.Qualifications;
import week2.enums.UserRole;
import week2.person.Applicant;
import week2.person.Person;
import week2.product.Store;
import week2.services.CustomerService;
import week2.services.ManagerService;

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

        Store newStore = new Store();
        newStore.addItemsToStore();

        CustomerService customerService = new CustomerService();
       String   buy = customerService.buyProduct(newStore.getMyproductList(),"tecno",876547,5);
        System.out.println(buy);
    }
}