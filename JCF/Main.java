import java.util.HashMap;

public class Main {
    public static void addContact(HashMap<String, Integer> contactHashMap, String name, Integer phoneNumber) {
        contactHashMap.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " - " + phoneNumber);
    }
    public static void removeContact(HashMap<String, Integer> contactHashMap, String name) {
        if (contactHashMap.containsKey(name)) {
            contactHashMap.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }
    public static void searchContact(HashMap<String, Integer> contactHashMap, String name) {
        if (contactHashMap.containsKey(name)) {
            System.out.println("Contact found: " + name + ", Phone Number: " + contactHashMap.get(name));
        } else {
            System.out.println("Contact not found: " + name);
        }
    }
    public static void printAllContacts(HashMap<String, Integer> contactHashMap) {
        if (contactHashMap.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (String name : contactHashMap.keySet()) {
                System.out.println(name + ": " + contactHashMap.get(name));
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> contactHashMap = new HashMap<>();
        addContact(contactHashMap, "Order", 123456789);
        addContact(contactHashMap, "Miss Reverse", 987654321);
        searchContact(contactHashMap, "Order");
        searchContact(contactHashMap, "Miss Reverse");
        removeContact(contactHashMap, "Order");
        printAllContacts(contactHashMap);
        removeContact(contactHashMap, "Order");

    }
        
}
