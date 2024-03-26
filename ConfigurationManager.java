// As per the question i have also implemented singleton pattern.
class ConfigurationManager {
    private static ConfigurationManager instance;
    private ConfigurationManager() {}

    // Singleton pattern to get the instance of ConfigurationManager
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
}