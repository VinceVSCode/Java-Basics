public class Main {
    public static void main(String[] args) {
        // Create instances of Student and print their summaries
        Student student1 = new Student("Vincent", 55);
        Student student2 = new Student("Betty", 77);
        Student student3 = new Student("Snowman", 22);


        StudentManager.printStudentSummary(student1);
        StudentManager.printStudentSummary(student2);
        StudentManager.printStudentSummary(student3);
        StudentManager.printTotalStudents();
    }
}
