import java.net.Authenticator;

public class Authenticator_5 {
    public static void main(String[] args) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected String getRequestingPrompt() {
                return "Please enter your username and password";
            }
        });
    }
}
