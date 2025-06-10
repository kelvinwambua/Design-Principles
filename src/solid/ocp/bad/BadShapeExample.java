package solid.ocp.bad;

// BadShapeExample.java

class ShapeDrawer {
    public void draw(String shapeType) {
        if (shapeType.equals("circle")) {
            System.out.println("Drawing a Circle.");
        } else if (shapeType.equals("rectangle")) {
            System.out.println("Drawing a Rectangle.");
        } else if (shapeType.equals("triangle")) {
            System.out.println("Drawing a Triangle.");
        } else {
            System.out.println("Unknown shape.");
        }
    }
}

public class BadShapeExample {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();

        drawer.draw("circle");
        drawer.draw("rectangle");
        drawer.draw("triangle");  // Required a code change to support
        drawer.draw("hexagon");   // Will return "Unknown shape."
    }
}


