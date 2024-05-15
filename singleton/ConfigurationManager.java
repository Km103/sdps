public class ConfigurationManager {

    private static ConfigurationManager instance;
    private final String settings;

    private ConfigurationManager(String fileName) {
        // Simulate loading settings from a file
        System.out.println("Loading configuration from: " + fileName);
        this.settings = "Loaded configuration";
    }

    public static ConfigurationManager getInstance(String fileName) {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager(fileName);
                }
            }
        }
        return instance;
    }

    public String getSettings() {
        return settings;
    }
}