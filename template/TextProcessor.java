package template;

// Concrete TextProcessor class extending DataProcessor
class TextProcessor extends DataProcessor {

    @Override
    void transformData() {
        System.out.println("Cleaning and lowercasing text...");
    }

    @Override
    void validateData() {
        System.out.println("Validating text content...");
    }
}
