# Dependency Inversion Principle

## What is the Dependency Inversion Principle

Basically, don't hardcode stuff. If your class needs something, request for it instead of creating it in the class.

## Bad Example

```java
public class OrderManager {
    private Database db = new Database();  // Hardcoded!
    private Email email = new Email();     // Hardcoded!
}
```

Problem: What if you want to use a different database? You're stuck changing code everywhere.

```java
public class OrderManager {
    private Storage storage;
    private Messenger messenger;

    // Ask for what you need, don't create it
    public OrderManager(Storage storage, Messenger messenger) {
        this.storage = storage;
        this.messenger = messenger;
    }
}
```
Now you can use any storage (database, file, cloud) and any messenger (email, SMS, push notification).
