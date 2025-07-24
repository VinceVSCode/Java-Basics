public class Washer extends Appliance {
    public Washer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        try {
            if (name == null || name.isEmpty()) {
                throw new InvalidNameException("Washer name cannot be null or empty.");
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Washer " + name + " is now washing clothes. Using water and soap!");
    }
}