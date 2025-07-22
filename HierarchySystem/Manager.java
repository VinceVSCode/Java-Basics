public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void manage() {
        System.out.println(getName() + " is managing a team of " + teamSize + " employees.");
    }

    @Override
    public void work() {
       // super.work();
        manage();
    }

    @Override
     public String getDetails() {
        return super.getDetails() + ", Team Size: " + teamSize;
    }
}
