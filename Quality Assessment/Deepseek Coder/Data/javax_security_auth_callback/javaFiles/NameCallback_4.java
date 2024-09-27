import javax.security.auth.callback.NameCallback;

public class NameCallback_4 {
    public static void main(String[] args) {
        NameCallback callback = new NameCallback("prompt");
        String prompt = callback.getPrompt();
        System.out.println("Prompt: " + prompt);
    }
}
