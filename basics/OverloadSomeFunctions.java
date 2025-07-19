public class OverloadSomeFunctions {
    // Overloaded method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for adding two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method for adding three double values
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        // Create an instance of OverloadSomeFunctions to test the methods.
        // The name of the class is OverloadSomeFunctions is kinda lenghty, so we can use a shorter name for the object.      
        OverloadSomeFunctions obj = new OverloadSomeFunctions();
        
        // Testing the overloaded methods
        System.out.println("Add 2 integers: " + obj.add(5, 10));
        System.out.println("Add 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Add doubles: " + obj.add(5.5, 10.5));
        System.out.println("Add 3 doubles: " + obj.add(5.5, 10.5, 15.5));
    }
}
