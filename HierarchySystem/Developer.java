public class Developer extends Employee {
    private String progLanguage;

    public Developer(String name, double salary, String progLanguage) {
        super(name, salary);
        this.progLanguage = progLanguage;
    }

    public void code() {
        System.out.println(getName() + " is coding in " + progLanguage + ".");
    }

    @Override
    public void work() {
        //super.work();
        code();
    }
    @Override
    public String getDetails() {
        return super.getDetails() + ", Programming Language: " + progLanguage;
    }
}
