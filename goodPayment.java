//this class represents a good payment entity that follows the SRP principle
//only holds data and provides basic getters and setters
public class goodPayment {
    private String method;
    private int id;
    private double amount;

    public goodPayment(String name, int id, double baseSalary) {
        this.method = name;
        this.id = id;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public int getId() {
        return id;
    }
}

