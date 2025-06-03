package solid.lsp.bad;

public class BadBirdExample {

    public static class Bird {
        public void fly() {
            System.out.println("Bird is flying");
        }

        public void eat() {
            System.out.println("Bird is eating");
        }
    }

    public static class Sparrow extends Bird {
        @Override
        public void fly() {
            System.out.println("Sparrow flies fast");
        }
    }

    public static class Penguin extends Bird {
        @Override
        public void fly() {
            // Problem: Penguins can't fly but we're forced to implement this
            throw new RuntimeException("Penguins can't fly!");
        }
    }

    public static void makeBirdFly(Bird bird) {
        bird.fly(); // This will crash if we pass a Penguin!
    }
}
