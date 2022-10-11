package week3.services;

import week3.enums.Qualifications;
import week3.enums.UserRole;
import week3.interfaces.ManagerServiceInterface;
import week3.person.*;

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
