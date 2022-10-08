package week2.services;

import week2.enums.Qualifications;
import week2.enums.UserRole;
import week2.interfaces.ManagerServiceInterface;
import week2.person.*;

public class ManagerService implements ManagerServiceInterface {

    @Override
    public String hireEmployee(Applicant applicant, UserRole role){

         boolean bsc = (applicant.getApplicant().getQualifications()).equals(Qualifications.BSC);
         boolean msc = (applicant.getApplicant().getQualifications()).equals(Qualifications.MSC);

        if(bsc||msc) {
            applicant.getApplicant().setRole(role);
            return String.format(

                    "Congratulation %s, you have been offered the job of a %s",
                    applicant.getApplicant().fullName(),
                    applicant.getApplicant().getRole()
            );
        }
            return String.format(
                    "Sorry %s, your application is unsuccessful ",
                    applicant.getApplicant().fullName()
        );
    }
}
