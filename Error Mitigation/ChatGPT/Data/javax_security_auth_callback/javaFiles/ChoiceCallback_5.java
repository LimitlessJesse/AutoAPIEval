import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_5 {
    public static void main(String[] args) {
        ChoiceCallback callback = new ChoiceCallback("Choose an option", new String[]{"Option 1", "Option 2"}, 0, true);
        boolean allowMultipleSelections = callback.allowMultipleSelections();
        System.out.println("Allow multiple selections: " + allowMultipleSelections);
    }
}
