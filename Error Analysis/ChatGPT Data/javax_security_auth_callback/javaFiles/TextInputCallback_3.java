import javax.security.auth.callback.TextInputCallback;

public class TextInputCallback_3 {
    public static void main(String[] args) {
        TextInputCallback callback = new TextInputCallback("Please enter your name: ");
        String prompt = callback.getPrompt();
        System.out.println(prompt);
    }
}
