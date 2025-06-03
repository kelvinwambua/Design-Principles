package solid.lsp.good;

public class GoodBirdExample {

    public static class Bird {
        public void eat() {
            System.out.println("Bird is eating");
        }

        public void sleep() {
            System.out.println("Bird is sleeping");
        }
    }

    public static interface Flyable {
        void fly();
    }

    public static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("Sparrow flies fast");
        }
    }

    public static class Eagle extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("Eagle soars high");
        }
    }

    public static class Penguin extends Bird {
        public void swim() {
            System.out.println("Penguin swims gracefully");
        }
    }

    public static void makeFlyableFly(Flyable flyable) {
        flyable.fly(); // Only flying birds can be passed here
    }

    public static void feedBird(Bird bird) {
        bird.eat(); // Any bird can eat
    }
}
