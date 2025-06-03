package solid.dip;

import solid.dip.bad.BadOrderManager;
import solid.dip.good.*;

public class DIPDemo {
    public static void run() {
        System.out.println("\nBAD Example (breaks DIP):");
        System.out.println("OrderManager is stuck with specific database and email");

        BadOrderManager badManager = new BadOrderManager();
        badManager.processOrder("Order #100");

        System.out.println("\nProblem: Can't change how we save or send messages");
        System.out.println("Everything is hardcoded inside the class");

        System.out.println("\n" + "-".repeat(50));

        System.out.println("\nGOOD Example (follows DIP):");
        System.out.println("OrderManager works with any storage and messenger");

        // We can mix and match different implementations
        Storage dbStorage = new DatabaseStorage();
        Storage fileStorage = new FileStorage();

        Messenger emailMsg = new EmailMessenger();
        Messenger smsMsg = new SMSMessenger();

        System.out.println("\nUsing database + email:");
        GoodOrderManager manager1 = new GoodOrderManager(dbStorage, emailMsg);
        manager1.processOrder("Order #200");

        System.out.println("\nUsing file + SMS:");
        GoodOrderManager manager2 = new GoodOrderManager(fileStorage, smsMsg);
        manager2.processOrder("Order #300");

        System.out.println("\nBenefits:");
        System.out.println("- Easy to test (use fake storage/messenger)");
        System.out.println("- Easy to change (just pass different objects)");
        System.out.println("- Classes don't depend on specific implementations");
    }
}
