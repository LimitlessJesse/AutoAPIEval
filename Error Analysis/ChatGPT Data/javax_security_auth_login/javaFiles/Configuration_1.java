import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

public class Configuration_1 {
    public static void main(String[] args) {
        Configuration config = Configuration.getConfiguration();
        AppConfigurationEntry[] entries = config.getAppConfigurationEntry("exampleName");
        
        if (entries != null) {
            for (AppConfigurationEntry entry : entries) {
                System.out.println("LoginModule Class Name: " + entry.getLoginModuleName());
                System.out.println("Control Flag: " + entry.getControlFlag());
                
                // Additional properties retrieval if needed
                for (String key : entry.getOptions().keySet()) {
                    System.out.println("Property Key: " + key);
                    System.out.println("Property Value: " + entry.getOptions().get(key));
                }
            }
        } else {
            System.out.println("No configuration entries found for the specified name.");
        }
    }
}
