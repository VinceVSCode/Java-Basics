public class MethodsForDays {
    // Method to get the name of the day of the week based on a number
    public static String getDayOfWeek(int day) {
        switch (day % 7) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 0: return "Sunday";
            default: return "Invalid day";
        }
    }
    // Method to calculate the square of a number
    public static int square (int number) {
        return number * number;
    }

    public static int isEven(int number) {
        // Returns 1 if the number is even, otherwise returns 0
        return (number % 2 == 0) ? 1 : 0;   
    }
    // Method to print whether a number is even or odd and its square. Using what we have created so far.
    public static void printNumberInfo(int n) {
        if (isEven(n) == 1) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
        
        // Print the square of the number
        System.out.println("The square of " + n + " is: " + square(n));
    }
    public static void main(String[] args) {
        // Example usage
        for (int i = 1; i <= 7; i++) {
            System.out.println("Day " + i + ": " + getDayOfWeek(i));
        }
    }
}
