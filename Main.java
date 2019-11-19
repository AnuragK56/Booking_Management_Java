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
class InvalidDateException extends Exception {
    InvalidDateException(String s) {
        super(s);

    }
}
class add {
	
    Scanner sc = new Scanner(System.in);

    void addTicket() throws FileNotFoundException {
        System.out.print("\nEnter Passenger Name: ");
        String name = sc.next();
        String Date="NULL";
        try {
        	 System.out.print("\nEnter Date of Journey(dd/mm/yyyy): ");
             Date = sc.next();
             if(Date.charAt(2)!='/' || Date.charAt(5)!='/')
            	 throw new InvalidDateException("Invalid Date Exception");
        }catch(InvalidDateException e){
        	System.out.println(e) ;
        }
       
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
                t.print();
            } else {
                Flight f = new Flight(name, Date, ModeofTransport, fname, PNR, origin, Destination);
                f.add();
                f.print();
            }
        } catch (IOException E) {
            System.out.println("ERROR");
        }
    }

}

class Main implements Runnable {
    static Scanner sc = new Scanner(System.in);
    static int count=1;
    public int Menu() {
    	if(count==1)
    		{for(int i=0;i<50;i++)
    			   System.out.print("#");
    
        System.out.print("  Welcome to Booking Management System ");
        for(int i=0;i<50;i++)
 		   System.out.print("#");
    		}
        System.out.println("\n\nChoose any one of the following action\n");
        System.out.println("1) Add a New Ticket");
        System.out.println("2) Display Tickets of a Particular Customers");
        System.out.println("3) Display Tickets of All Customers");
        System.out.println("4) Display  All Tickets of Train");
        System.out.println("5) Display All Tickets of Flight");
        System.out.println("6) Exit\n");
        int choice = sc.nextInt();
        count--;
        return choice;
    }

    public void run(){
    	try {
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
                d.displayParticular(name);
                break;
            case 3:
                System.out.println("The details of all Booking are :");
                d.displayAll();
                break;
            case 4:
                d.displayParticular("train","modeoftransport");
                break;
            case 5:
                d.displayParticular("flight","modeoftransport");
                break;
            case 6:d.endStatement();
                return;
            }
        } while (choice != 6);
    	}
    	  catch (Exception e) 
            { 
                System.out.println ("Exception is caught"); 
            } 

    }
}