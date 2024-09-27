import javax.security.auth.callback.TextOutputCallback;

public class TextOutputCallback_2 {
    public static void main(String[] args) {
        TextOutputCallback callback = new TextOutputCallback(TextOutputCallback.INFORMATION, "This is an information message.");
        String message = callback.getMessage();
        System.out.println(message);
    }
}
