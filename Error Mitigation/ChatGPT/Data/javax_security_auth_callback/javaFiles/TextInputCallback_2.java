import javax.security.auth.callback.TextInputCallback;

public class TextInputCallback_2 {
    public static void main(String[] args) {
        TextInputCallback callback = new TextInputCallback("Enter text: ");
        callback.setText("Sample text");
        System.out.println("Text set: " + callback.getText());
    }
}
