//this class represents a bad payment entity that violates the SRP principle
//implements various other logic; handles multiple responsibilities
public class badPayment{
    public class badPaymentS {
        private String method;
        private int id;
        private double amount;

        public badPaymentS(String method, int id, double amount) {
            this.method = method;
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

        // arithmetic operations mixed in which violates SRP principle
        public void applyDiscount(double percentage) {
            amount = amount - (amount * percentage / 100);
        }

        // saving logic mixed; in violates SRP principle
        public void saveToDatabase() {
            System.out.println("Saving payment to database...");
        }

    }

}
