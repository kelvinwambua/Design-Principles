# Liskov Substitution Principle

## What's the Liskov Substitution Principle

If you have a parent class, you should be able to use any child class in its place without breaking anything.

## Bad Example 👎

```java
class Bird {
    void fly() { ... }  // All birds must fly
}

class Penguin extends Bird {
    void fly() {
        throw new Error("Penguins can't fly!"); // Breaks everything!
    }
}
```
Problem: You can't use a Penguin everywhere you use a Bird. Your code crashes.
```java
class Bird {
void eat() { ... }  // All birds can eat
}

interface Flyable {
void fly();  // Only flying birds implement this
}

class Sparrow extends Bird implements Flyable { ... }
```
Now you can use any Bird safely, and only ask flying birds to fly.
