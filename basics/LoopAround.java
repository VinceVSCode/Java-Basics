public class LoopAround {

    public static void forLoop(int n) {
        System.err.println("\"For\" Looping " + n + " times:");
        for (int i = 0; i< n; i++) {
            System.out.println("Iteration: " + i);
        }
    }
    public static void whileLoop(int n) {
        System.err.println("\"While\" Looping " + n + " times:");
        int i = 0;
        int s = 0;
        while (s < (5*n)) {
            System.out.println("Iteration: " + s);
            i ++;
            s = i * 5;
        }
    }
    public static void doWhileLoop(int n) {
        System.err.println("\"Do-While\" Looping " + n + " times:");
        int i = n;
        do {
            System.out.println("Iteration: " + i);
            i--;
        } while (i > 0);
    }
    public static void main(String[] args) {
        System.out.println("Starting the loops. Careful not to get dizzy!");
        forLoop(5);
        whileLoop(5);
        doWhileLoop(5);
    }
}
