package org.example.model;

import org.example.enums.Degree;
import org.example.enums.UserRole;

public class Cashier extends User{
    private Degree degree;

    public Cashier(String firstName, String lastName, UserRole role, Degree degree) {
        super(firstName, lastName, role);
        this.degree = degree;
    }


    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
