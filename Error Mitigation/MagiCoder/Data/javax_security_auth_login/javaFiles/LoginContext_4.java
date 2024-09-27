import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_4 {
    public static void main(String[] args) {
        try {
            LoginContext loginContext = new LoginContext("MyLoginContext");
            loginContext.logout();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
