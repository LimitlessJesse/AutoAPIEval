import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_1 {
    public static void main(String[] args) {
        try {
            LoginContext loginContext = new LoginContext("MyLoginContext");
            loginContext.login();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
