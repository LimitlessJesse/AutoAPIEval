import javax.security.auth.callback.ConfirmationCallback;

public class ConfirmationCallback_5 {
    public static void main(String[] args) {
        ConfirmationCallback confirmationCallback = new ConfirmationCallback(ConfirmationCallback.INFORMATION, ConfirmationCallback.YES_NO_OPTION, ConfirmationCallback.YES);
        int defaultOption = confirmationCallback.getDefaultOption();
        System.out.println("Default option: " + defaultOption);
    }
}
