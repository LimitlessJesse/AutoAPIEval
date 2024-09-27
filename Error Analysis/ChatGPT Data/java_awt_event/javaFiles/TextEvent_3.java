import java.awt.event.TextEvent;

public class TextEvent_3 {
    public static void main(String[] args) {
        TextEvent textEvent = new TextEvent(new Object(), TextEvent.TEXT_VALUE_CHANGED);
        System.out.println(textEvent.paramString());
    }
}
