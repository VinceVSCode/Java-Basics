public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Vincent", 95000.0, 2);
        Employee emp1 = new Developer("Elizabethhh", 80000.0, "Java");
        Employee emp2 = new Developer("Paul", 90000.0, "Python");

        System.out.println(manager.getDetails());
        manager.work();
        System.out.println(emp1.getDetails());
        emp1.work();
        System.out.println(emp2.getDetails());
        emp2.work();
        
    }
}
