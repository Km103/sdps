package factory;

public class SquareCreator extends ShapeFactory {
    public Shape createShape() {
        return new Square();
    }
}
