import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_1 {
    public static void main(String[] args) {
        AuthorizeCallback callback = new AuthorizeCallback("test", "test");
        String authenticationID = callback.getAuthenticationID();
        System.out.println("Authentication ID: " + authenticationID);
    }
}
