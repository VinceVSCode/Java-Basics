import java.io.*;
import java.util.*;
// ContactBook.java
// Similar to the JCF Main class, this class manages contacts but with file I/O capabilities.

public class ContactBook {
    private static final String FILE_NAME = "contacts.txt";
    private HashMap<String, String> contacts = new HashMap<>();

    // Load contacts from file at startup
    public void loadContactsFromFile() {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                // Assuming the format is "name,number"
                if (parts.length == 2) {
                    contacts.put(parts[0].trim(), parts[1].trim());
                }
            }
            System.out.println("Contacts loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing contact file found.");
        }
    }

    // Save contacts to file
    public void saveContactsToFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
            System.out.println("Contacts saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving contacts.");
            e.printStackTrace();
        }
    }

    // Add or update a contact
    public void addContact(String name, String number) {
        contacts.put(name, number);
        System.out.println("Added/Updated: " + name + " -> " + number);
    }

    // Remove a contact
    public void removeContact(String name) {
        if (contacts.remove(name) != null) {
            System.out.println("Removed contact: " + name);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Search for a contact
    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + " -> " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Print all contacts
    public void printAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        System.out.println("All contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

