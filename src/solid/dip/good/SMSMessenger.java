package solid.dip.good;

public class SMSMessenger implements Messenger {
    public void notify(String message) {
        System.out.println("SMS notification: " + message);
    }
}
