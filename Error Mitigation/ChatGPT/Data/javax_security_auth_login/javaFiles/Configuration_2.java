import javax.security.auth.login.Configuration;

public class Configuration_2 {
    public static void main(String[] args) {
        Configuration config = Configuration.getConfiguration();
        config.refresh();
    }
}
