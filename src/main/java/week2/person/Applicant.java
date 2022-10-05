package week2.person;

public class Applicant {
    private Person applicant;

    public Applicant(Person applicant) {
        this.applicant = applicant;
    }

    public Person getApplicant() {
        return applicant;
    }

    public void setApplicant(Person applicant) {
        this.applicant = applicant;
    }
}
