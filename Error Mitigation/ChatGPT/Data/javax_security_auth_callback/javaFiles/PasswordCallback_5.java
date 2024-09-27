import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_5 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("prompt", false);
        boolean echoOn = passwordCallback.isEchoOn();
        System.out.println("Echo on: " + echoOn);
    }
}
