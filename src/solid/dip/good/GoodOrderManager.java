package solid.dip.good;

public class GoodOrderManager {
    private Storage storage;
    private Messenger messenger;

    // Dependency injection - we pass in what we need
    public GoodOrderManager(Storage storage, Messenger messenger) {
        this.storage = storage;
        this.messenger = messenger;
    }

    public void processOrder(String orderInfo) {
        System.out.println("Processing order: " + orderInfo);
        storage.save(orderInfo);
        messenger.notify(orderInfo);
    }
}
