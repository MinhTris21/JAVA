import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static int id = 0;

    private static ArrayList<Contact> contacts;
    public static void main(String[] args) {
        contacts = new ArrayList<>();
        System.out.println("Welcome");
        showInittialOptions();
    }
    private static void showInittialOptions(){
        System.out.println("Please make you chose: "+
                "\n\t 1.Manage Contacs"+
                "\n\t 2.Messages"+
                "\n\t 3.Quit");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;
            case 2:
                Messages();
                break;
            default:
                break;
        }
    }

    private static void Messages() {
        System.out.println("Please select one: " +
                "\n\t 1. Show all messages" +
                "\n\t 2. Send a new message" +
                "\n\t 3. Go back");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showallMessages();
                break;
            case 2:
                sendAMessages();
                break;
            default:
                showInittialOptions();
                break;
        }
    }

    private static void sendAMessages() {
        System.out.println("Who are you send the message to ?");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Please enter the name of the contact");
            sendAMessages();
        }else{
            boolean Exist= false;
            for (Contact c: contacts){
                if (c.getName().equals(name)){
                    Exist = true;
                }
            }
            if (Exist){
                System.out.println("Enter your text");
                String text =scanner.next();
                if (text.equals("")){
                    System.out.println("Please enter your message");
                    sendAMessages();
                }else{
                    id++;
                    Message newMessage = new Message(text, name, id);
                    for (Contact c: contacts){
                        if (c.getName().equals(name)){
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(newMessage);
                            c.setMessages(newMessages);
                        }
                    }
                }
            }else{
                System.out.println("There is no contact name: " + name);
            }
        }
    }

    private static void showallMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c: contacts)
        {
            allMessages.addAll(c.getMessages());
        }
        if (allMessages.size()>0){
            for (Message m: allMessages){
                m.getDetails();
                System.out.println("****");
            }
        }else{
            System.out.println("There is no message");
            showInittialOptions();
        }
    }

    private static void manageContacts(){
        System.out.println("Select one: "+
                "\n\t 1. Show all contacts" +
                "\n\t 2. Add new contact"+
                "\n\t 3. Search for new contacs "+
                "\n\t 4. Delete a contac"+
                "\n\t 5. Go back");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContacts();
                break;
            case 3:
                searchForContacts();
                break;
            case 4:
                deleteContacts();
                break;
            default:
                showInittialOptions();
                break;
        }
    }
    private static void addNewContacts(){
        System.out.println("Adding a new contact: " +
                "\n Enter your new contact: ");
        String name = scanner.next();
        System.out.println("Enter your contact number: ");
        String number = scanner.next();
        System.out.println("Enter your contact email");
        String email = scanner.next();
        if (name.equals("") || number.equals("") || email.equals(""))
        {
            System.out.println("Please enter the information");
            addNewContacts();
        }else {
                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println(name + " add successfully");
            }
        showInittialOptions();
    }
    private static void searchForContacts() {
        System.out.println("Please enter the contact you want to search: ");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please enter the correct information");
            searchForContacts();
        } else {
            boolean result = false;
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    c.getDetails();
                    result = true;
                }
            }
            if (!result) {
                System.out.println("The contacts is not exist in you contacts list");
                showAllContacts();
            }
        }
        showInittialOptions();
    }
    public static void deleteContacts(){
        System.out.println("Please enter contact you want to delete: ");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Please enter the correct information");
            deleteContacts();
        }else{
            boolean Exist = false;
            for (Contact c: contacts){
                if (c.getName().equals(name)){
                    Exist = true;
                    contacts.remove(c);
                    System.out.println("Deleted contact " + name + " successfully");
                    showInittialOptions();
                }
            }
            if (!Exist){
                System.out.println("Contact doesn't exist");
            }
        }

        showInittialOptions();
    }
    public static void showAllContacts(){
        if (contacts.size()>0){
            for (Contact c: contacts){
                c.getDetails();
            }
            showInittialOptions();
        }else{
            System.out.println("You don't have any contacts");
            showInittialOptions();
        }



    }

}