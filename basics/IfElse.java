public class IfElse {
    // This program demonstrates the use of if-else statements
    // to categorize a person's age into different life stages.
    public static void main(String[] args) {
        int age = 20;

        if (age >= 65){
            System.out.println("You are a senior citizen.");
        } else if (age >= 40){
            System.out.println("You are middle-aged.");
        } else if (age >= 18){
            System.out.println("You are an adult.");
        } else if (age >= 13){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are young.");
        }
    }
}