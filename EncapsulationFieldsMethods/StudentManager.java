public class StudentManager {
    static int studentCount = 0;

    static void printStudentSummary (Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Score: " + student.getScore());
        System.out.println("Passing Status: " + (student.isPassing() ? "Pass" : "Fail"));
        studentCount++;
    }

    static void printTotalStudents() {
        System.out.println("Total number of students: " + studentCount);
    }

    
}
