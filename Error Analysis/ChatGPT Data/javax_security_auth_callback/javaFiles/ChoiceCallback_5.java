import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_5 {
    public static void main(String[] args) {
        ChoiceCallback callback = new ChoiceCallback("Choose an option", new String[]{"Option 1", "Option 2"}, 0, false);
        String prompt = callback.getPrompt();

        System.out.println("Prompt: " + prompt);
    }
}
