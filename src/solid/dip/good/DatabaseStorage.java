package solid.dip.good;

public class DatabaseStorage implements Storage {
    public void save(String data) {
        System.out.println("Saved to database: " + data);
    }
}
