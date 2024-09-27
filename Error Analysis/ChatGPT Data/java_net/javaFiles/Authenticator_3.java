import java.net.Authenticator;

public class Authenticator_3 {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator() {
            @Override
            protected String getRequestingHost() {
                return super.getRequestingHost();
            }
        };

        System.out.println("Requesting Host: " + authenticator.getRequestingHost());
    }
}
