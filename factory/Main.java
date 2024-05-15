package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory CircleCreator = new CircleCreator();
        ShapeFactory SquareCreator = new SquareCreator();
        // Get an object of Circle and call its draw method
        Shape shape1 = CircleCreator.createShape();
        shape1.draw();

        // Get an object of Square and call its draw method
        Shape shape2 = SquareCreator.createShape();
        shape2.draw();

    }
}
