import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_1 {
    public static void main(String[] args) {
        try {
            LoginContext lc = new LoginContext("Sample", new SampleCallbackHandler());
            lc.login();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
