package org.example.model;

import org.example.enums.UserRole;

public class User {
    private String firstName;
    private String lastName;
    private UserRole role;

    public User(String firstName, String lastName, UserRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
