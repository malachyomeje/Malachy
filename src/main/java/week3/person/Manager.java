package week3.person;

public class Manager {
    private Person manager;
    public Manager(Person manager) {
        this.manager = manager;
    }
    public Person getManager() {
        return manager;
    }
    public void setManager(Person manager) {
        this.manager = manager;
    }
}
