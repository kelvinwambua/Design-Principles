import solid.dip.DIPDemo;
import solid.lsp.LSPDemo;
import solid.sr.SRDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("SOLID Principles Demo");
        System.out.println("============================================");
        // Dependency Inversion Principle
        System.out.println("\n1. DEPENDENCY INVERSION PRINCIPLE");
        DIPDemo.run();

        // Liskov Substitution Principle
        System.out.println("\n2. LISKOV SUBSTITUTION PRINCIPLE");
        LSPDemo.run();
        //Single Responsibility Principle
        System.out.println("\n2. SINGLE RESPONSIBILITY PRINCIPLE");
        SRDemo.run();
    }
}
