public class BasicDatatypes {
    public static void main (String[] args) {
        // Integer type, like the circles around the sun
        int age = 100;
        printInt(age);

        // Double type, like the price tags in a store
        double price = 9.99;
        printDouble(price);

        // Character type, a single letter or symbol
        char aChar = 'A';
        printChar(aChar);

        // Boolean type, true or false, like a light switch
        boolean aBool = true;
        printBoolean(aBool);
    }
    // functions to demonstrate basic datatypes
    public static void printInt(int value) {
        System.out.println("Integer: " + value);
    }

    public static void printDouble(double value) {
        System.out.println("Double: " + value);
    }

    public static void printChar(char value) {
        System.out.println("Character: " + value);
    }

    public static void printBoolean(boolean value) {
        System.out.println("Boolean: " + value);
    }

}
