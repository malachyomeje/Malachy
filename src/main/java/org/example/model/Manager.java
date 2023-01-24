package org.example.model;

import org.example.enums.UserRole;

public class Manager extends User{

    private String rank;

    public Manager(String firstName, String lastName, UserRole role) {
        super(firstName, lastName, role);
    }

    public Manager() {
        super();

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
