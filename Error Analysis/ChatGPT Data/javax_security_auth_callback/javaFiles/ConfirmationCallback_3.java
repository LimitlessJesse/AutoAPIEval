import javax.security.auth.callback.ConfirmationCallback;

public class ConfirmationCallback_3 {
    public static void main(String[] args) {

        ConfirmationCallback confirmationCallback = new ConfirmationCallback(ConfirmationCallback.INFORMATION, ConfirmationCallback.YES_NO_OPTION, ConfirmationCallback.YES);
        int selectedIndex = confirmationCallback.getSelectedIndex();
        System.out.println("Selected Index: " + selectedIndex);
    }
}
