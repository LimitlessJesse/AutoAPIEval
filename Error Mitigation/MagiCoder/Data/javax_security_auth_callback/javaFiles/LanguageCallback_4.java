import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.LanguageCallback;
import java.util.Locale;

public class LanguageCallback_4 {
    public static void main(String[] args) {
        CallbackHandler handler = new CallbackHandler() {
            @Override
            public void handle(java.security.auth.callback.Callback[] callbacks) {
                for (java.security.auth.callback.Callback callback : callbacks) {
                    if (callback instanceof LanguageCallback) {
                        LanguageCallback languageCallback = (LanguageCallback) callback;
                        languageCallback.setLocale(Locale.getDefault());
                    }
                }
            }
        };

        // Use the handler...
    }
}
