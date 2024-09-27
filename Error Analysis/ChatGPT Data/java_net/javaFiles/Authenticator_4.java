import java.net.Authenticator;

public class Authenticator_4 {
    public static void main(String[] args) {
        Authenticator.setDefault(new CustomAuthenticator());
        int port = Authenticator.getRequestingPort();
        System.out.println("Requesting Port: " + port);
    }

    static class CustomAuthenticator extends Authenticator {
        @Override
        protected int getRequestingPort() {
            // Custom implementation to get the requesting port
            return super.getRequestingPort();
        }
    }
}
