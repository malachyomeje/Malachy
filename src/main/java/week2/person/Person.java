package week2.person;

import java.util.UUID;

public class Person {
    private String firstName;
    private String lastName;
    private UUID ID;
    private Qualifications qualifications;
    private UserRole role;

    public Person(String firstName, String lastName, UUID ID, Qualifications qualifications, UserRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.qualifications = qualifications;
        this.role = role;
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public UUID getID() {return ID;}

    public void setID(UUID ID) {this.ID = ID;}

    public Qualifications getQualifications() {return qualifications;}

    public void setQualifications(Qualifications qualifications) {this.qualifications = qualifications;}

    public UserRole getRole() {return role;}

    public void setRole(UserRole role) {this.role = role;}
}
