public class Main {

    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance("config.txt");
        System.out.println(config.getSettings());

        // Trying to create another instance with a different filename (returns the same
        // one)
        ConfigurationManager anotherConfig = ConfigurationManager.getInstance("settings.properties");
        if (config == anotherConfig) {
            System.out.println("It's the same instance!");
        }
    }

}
