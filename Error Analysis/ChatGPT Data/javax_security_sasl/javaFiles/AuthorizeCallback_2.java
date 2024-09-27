import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_2 {
    public static void main(String[] args) {
        AuthorizeCallback authorizeCallback = new AuthorizeCallback("authorization ID", "authentication ID");
        boolean authorized = authorizeCallback.isAuthorized();
        System.out.println("Is authorized: " + authorized);
    }
}
