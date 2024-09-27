import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_2 {
    public static void main(String[] args) {
        try {
            LoginContext lc = new LoginContext("Sample", new SampleCallbackHandler());
            lc.logout();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
