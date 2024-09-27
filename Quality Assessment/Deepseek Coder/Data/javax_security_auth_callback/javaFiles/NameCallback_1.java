import javax.security.auth.callback.NameCallback;

public class NameCallback_1 {
    public static void main(String[] args) {
        NameCallback nameCallback = new NameCallback("prompt");
        nameCallback.setName("name");
        System.out.println("Name: " + nameCallback.getName());
    }
}
