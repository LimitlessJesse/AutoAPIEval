import javax.security.auth.callback.NameCallback;

public class NameCallback_2 {
    public static void main(String[] args) {
        NameCallback nameCallback = new NameCallback("Prompt");
        nameCallback.setName("John Doe");
        System.out.println("Name set successfully: " + nameCallback.getName());
    }
}
