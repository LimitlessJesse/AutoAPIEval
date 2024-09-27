import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_2 {
    public static void main(String[] args) {
        ChoiceCallback choiceCallback = new ChoiceCallback("Are you sure?", new String[]{"Yes", "No"});
        String[] choices = choiceCallback.getChoices();

        for (String choice : choices) {
            System.out.println(choice);
        }
    }
}
