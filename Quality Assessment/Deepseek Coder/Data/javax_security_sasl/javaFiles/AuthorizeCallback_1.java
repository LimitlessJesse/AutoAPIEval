import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_1 {
    public static void main(String[] args) {
        AuthorizeCallback callback = new AuthorizeCallback() {
            @Override
            public void authorize(String[] mechanisms, String authorizationID, String authzIDField, boolean validate) {
                System.out.println("Authorization ID: " + authorizationID);
            }
        };

        callback.authorize(new String[]{"PLAIN", "DIGEST-MD5"}, "12345", "Authorization ID", true);
    }
}
