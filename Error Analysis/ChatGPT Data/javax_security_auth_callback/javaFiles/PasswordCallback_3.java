import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_3 {
    public static void main(String[] args) {
        PasswordCallback callback = new PasswordCallback("Enter password: ", false);
        boolean isEchoOn = callback.isEchoOn();
        System.out.println("Is password echoing enabled? " + isEchoOn);
    }
}
