import java.awt.event.FocusEvent;

public class FocusEvent_4 {
    public static void main(String[] args) {
        FocusEvent focusEvent = new FocusEvent(null, FocusEvent.FOCUS_GAINED);
        String paramString = focusEvent.paramString();
        System.out.println(paramString);
    }
}
