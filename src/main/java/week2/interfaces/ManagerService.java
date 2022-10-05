package week2.interfaces;

import week2.enums.Qualifications;
import week2.enums.UserRole;
import week2.person.Applicant;
import week2.person.PersonImpl;

public interface ManagerService {
    String hireEmployee(Applicant applicant, UserRole role);
}
