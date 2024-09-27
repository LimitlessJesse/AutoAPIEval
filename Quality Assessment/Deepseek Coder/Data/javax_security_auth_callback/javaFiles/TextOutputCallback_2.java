import javax.security.auth.callback.TextOutputCallback;

public class TextOutputCallback_2 {
    public static void main(String[] args) {
        TextOutputCallback callback = new TextOutputCallback("Enter your message:", null);
        callback.setText("Hello, World!");
        System.out.println(callback.getMessage());
    }
}
