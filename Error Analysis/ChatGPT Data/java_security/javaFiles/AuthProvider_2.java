import java.security.AuthProvider;

public class AuthProvider_2 {
    public static void main(String[] args) {
        AuthProvider provider = new ExampleAuthProvider();
        provider.logout();
    }
}

class ExampleAuthProvider extends AuthProvider {
    @Override
    public void logout() {
        // Implement logout functionality
        System.out.println("Logged out successfully");
    }
}
