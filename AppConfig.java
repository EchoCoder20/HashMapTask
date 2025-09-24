import java.util.HashMap;
import java.util.Map;

class AppConfig {
    /**
     * TO-DO: Merge 'updatedConfig' into 'mainConfig'.
     * If a key exists in both, the value from 'updatedConfig' should be used.
     \*
     * @param mainConfig The primary configuration map (will be modified).
     * @param updatedConfig The map with new or updated settings.
     */
    public void mergeConfigurations(Map<String, String> mainConfig, Map<String, String> updatedConfig) {
        // Your code here. Use the correct method to merge maps.

            mainConfig.putAll(updatedConfig);

    }
    public static void main(String[] args) {
        AppConfig config = new AppConfig();

        Map<String, String> mainConfig = new HashMap<>();
        mainConfig.put("theme", "light");
        mainConfig.put("language", "en");

        Map<String, String> updatedConfig = new HashMap<>();
        updatedConfig.put("language", "fr");  // overrides "en"
        updatedConfig.put("timezone", "UTC");

        config.mergeConfigurations(mainConfig, updatedConfig);

        // Print the merged configuration
        for (Map.Entry<String, String> entry : mainConfig.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}