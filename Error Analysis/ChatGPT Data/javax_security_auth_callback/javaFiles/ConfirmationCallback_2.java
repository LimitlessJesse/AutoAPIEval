import javax.security.auth.callback.ConfirmationCallback;

public class ConfirmationCallback_2 {
    public static void main(String[] args) {
        ConfirmationCallback confirmationCallback = new ConfirmationCallback(ConfirmationCallback.INFORMATION, ConfirmationCallback.YES_NO_CANCEL, ConfirmationCallback.YES);
        
        // Set selected index to NO
        confirmationCallback.setSelectedIndex(1);
        System.out.println("Selected index: " + confirmationCallback.getSelectedIndex()); // Output: 1
    }
}
