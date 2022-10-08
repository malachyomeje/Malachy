package week2.person;

import week2.interfaces.PersonInterface;

public class Applicant {
    private PersonInterface applicant;

    public Applicant(PersonInterface applicant) {this.applicant = applicant;}

    public PersonInterface getApplicant() {return applicant;}

    public void setApplicant(PersonInterface applicant) {this.applicant = applicant;}

}
