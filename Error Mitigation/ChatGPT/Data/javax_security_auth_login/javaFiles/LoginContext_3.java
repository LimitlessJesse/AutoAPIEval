import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;

public class LoginContext_3 {
    public static void main(String[] args) {
        LoginContext loginContext = new LoginContext("Sample", new SampleCallbackHandler());
        try {
            loginContext.login();
            Subject subject = loginContext.getSubject();
            System.out.println("Authenticated Subject: " + subject);
        } catch (Exception e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}
