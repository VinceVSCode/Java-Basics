public class Dryer extends Appliance {
    public Dryer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {  
        try {
            if (name == null || name.isEmpty()) {
                throw new InvalidNameException("Dryer name cannot be null or empty.");
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Dryer " + name + " is now drying clothes. Magically!");
    }
}