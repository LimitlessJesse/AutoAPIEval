import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_3 {
    public static void main(String[] args) {
        ChoiceCallback choiceCallback = new ChoiceCallback("Select an option", new String[]{"Option 1", "Option 2"}, 0, false);
        choiceCallback.setSelectedIndex(1);
        int selectedIndex = choiceCallback.getSelectedIndex();
        System.out.println("Selected index: " + selectedIndex);
    }
}
