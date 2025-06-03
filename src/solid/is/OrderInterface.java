package solid.is;

public interface OrderInterface {

    public String placeOrder();


    public class OnlineCustomer implements OrderInterface {
        public String name;

        public OnlineCustomer(String name) {
            this.name = name;
        }

        @Override
        public String placeOrder() {
            return "Order placed!";
        }

    }
}


