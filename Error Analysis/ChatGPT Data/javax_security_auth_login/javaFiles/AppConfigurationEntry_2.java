import javax.security.auth.login.AppConfigurationEntry;

public class AppConfigurationEntry_2 {
    public static void main(String[] args) {
        AppConfigurationEntry entry = new AppConfigurationEntry("exampleModuleName", AppConfigurationEntry.LoginModuleControlFlag.REQUIRED, null);
        String loginModuleName = entry.getLoginModuleName();
        System.out.println("Login module name: " + loginModuleName);
    }
}
