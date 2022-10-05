package week2.person;

import week2.enums.Qualifications;
import week2.enums.UserRole;

public interface Person {
    String getFirstName();
    void setFirstName(String firstName);

    String getLastName();
    void setLastName(String lastName);

    String fullName();

    Qualifications getQualifications();
    void setQualifications(Qualifications qualifications);

    UserRole getRole();
    void setRole(UserRole role);
}
