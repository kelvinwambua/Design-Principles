# Open/Closed Principle – Shape Drawing Example

This project demonstrates the **Open/Closed Principle (OCP)** using a simple shape drawing application.

## What is the Open/Closed Principle?

> Software entities (classes, modules, functions, etc.) should be **open for extension** but **closed for modification**.

This means you should be able to add new features by adding new code, not changing existing code.

---

## Good Example

- A `Shape` interface defines a `draw()` method.
- Classes like `Circle`, `Rectangle`, and `Triangle` implement the `Shape` interface.
- The `ShapeDrawer` works with any `Shape` without needing to know which specific one it is.
- **To add a new shape**, create a new class implementing `Shape`. No changes are needed to existing code.

### Pros:
- Easy to maintain and extend.
- Reduces risk of bugs in existing logic.

---

##  Bad Example

- `ShapeDrawer` uses `if-else` or `switch` statements to check shape types.
- To add a new shape, you must **modify** `ShapeDrawer`.
- Breaks OCP, since every new shape forces changes to working code.

---


