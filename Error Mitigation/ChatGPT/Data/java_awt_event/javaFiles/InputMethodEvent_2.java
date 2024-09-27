import java.awt.event.InputMethodEvent;
import java.awt.font.TextHitInfo;

public class InputMethodEvent_2 {
    public static void main(String[] args) {
        InputMethodEvent event = new InputMethodEvent(null, 0, null, TextHitInfo.leading(5), TextHitInfo.trailing(10));
        TextHitInfo caret = event.getCaret();
        System.out.println("Caret: " + caret);
    }
}
