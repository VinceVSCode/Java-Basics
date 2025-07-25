import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactBook book = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        book.loadContactsFromFile();

        while (true) {
            System.out.println("\n--- Contact Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Show All Contacts");
            System.out.println("5. Save & Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Number: ");
                    String number = scanner.nextLine();
                    book.addContact(name, number);
                    break;
                case 2:
                    System.out.print("Name to remove: ");
                    book.removeContact(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Name to search: ");
                    book.searchContact(scanner.nextLine());
                    break;
                case 4:
                    book.printAllContacts();
                    break;
                case 5:
                    book.saveContactsToFile();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
