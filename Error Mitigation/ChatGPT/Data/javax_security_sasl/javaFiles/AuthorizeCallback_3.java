import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_3 {
    public static void main(String[] args) {
        AuthorizeCallback callback = new AuthorizeCallback("authenticationId", "authorizationId");
        boolean authorized = callback.isAuthorized();
        System.out.println("Is authorized: " + authorized);
    }
}
