import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_2 {
    public static void main(String[] args) {
        AuthorizeCallback callback = new AuthorizeCallback("authenticationId", "authorizationId");
        String authorizationId = callback.getAuthorizationID();
        System.out.println("Authorization ID: " + authorizationId);
    }
}
