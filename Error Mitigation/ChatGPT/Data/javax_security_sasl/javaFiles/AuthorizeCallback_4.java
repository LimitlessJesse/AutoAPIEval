import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_4 {
    public static void main(String[] args) {
        AuthorizeCallback authorizeCallback = new AuthorizeCallback("authenticationID", "authorizationID");
        authorizeCallback.setAuthorized(true);
        System.out.println("Authorization set to: " + authorizeCallback.isAuthorized());
    }
}
