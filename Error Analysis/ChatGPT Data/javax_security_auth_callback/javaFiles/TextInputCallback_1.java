import javax.security.auth.callback.TextInputCallback;

public class TextInputCallback_1 {
    public static void main(String[] args) {
        TextInputCallback callback = new TextInputCallback("Enter text: ");
        // Assuming some text input is set for callback
        String text = callback.getText();
        System.out.println("Entered text: " + text);
    }
}
