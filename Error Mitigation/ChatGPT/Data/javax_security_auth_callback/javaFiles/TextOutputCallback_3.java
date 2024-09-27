import javax.security.auth.callback.TextOutputCallback;

public class TextOutputCallback_3 {
    public static void main(String[] args) {
        TextOutputCallback callback = new TextOutputCallback(TextOutputCallback.INFORMATION, "This is an information message");
        int messageType = callback.getMessageType();
        System.out.println("Message type: " + messageType);
    }
}
