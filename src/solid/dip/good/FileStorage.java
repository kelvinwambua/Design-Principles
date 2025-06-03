package solid.dip.good;

public class FileStorage implements Storage {
    public void save(String data) {
        System.out.println("Saved to file: " + data);
    }
}
