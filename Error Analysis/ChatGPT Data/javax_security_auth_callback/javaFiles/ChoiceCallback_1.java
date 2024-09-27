import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_1 {
    public static void main(String[] args) {
        // Create a ChoiceCallback object
        ChoiceCallback choiceCallback = new ChoiceCallback("Choose one", new String[]{"Option 1", "Option 2", "Option 3"}, 0, false);

        // Get the selected indexes from the ChoiceCallback object
        int[] selectedIndexes = choiceCallback.getSelectedIndexes();

        // Display the selected indexes
        for (int index : selectedIndexes) {
            System.out.println("Selected Index: " + index);
        }
    }
}
