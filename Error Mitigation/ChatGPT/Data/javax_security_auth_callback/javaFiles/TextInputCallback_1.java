import javax.security.auth.callback.TextInputCallback;

public class TextInputCallback_1 {
    public static void main(String[] args) {
        TextInputCallback callback = new TextInputCallback("Enter text:");
        String retrievedText = callback.getText();
        System.out.println("Retrieved text: " + retrievedText);
    }
}
