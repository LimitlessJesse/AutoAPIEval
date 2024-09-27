import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_5 {
    public static void main(String[] args) {
        PasswordCallback pc = new PasswordCallback("prompt", false);
        String prompt = pc.getPrompt();
        System.out.println("Prompt: " + prompt);
    }
}
