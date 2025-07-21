public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + '}';
    }
    // Method to accept and display student score
    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100.");
        }
        this.score = score;
    }

    // Method to check if the student is passing
    public boolean isPassing() {
        if (score >= 50) {
            System.out.println(name + " is passing with a score of " + score);
            return true;
        } else {
            System.out.println(name + " is not passing with a score of " + score);
            return false;
        }
    }

}
