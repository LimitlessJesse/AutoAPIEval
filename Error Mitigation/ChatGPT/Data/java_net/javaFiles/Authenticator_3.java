import java.net.Authenticator;

public class Authenticator_3 {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator() {
            // Override methods as needed
        };
        
        Authenticator.setDefault(authenticator);
    }
}
