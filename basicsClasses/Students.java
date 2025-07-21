public class Students {
    public int grade;
    public String name;

    // Constructor to initialize the student object
    public Students (int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
    }

    // Method to check if the student is passing
    public void isPassing() {
        if (this.grade >= 50) {
            System.out.println(this.name + " is passing.");
        } else {
            System.out.println(this.name + " is not passing.");
        }
    }
    
}
