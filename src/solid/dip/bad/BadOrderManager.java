package solid.dip.bad;

public class BadOrderManager {
    private DatabaseHelper db;
    private EmailHelper email;

    public BadOrderManager() {
        // Problem: directly creating concrete objects
        this.db = new DatabaseHelper();
        this.email = new EmailHelper();
    }

    public void processOrder(String orderInfo) {
        System.out.println("Processing order: " + orderInfo);
        db.saveOrder(orderInfo);
        email.sendConfirmation(orderInfo);
    }
}

class DatabaseHelper {
    public void saveOrder(String order) {
        System.out.println("Saved to MySQL database: " + order);
    }
}

class EmailHelper {
    public void sendConfirmation(String order) {
        System.out.println("Email sent for: " + order);
    }
}
