package org.example;

import org.example.enums.Degree;
import org.example.enums.UserRole;
import org.example.model.Cashier;
import org.example.model.Manager;
import org.example.service.HiringService;

public class Main {

    public static void main(String[] args) {
        HiringService hiringService = new HiringService();
    Manager manager = new Manager();
    manager.setFirstName("Malachy");
    manager.setLastName("Omeje");
    manager.setRole(UserRole.MANAGER);
    manager.setRank("Captain");

        Cashier cashier1 = new Cashier("Ikenna","Ezeme", UserRole.CASHIER, Degree.BSC);
        Cashier cashier2 = new Cashier("Cashier2","surname2", UserRole.CASHIER, Degree.MSC);
        Cashier cashier3 = new Cashier("Cashier3","surname3", UserRole.CASHIER, Degree.PHD);

        System.out.println(cashier1.getRole());
        System.out.println(cashier2.getRole());
        System.out.println("******************\n");

        String hire1 = hiringService.hireCashier(cashier1);
        String hire2 = hiringService.hireCashier(cashier2);
        String hire3 = hiringService.hireCashier(cashier3);

        System.out.println("******************\n");
//        System.out.println(hire1);
//
//        System.out.println(hire2);
//        System.out.println(hire3);

        System.out.println(cashier1.getRole());
        System.out.println(cashier2.getRole());


    }
}