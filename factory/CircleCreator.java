package factory;

public class CircleCreator extends ShapeFactory {
    public Shape createShape() {
        return new Circle();
    }
}
