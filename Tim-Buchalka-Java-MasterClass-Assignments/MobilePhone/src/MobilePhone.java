import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> contactList = new ArrayList<>();

    private void store(String name) {
        if (findIndex(name) >= 0) {
            System.out.println("Contact you want to add already exist in the list");
        } else {
            contactList.add(name);
            System.out.println("New contact " + name + " has been added to the list");
        }

    }

    private void modify(String previousName, String newName) {
        int index = findIndex(previousName);
        contactList.set(index, newName);
        System.out.println(previousName + " has been modified with " + newName);
    }

    private int findIndex(String name) {
        int a = contactList.indexOf(name);
        return a;
    }

    private boolean isItem(String name) {
        if (findIndex(name) >= 0) {
            System.out.println("Name " + name + " exist in the contact list");
            return true;
        } else {
            System.out.println("Name does not exist");
            return false;
        }

    }

    private void remove(String name) {
        if (isItem(name)) {
            contactList.remove(name);
            System.out.println("Contact name: " + name + " has been removed from the contact list");
        }
    }

    private void printList() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts in the list yet");
        } else {
            System.out.println("Names in contact list are --->");
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println((i + 1) + " " + contactList.get(i));
            }
        }
    }

    private void printMessage() {
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to view contact names");
        System.out.println("Press 2 to add new contact");
        System.out.println("Press 3 to update existing contact");
        System.out.println("Press 4 to remove contact");
        System.out.println("Press 5 to search contact");
        System.out.println("Press 6 to view available options in the menu");


    }
    private void updateContact() {
        System.out.print("Enter the name which you want to update ");
        String name = scanner.nextLine();
        if (findIndex(name) >= 0) {
            System.out.print("Enter new name ");
            String newName = scanner.nextLine();
            if (findIndex(newName) < 0) {
                modify(name, newName);
            } else {
                System.out.println("Name " + newName + " already exist in the contact list");
            }

        } else {
            System.out.println("Name " + name+" does not exist in the contact list");
        }
    }

    private void addNewContact() {
        System.out.print("Enter contact name which you want to add ");
        String name = scanner.nextLine();
        store(name);
    }

    private void deleteContact() {
        System.out.print("Add contact name to be deleted ");
        String name = scanner.nextLine();
        remove(name);
    }

    private void searchContact() {
        System.out.print("Enter contact name you wanna find ");
        String name = scanner.nextLine();
        isItem(name);
    }

    private void printContacts() {
        printList();
    }

    public void menu() {
        printMessage();
        while (true) {
            int a = scanner.nextInt();
            scanner.nextLine();
            if (a == 0) {
                System.out.println("Exiting menu...");
                break;
            } else if (a == 1) {
                printContacts();
                System.out.println("Choose another option");
            } else if (a == 2) {
                addNewContact();
                System.out.println("Choose another option");
            } else if (a == 3) {
                updateContact();
                System.out.println("Choose another option");
            } else if (a == 4) {
                deleteContact();
                System.out.println("Choose another option");
            } else if (a == 5) {
                searchContact();
                System.out.println("Choose another option");
            }else if (a==6){
                printMessage();
                System.out.println("Choose another option");
            }
            else System.out.println("Please choose a valid option");
        }
    }
}


