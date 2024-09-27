import java.awt.event.InputMethodEvent;

public class InputMethodEvent_4 {
    public static void main(String[] args) {
        InputMethodEvent event = new InputMethodEvent(null, 0, null, 0, null, null, 0);
        int committedCharCount = event.getCommittedCharacterCount();
        System.out.println("Committed character count: " + committedCharCount);
    }
}
