import javax.security.auth.callback.ConfirmationCallback;

public class ConfirmationCallback_1 {
    public static void main(String[] args) {
        ConfirmationCallback callback = new ConfirmationCallback(ConfirmationCallback.YES_NO_CANCEL, ConfirmationCallback.YES);
        int selectedIndex = callback.getSelectedIndex();
        System.out.println("Selected Index: " + selectedIndex);
    }
}
