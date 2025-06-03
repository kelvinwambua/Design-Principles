# GoodPayment Class – SRP Example (Java)

This class demonstrates the Single Responsibility Principle (SRP) in OOP using a simple `goodPayment` class in Java.

Single Responsibility Principle states that a class should have only one reason to change.  
In this example, the `goodPayment` class is responsible **only for holding and exposing payment data**.

Class: `goodPayment`
 Responsibility:
- Store payment details (method, ID, amount)
- Provide basic getters (no business logic or external handling)

Fields:
- `String method` – Payment method (e.g., "Credit Card", "Mobile Money")
- `int id` – Unique payment ID
- `double amount` – Amount of payment

Constructor:
java
public goodPayment(String name, int id, double amount)

# BadPayments Class – SRP Violation Example (Java)

This project demonstrates how *not* to structure a class using the *Single Responsibility Principle(SRP)*.

The badPaymentS class takes on *multiple unrelated responsibilities*, making it:

- Hard to maintain.
- Hard to test.
- Prone to bugs when changes are made.

*Responsibilities Mixed in One Class:*

It does hold payment data which is good,
but when it comes to applying discounts and saving database it takes up more responsibilities.


