package week3.interfaces;

import week3.enums.UserRole;
import week3.person.Applicant;

public interface ManagerServiceInterface {
    String hireEmployee(Applicant applicant, UserRole role);
}
