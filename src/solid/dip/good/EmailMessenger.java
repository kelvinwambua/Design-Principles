package solid.dip.good;

public class EmailMessenger implements Messenger {
    public void notify(String message) {
        System.out.println("Email notification: " + message);
    }
}
