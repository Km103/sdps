package template;

public class DataProcessingTest {

    public static void main(String[] args) {
        DataProcessor imageProcessor = new ImageProcessor();
        imageProcessor.processData("image.jpg");

        System.out.println("\n");

        DataProcessor textProcessor = new TextProcessor();
        textProcessor.processData("This is some text data.");
    }
}
