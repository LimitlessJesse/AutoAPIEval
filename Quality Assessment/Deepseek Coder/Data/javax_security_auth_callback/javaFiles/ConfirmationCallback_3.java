import javax.security.auth.callback.*;

public class ConfirmationCallback_3 {
    public static void main(String[] args) {
        ConfirmationCallback callback = new ConfirmationCallback() {
            public void handle(Callback.Callback[] callbacks) throws UnsupportedCallbackException {
                for (Callback callback : callbacks) {
                    if (callback instanceof TextOutputCallback) {
                        TextOutputCallback textOutputCallback = (TextOutputCallback) callback;
                        System.out.println("Prompt: " + textOutputCallback.getPrompt());
                    } else {
                        throw new UnsupportedCallbackException(callback);
                    }
                }
            }
        };

        TextOutputCallback textOutputCallback = new TextOutputCallback("Are you sure?", null);
        callback.handle(new Callback[] { textOutputCallback });
    }
}
