package week3.person;

import week3.enums.*;
import week3.interfaces.PersonInterface;

public class Person implements PersonInterface {
    private String firstName;
    private String lastName;
    private Qualifications qualifications;
    private UserRole role;
    private String address;



    public Person(String firstName, String lastName, Qualifications qualifications, UserRole role, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualifications = qualifications;
        this.role = role;
        this.address = address;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String fullName(){
        return firstName + " " +lastName;
    }

    public Qualifications getQualifications() {return qualifications;}
    public void setQualifications(Qualifications qualifications) {this.qualifications = qualifications;}

    public UserRole getRole() {return role;}
    public void setRole(UserRole role) {this.role = role;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String toString(){
        return "Profile{\n" +
                "FirstName = " + firstName + ",  " +
                "LastName =  " + lastName + "\n" +
                "Qualification =     " + qualifications + ", " +
                "Role =      " + role + "\n"+
                "Address =   " + address+
                '}';
    }
}
