package template;

// Concrete ImageProcessor class extending DataProcessor
public class ImageProcessor extends DataProcessor {

    @Override
    void transformData() {
        System.out.println("Resizing and converting image format...");
    }
}
