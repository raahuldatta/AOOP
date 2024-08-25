import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{name='" + name + "', phoneNumber='" + phoneNumber + "', email='" + email + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return name.equals(contact.name); // Uniqueness is based on the contact name
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class ContactManagementApp {
    private Set<Contact> contacts; // Set to store unique contacts
    private Map<String, Contact> contactMap; // Map to store contacts by name

    public ContactManagementApp() {
        contacts = new HashSet<>();
        contactMap = new HashMap<>();
    }

    // Add a contact
    public void addContact(Contact contact) {
        if (contacts.add(contact)) { // Set ensures uniqueness
            contactMap.put(contact.getName(), contact); // Map for quick access by name
            System.out.println("Contact added: " + contact);
        } else {
            System.out.println("Contact with the same name already exists.");
        }
    }

    // Remove a contact by name
    public void removeContact(String name) {
        Contact contact = contactMap.remove(name);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact removed: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Find a contact by name
    public void findContact(String name) {
        Contact contact = contactMap.get(name);
        if (contact != null) {
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Display all contacts
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public static void main(String[] args) {
        ContactManagementApp app = new ContactManagementApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Management System:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber, email);
                    app.addContact(contact);
                    break;
                case 2:
                    System.out.print("Enter name of the contact to remove: ");
                    String nameToRemove = scanner.nextLine();
                    app.removeContact(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter name of the contact to find: ");
                    String nameToFind = scanner.nextLine();
                    app.findContact(nameToFind);
                    break;
                case 4:
                    app.displayAllContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
