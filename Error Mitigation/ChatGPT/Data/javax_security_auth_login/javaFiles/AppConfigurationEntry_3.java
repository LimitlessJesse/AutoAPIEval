import javax.security.auth.login.AppConfigurationEntry;

public class AppConfigurationEntry_3 {
    public static void main(String[] args) {
        AppConfigurationEntry entry = new AppConfigurationEntry();
        String loginModuleName = entry.getLoginModuleName();
        System.out.println("Login Module Name: " + loginModuleName);
    }
}
