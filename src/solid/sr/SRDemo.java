package solid.sr;

import solid.sr.badPayment;
import solid.sr.goodPayment;

public class SRDemo {
    public static void run() {
        System.out.println("\nBAD Example (breaks SRP):");
        System.out.println("Payment class doing multiple jobs");

        badPayment.badPaymentS badPay = new badPayment().new badPaymentS("Credit Card", 123, 100.0);

        System.out.println("\nBad payment class handling everything:");
        System.out.println("Original amount: $" + badPay.getAmount());
        badPay.applyDiscount(10);
        System.out.println("After discount: $" + badPay.getAmount());
        badPay.saveToDatabase();

        System.out.println("\nProblems:");
        System.out.println("- Payment class knows about discounts");
        System.out.println("- Payment class knows about database");
        System.out.println("- Too many reasons to change this class");

        System.out.println("\n" + "-".repeat(50));

        System.out.println("\nGOOD Example (follows SRP):");
        System.out.println("Payment class only holds data");

        goodPayment goodPay = new goodPayment("Debit Card", 456, 200.0);

        System.out.println("\nGood payment class - clean and simple:");
        System.out.println("Payment Method: " + goodPay.getMethod());
        System.out.println("Payment ID: " + goodPay.getId());
        System.out.println("Payment Amount: $" + goodPay.getAmount());

        System.out.println("\nBenefits:");
        System.out.println("- Payment class only handles payment data");
        System.out.println("- Easy to understand and maintain");
        System.out.println("- Only one reason to change (payment data structure)");
        System.out.println("- Other responsibilities would go in separate classes");
    }
}
