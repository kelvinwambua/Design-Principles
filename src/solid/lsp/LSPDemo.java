package solid.lsp;

import solid.lsp.bad.BadBirdExample;
import solid.lsp.good.GoodBirdExample;

public class LSPDemo {
    public static void run() {
        System.out.println("\nBAD Example (breaks LSP):");
        System.out.println("All birds must implement fly(), even penguins");

        BadBirdExample.Bird sparrow = new BadBirdExample.Sparrow();
        BadBirdExample.Bird penguin = new BadBirdExample.Penguin();

        System.out.println("\nSparrow flying:");
        BadBirdExample.makeBirdFly(sparrow); // Works fine

        System.out.println("\nPenguin flying:");
        try {
            BadBirdExample.makeBirdFly(penguin); // This will crash!
        } catch (RuntimeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nProblem: We can't substitute Penguin for Bird safely");
        System.out.println("The code breaks when we use a Penguin where we expect a Bird");

        System.out.println("\n" + "-".repeat(50));

        System.out.println("\nGOOD Example (follows LSP):");
        System.out.println("Only flying birds implement Flyable interface");

        GoodBirdExample.Bird goodPenguin = new GoodBirdExample.Penguin();
        GoodBirdExample.Bird goodSparrow = new GoodBirdExample.Sparrow();
        GoodBirdExample.Bird goodEagle = new GoodBirdExample.Eagle();

        System.out.println("\nAll birds can eat (common behavior):");
        GoodBirdExample.feedBird(goodPenguin);
        GoodBirdExample.feedBird(goodSparrow);
        GoodBirdExample.feedBird(goodEagle);

        System.out.println("\nOnly flying birds can fly:");
        GoodBirdExample.makeFlyableFly((GoodBirdExample.Flyable) goodSparrow);
        GoodBirdExample.makeFlyableFly((GoodBirdExample.Flyable) goodEagle);

        System.out.println("\nPenguin does what penguins do:");
        ((GoodBirdExample.Penguin) goodPenguin).swim();

        System.out.println("\nBenefits:");
        System.out.println("- Any Bird can be substituted safely");
        System.out.println("- No crashes or unexpected behavior");
        System.out.println("- Each class behaves as expected");
    }
}
