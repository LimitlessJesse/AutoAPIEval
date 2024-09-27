import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_1 {
    public static void main(String[] args) {
        AuthorizeCallback authCallback = new AuthorizeCallback("authenticationID", "authorizationID");
        String authorizationID = authCallback.getAuthorizationID();
        System.out.println("Authorization ID: " + authorizationID);
    }
}
