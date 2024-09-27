import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_3 {
    public static void main(String[] args) {
        ChoiceCallback callback = new ChoiceCallback("Choose an option:", new String[]{"Option 1", "Option 2"}, 0, false);
        int[] selectedIndexes = {1};
        callback.setSelectedIndexes(selectedIndexes);
    }
}
