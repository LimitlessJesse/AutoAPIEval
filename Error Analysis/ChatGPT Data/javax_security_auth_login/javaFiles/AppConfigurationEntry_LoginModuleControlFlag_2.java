import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;

public class AppConfigurationEntry_LoginModuleControlFlag_2 {
    public static void main(String[] args) {
        LoginModuleControlFlag flag = LoginModuleControlFlag.REQUIRED;
        String flagString = flag.toString();
        System.out.println(flagString);
    }
}
