package week2.person;

public class Manager {

    private PersonImpl manager;

    public Manager(PersonImpl manager) {
        this.manager = manager;
    }
    public PersonImpl getManager() {
        return manager;
    }

    public void setManager(PersonImpl manager) {
        this.manager = manager;
    }
}
