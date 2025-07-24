public class Main {
    public static void main(String[] args) {
        Appliance washer = new Washer("Whirlpool");
        Appliance dryer = new Dryer("Samsung");
        Appliance invalidWasher = new Washer(""); // This will trigger an exception
        Appliance invalidDryer =  new Dryer (null); // This will also trigger an exception

        washer.turnOn();
        dryer.turnOn();
        invalidWasher.turnOn();
        invalidDryer.turnOn();
    }

}
