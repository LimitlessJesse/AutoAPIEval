import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_1 {
    public static void main(String[] args) {
        PasswordCallback callback = new PasswordCallback("Enter password", false);
        callback.setPassword("myPassword".toCharArray());
        System.out.println(new String(callback.getPassword()));
    }
}
