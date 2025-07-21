public class MainStudent {
    public static void main(String[] args) {
        // Create a new student object.
        Student student1 = new Students(85, "Alice");
        Student student2 = new Students(45, "Bob");

        // Display student information.
        student1.displayInfo();
        student2.displayInfo();

        // Check if students are passing.
        student1.isPassing();
        student2.isPassing();
    }
    
}
