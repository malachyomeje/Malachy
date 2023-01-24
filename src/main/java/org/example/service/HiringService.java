package org.example.service;

import org.example.enums.Degree;
import org.example.enums.UserRole;
import org.example.model.Cashier;

public class HiringService {
    public String hireCashier(Cashier cashier){
        if(cashier.getDegree().equals(Degree.MSC)||cashier.getDegree().equals(Degree.PHD)){
            cashier.setRole(UserRole.MANAGER);
            return "You have successfully hired";
        }
        return "You are not qualified";
    }
}
