import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import display.*;
/**
 * 
 * Booking Managment System for Travel Agent
 * 
 * @author Name : Anurag Kandalkar Reg no: 189302059 Name :Mrityunjoy Chowdhury
 *
 */

class add {
    Scanner sc = new Scanner(System.in);

    void addTicket() throws FileNotFoundException {
        System.out.print("\nEnter Passenger Name: ");
        String name = sc.next();
        System.out.print("\nEnter Date of Journey: ");
        String Date = sc.next();
        System.out.print("\nEnter Mode of Transport: ");
        String ModeofTransport = sc.next();
        System.out.print("\n Enter Train/Flight name: ");
        String fname = sc.next();
        System.out.print("\nEnter PNR: ");
        String PNR = sc.next();
        System.out.print("\nEnter Origin: ");
        String origin = sc.next();
        System.out.print("\nEnter Destination: ");
        String Destination = sc.next();
        System.out.print("\n");
        try {
            if ((ModeofTransport.toLowerCase()).equals("train")) {
                Train t = new Train(name, Date, ModeofTransport, fname, PNR, origin, Destination);
                t.add();
            } else {
                Flight f = new Flight(name, Date, ModeofTransport, fname, PNR, origin, Destination);
                f.add();
            }
        } catch (IOException E) {
            System.out.println("EROOR");
        }
    }

}

class Main {
    static Scanner sc = new Scanner(System.in);

    public int Menu() {

        System.out.println("\n\n ########### Welcome to Booking Management System ###########\n");
        System.out.println("Choose any one of the following action\n");
        System.out.println("1) Add a New Ticket");
        System.out.println("2) Display Tickets of a Particular Customers");
        System.out.println("3) Display Tickets of All Customers");
        System.out.println("4) Exit\n");
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String args[]) throws FileNotFoundException {
        Main m = new Main();
        int choice = 0;

        do {
            choice = m.Menu();
            display d = new display();
            add a = new add();
            switch (choice) {
            case 1:
                a.addTicket();
                // createTicket();
                break;
            case 2:
                System.out.println("Enter the name of Customer:");
                String name = sc.next();
                System.out.println("All Booking of " + name + " are :");
                d.displayParticular(name);
                break;
            case 3:
                System.out.println("The details of all Booking are :");
                d.displayAll();
                break;
            case 4:
                return;
            }
        } while (choice != 4);

    }
}