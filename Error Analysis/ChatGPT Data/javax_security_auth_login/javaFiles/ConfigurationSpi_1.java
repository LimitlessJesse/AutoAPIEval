import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.ConfigurationSpi;

public class ConfigurationSpi_1 {
    public static void main(String[] args) {
        String name = "exampleName";
        ConfigurationSpi configSpi = new CustomConfigurationSpi(); // CustomConfigurationSpi should extend ConfigurationSpi
        AppConfigurationEntry[] entries = configSpi.engineGetAppConfigurationEntry(name);

        for (AppConfigurationEntry entry : entries) {
            System.out.println("LoginModuleName: " + entry.getLoginModuleName());
            System.out.println("ControlFlag: " + entry.getControlFlag());
            System.out.println("Options: " + entry.getOptions());
        }
    }
}
