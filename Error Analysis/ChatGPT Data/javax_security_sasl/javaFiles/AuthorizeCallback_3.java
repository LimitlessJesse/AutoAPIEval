import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_3 {
    public static void main(String[] args) {
        AuthorizeCallback authorizeCallback = new AuthorizeCallback("AuthorizeCallback", "Client");
        authorizeCallback.setAuthorized(true);
        boolean isAuthorized = authorizeCallback.isAuthorized();
        System.out.println("Is authorized: " + isAuthorized);
    }
}
