import javax.security.auth.callback.ConfirmationCallback;

public class ConfirmationCallback_3 {
    public static void main(String[] args) {
        ConfirmationCallback callback = new ConfirmationCallback(ConfirmationCallback.YES_NO, ConfirmationCallback.YES);
        callback.setSelectedIndex(ConfirmationCallback.NO);
        int selectedIndex = callback.getSelectedIndex();
        System.out.println("Selected index: " + selectedIndex);
    }
}
