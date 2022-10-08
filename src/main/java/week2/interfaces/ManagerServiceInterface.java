package week2.interfaces;

import week2.enums.UserRole;
import week2.person.Applicant;

public interface ManagerServiceInterface {
    String hireEmployee(Applicant applicant, UserRole role);
}
