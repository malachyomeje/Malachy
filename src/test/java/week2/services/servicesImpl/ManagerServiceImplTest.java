package week2.services.servicesImpl;

import week2.enums.Qualifications;
import week2.enums.UserRole;
import week2.person.Applicant;
import week2.person.Person;
import week2.person.PersonImpl;
import week2.interfaces.ManagerService;
import week2.services.ManagerServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ManagerServiceImplTest {
    ManagerService managerService = new ManagerServiceImpl();

    Person newApplicant = new PersonImpl(
            "Ekene",
            "Philips",
            Qualifications.MSC,
            UserRole.CASHIER,
            "Ohen Street"
    );

    Applicant ekene = new Applicant(newApplicant);



    @org.junit.jupiter.api.Test
    void hireOnlyApplicantsWithMscOrBsc() {
        assertEquals("Congratulation " + ekene.getApplicant().fullName()
                + ", you have been offered the job of a "
                + ekene.getApplicant().getRole(),
                managerService.hireEmployee(ekene, UserRole.CASHIER),"The applicant is does not have BSC or MSC");
    }
}