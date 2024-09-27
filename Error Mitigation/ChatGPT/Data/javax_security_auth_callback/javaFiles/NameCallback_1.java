import javax.security.auth.callback.NameCallback;

public class NameCallback_1 {
    public static void main(String[] args) {
        NameCallback nameCallback = new NameCallback("Please enter your name: ");
        String retrievedName = nameCallback.getName();
        System.out.println("Retrieved name: " + retrievedName);
    }
}
