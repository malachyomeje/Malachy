package week3.person;

import week3.interfaces.PersonInterface;

public class Applicant {
    private PersonInterface applicant;

    public Applicant(PersonInterface applicant) {this.applicant = applicant;}

    public PersonInterface getApplicant() {return applicant;}

    public void setApplicant(PersonInterface applicant) {this.applicant = applicant;}

}
