package week2.services;

import week2.enums.Qualifications;
import week2.enums.UserRole;
import week2.interfaces.ManagerServiceInterface;
import week2.person.Applicant;
import week2.interfaces.PersonInterface;
import week2.person.Person;


import static org.junit.jupiter.api.Assertions.*;

class ManagerServiceTest {
    ManagerServiceInterface managerService = new ManagerService();

    PersonInterface newApplicant = new Person(
            "Ekene",
            "Philips",
            Qualifications.BSC,
            UserRole.CASHIER,
            "Ohen Street"
    );

    Applicant ekene = new Applicant(newApplicant);
    @org.junit.jupiter.api.Test
    void hireOnlyApplicantsWithMscOrBsc() {
        assertEquals("Congratulation " + ekene.getApplicant().fullName()
                        + ", you have been offered the job of a " + ekene.getApplicant().getRole(),
                managerService.hireEmployee(ekene, UserRole.CASHIER),"The applicant does not have BSC or MSC");
    }
}