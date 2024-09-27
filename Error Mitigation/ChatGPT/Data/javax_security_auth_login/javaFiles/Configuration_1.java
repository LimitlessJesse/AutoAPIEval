import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

public class Configuration_1 {
    public static void main(String[] args) {
        Configuration config = Configuration.getConfiguration();
        AppConfigurationEntry[] entries = config.getAppConfigurationEntry("exampleName");
        
        if(entries != null) {
            for(AppConfigurationEntry entry : entries) {
                System.out.println("Login Module Class Name: " + entry.getLoginModuleName());
                System.out.println("Control Flag: " + entry.getControlFlag());
                System.out.println("Options: " + entry.getOptions());
            }
        } else {
            System.out.println("No entries found for the specified name.");
        }
    }
}
