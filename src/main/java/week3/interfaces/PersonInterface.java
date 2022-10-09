package week3.interfaces;

import week3.enums.Qualifications;
import week3.enums.UserRole;

public interface PersonInterface {
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
