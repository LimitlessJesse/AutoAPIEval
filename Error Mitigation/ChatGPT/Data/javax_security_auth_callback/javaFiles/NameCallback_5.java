import javax.security.auth.callback.NameCallback;

public class NameCallback_5 {
    public static void main(String[] args) {
        NameCallback nameCallback = new NameCallback("prompt");
        String defaultName = nameCallback.getDefaultName();
        System.out.println("Default name: " + defaultName);
    }
}
