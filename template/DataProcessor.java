package template;

public abstract class DataProcessor {

    public final void processData(String data) {
        cleanData(data);
        transformData();
        validateData();
        storeData();
    }

    // Template methods to be implemented by subclasses
    abstract void transformData();

    // Default implementations
    void cleanData(String data) {
        System.out.println("Cleaning data: " + data);
    }

    void validateData() {
        System.out.println("Validating data...");
    }

    void storeData() {
        System.out.println("Storing data...");
    }
}
