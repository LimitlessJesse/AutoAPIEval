import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_4 {
    public static void main(String[] args) {
        AuthorizeCallback callback = new AuthorizeCallback("Authorization ID", "Authentication ID");
        String authorizedID = callback.getAuthorizedID();
        System.out.println("Authorized ID: " + authorizedID);
    }
}
