import javax.security.auth.callback.TextInputCallback;

public class TextInputCallback_2 {
    public static void main(String[] args) {
        TextInputCallback callback = new TextInputCallback("Enter your username:", "username", false);
        String prompt = callback.getPrompt();
        System.out.println(prompt);
    }
}
