import solid.dip.DIPDemo;
import solid.is.OrderInterface;
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
        System.out.println("\n3. SINGLE RESPONSIBILITY PRINCIPLE");
        SRDemo.run();
        //Interface Segregation
        System.out.println("\n4. INTERFACE SEGREGATION");
        OrderInterface.OnlineCustomer obj1 = new OrderInterface.OnlineCustomer("Jane");
        System.out.println(obj1.name);
        System.out.println(obj1.placeOrder());

    }
}
