import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_5 {
    public static void main(String[] args) {
        AuthorizeCallback authorizeCallback = new AuthorizeCallback("test", "test");
        authorizeCallback.setAuthorizedID("authorizedId");
        System.out.println("Authorized ID set successfully: " + authorizeCallback.getAuthorizedID());
    }
}
