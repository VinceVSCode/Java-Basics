import java.util.HashMap;

public class Main {
    public static void addContact(HashMap<String, Integer> contactHashMap, String name, Integer phoneNumber) {
        contactHashMap.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " - " + phoneNumber);
    }
    public static void main(String[] args) {
        HashMap<String, Integer> contactHashMap = new HashMap<>();
        addContact(contactHashMap, "Order", 123456789);
        addContact(contactHashMap, "Miss Reverse", 987654321);
        for (String name : contactHashMap.keySet()) {
            System.out.println("Contact: " + name + ", Phone Number: " + contactHashMap.get(name));
        }
    }
        
}
