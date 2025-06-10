package solid.ocp.good;
// OCPShapeExample.java

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

class ShapeDrawer {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

public class GoodShapeExample {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();

        drawer.drawShape(new Circle());
        drawer.drawShape(new Rectangle());
        drawer.drawShape(new Triangle());
    }
}
